
var N = 1
var dic = [Int](repeating: 0, count: 10)
//a x b x c 의 결과를 받을 숫자는 N 변수 각 자리의 숫자의 0~9 빈도수를 카운팅할 배열dic선언

(0..<3).forEach { _ in
N *= Int(readLine()!)!
}
// 숫자를 3행에 걸쳐서 3번 입력받아야하기 떄문에 3번 반복하는 반복문을 (0..<3).forEach { _ in } 으로 표현

while N > 0 {
let rem = N % 10
dic[rem] += 1
N /= 10
}
곱의결과인 N 숫자를 한자리 한자리 보면서 해당 값을 배열의 첨자 인덱스로 사용해서 카운팅함

dic.forEach { print($0) }
//dic배열은 10크기를 갖고있다 해당 배열의 값을 forEach 순회를 통해 순차적으로 출력한다 
