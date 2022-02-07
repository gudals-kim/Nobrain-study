A, B = map(list,input().split())
for i, j in zip(reversed(A),reversed(B)):
    i = int(i)
    j = int(j)
    if i > j : 
        print("".join(reversed(A)))
        break 
    elif j > i : 
        print("".join(reversed(B)))
        break