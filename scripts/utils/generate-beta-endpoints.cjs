// @ts-check
//
// Generates the runtime beta-endpoint registry for the Java/Kotlin SDK.
//
// Mirrors the TypeScript/Python `generate-beta-endpoints.cjs` scripts: it scans
// the generated service code for methods marked [BETA] and emits a registry of
// path pattern -> "ServiceName.methodName" used by BetaWarning.checkBetaEndpoint
// at request time.
//
// Java differs from TS/Py in one way: the [BETA] KDoc marker lives on the
// service *interface*, while the URL path lives in the *Impl* (as an
// addPathSegments(...) call). So we read the interface to learn which methods
// are beta, then read the sibling Impl to learn each method's path segments.
// Only the blocking services are scanned (the async services resolve to the
// same paths, and one registry entry per path is enough).
//
// Paths are stored as segment patterns: a string is a literal match and `null`
// is a wildcard matching any single path-parameter segment (the runtime path
// has the parameter value substituted in, so it can't be matched literally).

const fs = require('fs');
const path = require('path');

const coreDir = path.resolve(
  __dirname,
  '..',
  '..',
  'hiddenlayer-java-core',
  'src',
  'main',
  'kotlin',
  'com',
  'hiddenlayer',
  'api',
);
const servicesDir = path.join(coreDir, 'services', 'blocking');
const outputFile = path.join(coreDir, 'lib', 'BetaEndpoints.kt');

/** Recursively yield file paths under `dir`. */
async function* walk(dir) {
  for await (const d of await fs.promises.opendir(dir)) {
    const entry = path.join(dir, d.name);
    if (d.isDirectory()) yield* walk(entry);
    else if (d.isFile()) yield entry;
  }
}

/**
 * Scan a service *interface* file for methods whose KDoc contains [BETA].
 * Mirrors patch-beta-warnings.cjs: a method is beta if its own KDoc has [BETA]
 * or its KDoc is an `@see` reference to a beta method (the overload pattern).
 * @param {string} content
 * @returns {Set<string>}
 */
function findBetaMethods(content) {
  const betaMethods = new Set();
  const methodPattern = /(\/\*\*[\s\S]*?\*\/)\s+(?:@\w+(?:\([^)]*\))?\s+)*fun\s+(\w+)\s*\(/g;
  let match;
  while ((match = methodPattern.exec(content)) !== null) {
    if (match[1].includes('[BETA]')) betaMethods.add(match[2]);
  }
  // Resolve @see overloads that reference a beta method.
  methodPattern.lastIndex = 0;
  while ((match = methodPattern.exec(content)) !== null) {
    const see = match[1].match(/@see\s+(\w+)/);
    if (see && betaMethods.has(see[1])) betaMethods.add(match[2]);
  }
  return betaMethods;
}

/**
 * Read the balanced-paren argument string of the first `.addPathSegments(...)`
 * call at or after `fromIndex`. Returns null if none.
 * @param {string} source
 * @param {number} fromIndex
 * @returns {{ args: string, end: number } | null}
 */
function readAddPathSegments(source, fromIndex) {
  const marker = '.addPathSegments(';
  const start = source.indexOf(marker, fromIndex);
  if (start === -1) return null;
  const open = start + marker.length - 1; // index of '('
  let depth = 0;
  for (let i = open; i < source.length; i++) {
    if (source[i] === '(') depth++;
    else if (source[i] === ')') {
      depth--;
      if (depth === 0) return { args: source.slice(open + 1, i), end: i };
    }
  }
  return null;
}

/**
 * Parse addPathSegments(...) arguments into a segment pattern. A string-literal
 * argument becomes its value; any other argument (e.g. params._pathParam(0)) is
 * a path parameter and becomes `null` (a wildcard).
 * @param {string} args
 * @returns {Array<string | null>}
 */
function parseSegments(args) {
  return splitTopLevel(args)
    .map((a) => a.trim())
    .filter((a) => a.length > 0)
    .map((a) => {
      const literal = a.match(/^"([^"]*)"$/);
      return literal ? literal[1] : null;
    });
}

/** Split on commas that are not nested inside parentheses. */
function splitTopLevel(s) {
  const parts = [];
  let depth = 0;
  let current = '';
  for (const ch of s) {
    if (ch === '(') depth++;
    else if (ch === ')') depth--;
    if (ch === ',' && depth === 0) {
      parts.push(current);
      current = '';
    } else {
      current += ch;
    }
  }
  if (current.trim().length > 0) parts.push(current);
  return parts;
}

/**
 * Extract method -> segment pattern for each method in an Impl file. Each
 * `override fun` is bounded by the next `override fun` so its addPathSegments
 * (in the WithRawResponseImpl variant) is attributed to the right method.
 * @param {string} content
 * @returns {Array<{ method: string, segments: Array<string | null> }>}
 */
function extractImplPaths(content) {
  const results = [];
  const methodPattern = /override\s+fun\s+(\w+)\s*\(/g;
  const matches = [];
  let m;
  while ((m = methodPattern.exec(content)) !== null) {
    matches.push({ name: m[1], index: m.index });
  }
  for (let i = 0; i < matches.length; i++) {
    const bodyEnd = i + 1 < matches.length ? matches[i + 1].index : content.length;
    const found = readAddPathSegments(content, matches[i].index);
    if (!found || found.end > bodyEnd) continue;
    results.push({ method: matches[i].name, segments: parseSegments(found.args) });
  }
  return results;
}

/** @param {Array<string | null>} segments */
function segmentsKey(segments) {
  return segments.map((s) => (s === null ? '*' : s)).join('/');
}

async function main() {
  /** @type {Map<string, { segments: Array<string | null>, method: string }>} */
  const registry = new Map();

  for await (const file of walk(servicesDir)) {
    if (!file.endsWith('Impl.kt')) continue;
    const implContent = await fs.promises.readFile(file, 'utf8');
    const implClass = implContent.match(/\bclass\s+(\w+Service)Impl\b/);
    if (!implClass) continue;
    const serviceName = implClass[1];

    const interfaceFile = path.join(path.dirname(file), `${serviceName}.kt`);
    if (!fs.existsSync(interfaceFile)) continue;
    const betaMethods = findBetaMethods(await fs.promises.readFile(interfaceFile, 'utf8'));
    if (betaMethods.size === 0) continue;

    for (const { method, segments } of extractImplPaths(implContent)) {
      if (segments.length > 0 && betaMethods.has(method)) {
        registry.set(segmentsKey(segments), { segments, method: `${serviceName}.${method}` });
      }
    }
  }

  const entries = [...registry.values()].sort((a, b) =>
    segmentsKey(a.segments).localeCompare(segmentsKey(b.segments)),
  );

  const rows = entries.map((e) => {
    const segs = e.segments.map((s) => (s === null ? 'null' : `"${s}"`)).join(', ');
    return `            listOf<String?>(${segs}) to "${e.method}",`;
  });

  const output = `// File generated by scripts/utils/generate-beta-endpoints.cjs. DO NOT EDIT.

package com.hiddenlayer.api.lib

/**
 * Auto-generated registry of beta endpoints.
 *
 * Each entry maps a path pattern to a qualified method name. A pattern segment
 * is either a literal string or \`null\`, a wildcard matching any single
 * path-parameter segment. Regenerate with
 * \`node scripts/utils/generate-beta-endpoints.cjs\`.
 */
internal object BetaEndpoints {

    @JvmField
    val REGISTRY: List<Pair<List<String?>, String>> =
        listOf(
${rows.join('\n')}
        )
}
`;

  await fs.promises.writeFile(outputFile, output, 'utf8');
  console.log(`Wrote ${entries.length} beta endpoint(s) to ${path.relative(process.cwd(), outputFile)}`);
  for (const e of entries) console.log(`  /${segmentsKey(e.segments)} -> ${e.method}`);
}

main().catch((err) => {
  console.error(err);
  process.exit(1);
});
