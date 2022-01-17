
import Foundation
let arr = readLine()!.components(separatedBy: " ").map{ Double($0)! }
print(arr[0] / arr[1])
