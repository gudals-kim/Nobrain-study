# 문제
# 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

# 입력
# 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

# 출력
# 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

번호 = int(input())
한수 = 0

for i in range(1, 번호+1):
    if i <= 99:
        한수 += 1
        
    else :
        번호나눠 = list(map(int,str(i)))
        if 번호나눠[0] - 번호나눠[1] == 번호나눠[1] - 번호나눠[2]:
            한수 += 1
print(한수)