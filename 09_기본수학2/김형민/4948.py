# 베르트랑 공준 다국어
# 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
# 1 초	256 MB	56654	22624	18417	40.287%
# 문제
# 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

# 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

# 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

# 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

# 입력
# 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.

# 입력의 마지막에는 0이 주어진다.

# 출력
# 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.

# 제한
# 1 ≤ n ≤ 123,456
A = -1
while A != 0:
    소수개수=0
    A = int(input())
    if A == 0:
        break
    B = (2*A)+1
    for i in range(A+1,B):
        error = 0
        if i > 1 : # 1은 제외 1은 소수가 아님 답을 증가할 이유 없음
            for j in range(2,i): #2부터 i-1 까지 돌린다.
                if i % j == 0: #받은 숫자가 2~i-1 로 나누어지면 error 증가 
                    error += 1
                    break# 무조건 한번이상 나누어지면 소수는 아니니 for j 문을 탈출한다.
            if error == 0:
                소수개수+=1
    print(소수개수)
    