
import Foundation

while let input = readLine() {
    let split = input.components(separatedBy: " ")
    print(Int(split[0])! + Int(split[1])!)
}
