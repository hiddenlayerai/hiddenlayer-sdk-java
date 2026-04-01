// @ts-check
const fs = require('fs');
const path = require('path');

const coreDir = path.resolve(
  __dirname,
  '..',
  'hiddenlayer-java-core',
  'src',
  'main',
  'kotlin',
  'com',
  'hiddenlayer',
  'api',
);
const servicesDir = path.join(coreDir, 'services');

/**
 * Recursively walk a directory yielding file paths.
 */
async function* walk(dir) {
  for await (const d of await fs.promises.opendir(dir)) {
    const entry = path.join(dir, d.name);
    if (d.isDirectory()) yield* walk(entry);
    else if (d.isFile()) yield entry;
  }
}

/**
 * Extract the interface/class name from a Kotlin service file.
 * Matches: "interface FooService" or "class FooServiceImpl"
 */
function extractTypeName(content) {
  const match = content.match(/(?:interface|class)\s+(\w+Service\w*)/);
  return match ? match[1] : null;
}

/**
 * Scan an interface file for methods whose KDoc contains [BETA].
 * Returns a Set of method names that are beta.
 *
 * KDoc pattern: /** [BETA] ... * / followed by fun methodName(
 * Overloads use /** @see methodName * / — we track these too.
 */
function findBetaMethods(content) {
  const betaMethods = new Set();

  // Find methods with [BETA] in their KDoc
  const kdocMethodPattern = /(\/\*\*[\s\S]*?\*\/)\s+(?:@\w+\s+)*fun\s+(\w+)\s*\(/g;
  let match;
  while ((match = kdocMethodPattern.exec(content)) !== null) {
    const kdoc = match[1];
    const methodName = match[2];
    if (kdoc.includes('[BETA]')) {
      betaMethods.add(methodName);
    }
  }

  return betaMethods;
}

// ─── Interface patching ───────────────────────────────────────────────

/**
 * Patch an interface file: add @BetaApi annotation to beta methods and their
 * @see overloads.
 */
function patchInterface(content, betaMethods) {
  if (betaMethods.size === 0) return null;

  const edits = [];

  // Find all method declarations (with optional annotations before them)
  // Pattern: optional KDoc, optional annotations, fun methodName(
  const methodDeclPattern =
    /(\/\*\*[\s\S]*?\*\/)\s+((?:@\w+(?:\([^)]*\))?\s+)*)fun\s+(\w+)\s*\(/g;
  let match;
  while ((match = methodDeclPattern.exec(content)) !== null) {
    const kdoc = match[1];
    const annotations = match[2];
    const methodName = match[3];

    // Skip withRawResponse, withOptions, and non-API methods
    if (methodName === 'withRawResponse' || methodName === 'withOptions') continue;

    // Check if this method is beta (directly or via @see)
    const isBetaDirect = kdoc.includes('[BETA]') && betaMethods.has(methodName);
    const isBetaSee = kdoc.includes('@see') && isSeeRefToBeta(kdoc, betaMethods);

    if ((isBetaDirect || isBetaSee) && !annotations.includes('@BetaApi')) {
      // Insert @BetaApi before 'fun'
      const funIndex = content.indexOf('fun ' + methodName, match.index + kdoc.length);
      if (funIndex !== -1) {
        // Find start of the line with 'fun'
        const lineStart = content.lastIndexOf('\n', funIndex) + 1;
        const indent = content.slice(lineStart, funIndex).match(/^(\s*)/)[1];
        edits.push({
          index: funIndex,
          text: '@BetaApi\n' + indent,
        });
      }
    }
  }

  if (edits.length === 0) return null;

  // Apply edits bottom-up
  edits.sort((a, b) => b.index - a.index);
  let modified = content;
  for (const edit of edits) {
    modified = modified.slice(0, edit.index) + edit.text + modified.slice(edit.index);
  }

  // Manage import
  modified = manageImport(modified, 'import com.hiddenlayer.api.lib.BetaApi');

  return modified !== content ? modified : null;
}

/**
 * Check if a @see KDoc refers to a beta method.
 */
function isSeeRefToBeta(kdoc, betaMethods) {
  const seeMatch = kdoc.match(/@see\s+(\w+)/);
  return seeMatch ? betaMethods.has(seeMatch[1]) : false;
}

// ─── Import management ────────────────────────────────────────────────

function manageImport(content, importStatement) {
  if (content.includes(importStatement)) return content;

  // Find last import line
  const importPattern = /^import\s.+$/gm;
  let lastIndex = -1;
  let m;
  while ((m = importPattern.exec(content)) !== null) {
    lastIndex = m.index + m[0].length;
  }

  if (lastIndex !== -1) {
    return (
      content.slice(0, lastIndex) +
      '\n' +
      importStatement +
      content.slice(lastIndex)
    );
  }
  return content;
}

// ─── Main ─────────────────────────────────────────────────────────────

async function main() {
  let patchedCount = 0;

  for await (const filePath of walk(servicesDir)) {
    if (!filePath.endsWith('.kt')) continue;

    // Only process interface files (not Impl files)
    const basename = path.basename(filePath, '.kt');
    if (basename.endsWith('Impl')) continue;
    if (!basename.endsWith('Service') && !basename.endsWith('ServiceAsync'))
      continue;

    const content = await fs.promises.readFile(filePath, 'utf8');

    // Must be an interface
    if (!content.includes('interface ')) continue;

    const typeName = extractTypeName(content);
    if (!typeName) continue;

    const betaMethods = findBetaMethods(content);

    // Patch the interface file
    const patchedInterface = patchInterface(content, betaMethods);
    if (patchedInterface !== null) {
      await fs.promises.writeFile(filePath, patchedInterface, 'utf8');
      console.log(`patched ${path.relative(process.cwd(), filePath)}`);
      patchedCount++;
    }
  }

  console.log(`\n${patchedCount} file(s) patched.`);
}

main().catch((err) => {
  console.error(err);
  process.exit(1);
});
