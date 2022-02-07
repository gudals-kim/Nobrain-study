# 팩토리얼
# 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
# 1 초	256 MB	97097	48942	40783	50.784%
# 문제
# 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

# 입력
# 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

# 출력
# 첫째 줄에 N!을 출력한다.

num = int(input())
if num == 0: 
    print(0)
    exit()
answer = 1 
for i in range(1,num+1):
    answer *= i
print(answer)