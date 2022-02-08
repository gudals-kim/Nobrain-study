let input = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(x=> Number(x));

let max = input[0];
let maxnum = 0;

for (let i = 1; i < 9; i++) {
    if (max < input[i]) {
        max = input[i];
        maxnum = i;
    }
}

console.log(max);
console.log(maxnum + 1);