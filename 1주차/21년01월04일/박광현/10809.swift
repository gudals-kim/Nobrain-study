
import Foundation
let s = String(readLine()!)

for i in Character("a").asciiValue!...Character("z").asciiValue! {
    if let range = s.range(of:String(UnicodeScalar(i))) {
        let s = s.distance(from: s.startIndex, to: range.lowerBound)
        print("\(s)",terminator: " ")
    }else{
        print("-1", terminator: " ")
    }
}
print("")
