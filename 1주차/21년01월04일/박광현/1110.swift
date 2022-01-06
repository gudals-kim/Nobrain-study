
let N = Inh(readLine()!)!
var count = 0

var num = N
while ture {
var nextNum = 0
//leftNum : 주어진 수의 가장 오른쪽 자리수
let leftNum = num % 10
while num > 0 {
//현재 숫자의 각 자리수를 더한 값은 nextNum에 넣는다
nextNum += num % 10
num /= 10
}
//한 사이클 돌았으므로 count 증가
count += 1
//rightNum : 앞에서 구한 합의 가장 오른쪽 자리수
let rightNum = nextNum % 10
//leftNum과 rightNum을 붙여준다.
nextNum = leftNum * 10 + rightNum

//더하기 사이클이 끝나면 카운팅 종료
if nextNum == N { break }

//더하기 사이클이 더 진행이 필요한 경우
num = nextNum
}

print(count)
