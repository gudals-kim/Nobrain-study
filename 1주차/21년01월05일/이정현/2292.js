const input = require('fs').readFileSync('/dev/stdin');

let ran = 1, ber = 1;

while (ber < input) {
	ber += 6 * ran;
	ran++;
}

console.log(ran);