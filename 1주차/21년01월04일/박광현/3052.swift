
var n = Set<Int>()
for _ in 0...9 {
    n.insert(Int(readLine()!)!%42)
}
print(n.count)
