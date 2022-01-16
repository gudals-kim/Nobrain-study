const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for (let i = 1; i <= input[0]; i++) {
    const number = input[i].split(' ');

    const num1 = Number(number[0]);
    const num2 = Number(number[1]);

    console.log(`Case #${i}: ${num1} + ${num2} = ${num1 + num2}`);
}