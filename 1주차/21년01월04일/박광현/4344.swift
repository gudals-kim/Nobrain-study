
import Foundation

let input = Int(readLine()!)!

for i in 1...input {
    var line = readLine()!.split(separator: " ").map{Float($0)!}
    var std = line.removeFirst()
    var average = line.reduce(0){$0 + $1} / std
    var hiav = line.filter{ $0>average }.count
    var result = round(1000 * Float(hiav) / std * 100) / 1000
    var result3f = String(format: "%.3f", result)
    print("\(result3f)%")
}
