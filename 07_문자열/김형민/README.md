# 공부내용 



> ⚡11654번 | 아스키코드
> ------------
>  풀이
```
문자를 아스키코드로 변환하는 함수를 아느냐의 문제이다
아스키코드로 변환하는 함수는 ord()이다.
```

> ⚡11720번 | 숫자의 합
> ------------
>  풀이
```
map() 함수를 이용해서 쉽게 풀수있다.

복습
map(변환함수,순회가능한데이터) 함수는 뒤 순회가능한데이터 튜플,리스트 등의 요소를
변환함수에 일일히 다 대입하여 새로운 형태로 매핑되어 나온다. 
이를 list(map()), tuple(map()) 등으로 감쌀 수 있다.
```

> ⚡10809번 | 알파벳 찾기
> ------------
>  풀이
```
영단어 = input()
알파벳 = list(range(97,123))#소문자 알파벳 아스키코드
for i in 알파벳: #소문자 알파벳 아스키 코드들을 i에 대입
    print(영단어.find(chr(i))) #아스키코드를 chr로 변형시켜 알파벳으로 대입하고 find 함수에 대입하면 된다
    #find 함수 = 찾는 문자가 문자열 안에서 첫 번째 존재하는 곳의 위치를 반환한다. 만일 없으면 -1을 반환한다.
```

> ⚡2675번 | 문자열 반복
> ------------
>  풀이
```
테스트 개수를 받고 테스트 개수만큼 반복을 돌린다.
개수와 문자를 input.split으로 나누어 받고 
문자 하나하나를 for문에 대입하여 개수만큼 곱해준다.
```

> ⚡1157번 | 단어 공부
> ------------
>  풀이
```
조금 생각한 문제이다.
입력받은 문자를 리스트와 set자료형으로 중복제거한 리스트로 따로 받은 후
중복제거 리스트를 for문으로 반복을 돌려 각 알파벳마다 count()내장함수를 활용해 빈도수를 빈도수리스트에 저장하고
만약 빈도수리스트의 가장 큰값이 중복이된다면 -> 가장큰값은 알수있으니 가장큰값을 활용해 그 큰값이 빈도수리스트에 몇개가 들어있는지 확인
후 중복이된다면 ?를 출력하고
아니면 큰값의 인덱스를 추출해 문자를 출력한다.
```

> ⚡1152번 | 단어의 개수
> ------------
>  풀이
```
(풀이내용)
```

> ⚡2908번 | 상수
> ------------
>  풀이
```
(풀이내용)
```

> ⚡5622번 | 다이얼
> ------------
>  풀이
```
알파벳을 입력을 받으면 숫자가 출력이 되게 한 후,
1 = 2초가 걸리고 2가 3초가 걸리니 각 번호보다 1초가 더 걸린다고 생각함.
그래서 숫자에 1을 더하여, 총 합을 찾음 
```

> ⚡2941번 | 크로아티아 알파벳
> ------------
>  풀이
```
replace 함수사용법을 알아야한다.
replace(이문자를, 이문자로바꿔) 함수이다.
크로아티아 문자열 리스트를 만들고
for문으로 반복하여 replace 함수를 사용하여, 크로아티아 문자열의 문자를 '@'의 문자로
바꾼뒤 문자열의 개수를 셌다.
주의할 점은 replace 함수는 비파괴형 함수이기 때문에 문자열을 받은 변수에 사용하지 않으면,(새로운 변수에 받으면)
한 문자만 계속 바뀌어간다. 
```

> ⚡1316번 | 그룹단어 체커
> ------------
>  풀이
```
문제자체가 이해가 되지않음
추후 이 문제는 다시 봐야함.
풀이를 봐도, 문제를 봐도 무엇을 구하는지가 명확하지 않음
다시공부해야겠음
```