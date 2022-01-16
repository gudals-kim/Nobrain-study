let input = require('fs').readFileSync('/dev/stdin').toString().toLowerCase();

const result = new Array(26).fill(0);

for (let i = 0; i < input.length; i++) {
  result[input.charCodeAt(i) - 97] ++;
}

const max = Math.max(...result);
const index = result.indexOf(max);
let same = false;

for (let j = 0; j < 26; j++) {
  if (result[j] === max && index != j) {
    same = true;
    break;
  }
}
console.log(same ? "?" : String.fromCharCode(index + 65));