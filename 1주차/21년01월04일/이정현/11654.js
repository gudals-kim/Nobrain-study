const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('');

const str = input.toString();
result = str.charCodeAt(0);

console.log(result);