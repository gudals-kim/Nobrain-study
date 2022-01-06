
var a = 0
while true {

    var input1 = readLine()!
    var arr = input1.split(separator: " ")
    var a = Int(arr[0])!
    var b = Int(arr[1])!
    if a == 0 && b == 0 {
        break
    }
    print(a+b)
}
