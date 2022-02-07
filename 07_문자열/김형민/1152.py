문자 = input()
답 = 1
for i in range(len(문자)):
    if len(문자) == 1 :
        if 문자[i] == " ":
            답 = 0
    if 문자[i] == " ":
        if i == 0:
            답 = 답 - 1
        elif len(문자)-1 == i:
            답 = 답 - 1
        
        답 = 답 + 1        
print(답)