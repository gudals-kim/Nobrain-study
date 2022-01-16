const input = require("fs").readFileSync("/dev/stdin").toString().split(" ");

const a = Number(input);

if (a % 400 === 0) {
    console.log("1");
} else if (a % 4 === 0 && a % 100 !== 0) {
    console.log("1");
} else {
    console.log("0");
}