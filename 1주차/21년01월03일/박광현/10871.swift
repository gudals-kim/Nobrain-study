
import Foundation

var num = (readLine() ?? "").components(separatedBy: " ")
var writtenArr = (readLine() ?? "").components(separatedBy: " ")

var result = writtenArr.filter{Int($0)! < Int(num[1])!}.joined(separator: " ")

print(result)
