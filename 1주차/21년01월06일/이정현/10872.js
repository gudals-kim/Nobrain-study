const input = require('fs').readFileSync('/dev/stdin').toString();
function fac(num) {
    if (num <= 1) {
        return 1;
    }
    return num * fac(num - 1);
}
console.log(fac(input));