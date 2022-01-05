
let adrresX = readLine()!
let adrresY = readLine()!
let x = Int(adrresX)!
let y = Int(adrresY)!

if x > 0 && y > 0 {
    print("1")
} else if x > 0 && y < 0 {
    print("4")
} else if x < 0 && y > 0 {
    print("2")
} else if x < 0 && y < 0 {
    print("3")
}
