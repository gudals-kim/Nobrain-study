const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split(" ");
const x = Number(input[0]);
const y = Number(input[1]);
const z = Number(input[2]);
const a = Number(input[3]);

const array = [x, z-x, y, a-y];
const answer = Math.min(...array);
console.log(answer);