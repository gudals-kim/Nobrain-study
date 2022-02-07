# 네 번째 점 다국어
# 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
# 1 초	128 MB	27025	19473	17587	73.145%
# 문제
# 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

# 입력
# 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

# 출력
# 직사각형의 네 번째 점의 좌표를 출력한다.
엑스 = []
와이 = []
for i in range(3):
    x, y = map(int, input().split())
    엑스.append(x)
    와이.append(y)
for i in 엑스:
    a = 엑스.count(i)
    if a > 1 :
        엑스.remove(i)
for i in 와이:
    a = 와이.count(i)
    if a > 1 :
        와이.remove(i)
print("%d %d" %(엑스[0], 와이[0]))
