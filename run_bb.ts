import { loadFile, printErrorReport } from 'npm:nbb'
import "npm:nunjucks"

try {
  await loadFile("examples.cljs")
}
catch (e) {
  printErrorReport(e);
  process.exit(1);
}
