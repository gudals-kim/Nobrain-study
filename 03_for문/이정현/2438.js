let input = require('fs').readFileSync('/dev/stdin').toString();

let b = "";

for (let i = 0; i < input; i++) {
    b += "*"
    console.log(b);
}