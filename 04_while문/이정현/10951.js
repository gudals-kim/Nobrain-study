const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for (let i = 0; i < input.length - 1; i++) {
    let number = input[i].split(' ');

    console.log(Number(number[0]) + Number(number[1]));
}