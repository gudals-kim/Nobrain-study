
var line = readLine()!
let i = Int(line)!

for m in 1...i {
    line = readLine()!
    let lineArr = line.split(separator: " ")
    let a = Int(lineArr[0])!
    let b = Int(lineArr[1])!
    print("Case #\(m): \(a) + \(b) = \(a + b)")
}
