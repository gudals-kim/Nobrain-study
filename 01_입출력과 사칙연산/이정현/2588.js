const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const a = input[0];
const b = input[1];

const oneNum = Math.floor(b % 10);
const tenNum = Math.floor((b % 100) / 10);
const hundredNum = Math.floor(b / 100);

console.log(a*oneNum);
console.log(a*tenNum);
console.log(a*hundredNum);
console.log(a*b);