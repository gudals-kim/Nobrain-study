# 공부내용 
> 배열 개념 
> ------------
> - 데이터를 나열하고, 각 데이터를 인덱스에 대응하도록 구성한 데이터 구조
> - 파이썬에서는 리스트 타입이 배열 기능을 제공함
> ------------
## 1. 배열이 필요한 이유
- 같은 종류의 데이터를 효율적으로 관리하기 위해 사용된다.
- 같은 종류의 데이터를 순차적으로 저장한다.

## 2. 배열의 장점
- 빠른 접근이 가능하다.
## 3. 배열의 단점
- 공간의 낭비가 있을 수 있고, 데이터의 추가 및 삭제가 번거롭다.
- 미리 공간을 지정해야 한다.
## 4. 파이썬에서의 배열
- 파이썬 리스트 활용
```
# 1차원 배열
data = [1,2,3,4,5]
print (data)
출력 > [1,2,3,4,5]
```
```
# 2차원 배열 : 리스트로 구현시
data = [[1,2,3],[4,5,6],[7,8,9]]
print(data)
print(data[0])
print(data[1][2])
print(data[0][2])
출력 > [[1,2,3],[4,5,6],[7,8,9]] # data
출력 > [1,2,3] # data[0]
출력 > 6 #data[1][2]
출력 > 3 #data[0][2]
```
### 파이썬 연습 문제 1
- 다음 dataset 에서 전체 이름 안에 M이 몇번 나왔는지 빈도수 출력하기
```
dataset = ['Braund, Mr. Owen Harris',
'Cumings, Mrs. John Bradley (Florence Briggs Thayer)',
'Heikkinen, Miss. Laina',
'Futrelle, Mrs. Jacques Heath (Lily May Peel)',
'Allen, Mr. William Henry',
'Moran, Mr. James',
'McCarthy, Mr. Timothy J',
'Palsson, Master. Gosta Leonard',
'Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)',
'Nasser, Mrs. Nicholas (Adele Achem)',
'Sandstrom, Miss. Marguerite Rut',
'Bonnell, Miss. Elizabeth',
'Saundercock, Mr. William Henry',
'Andersson, Mr. Anders Johan',
'Vestrom, Miss. Hulda Amanda Adolfina',
'Hewlett, Mrs. (Mary D Kingcome) ',
'Rice, Master. Eugene',
'Williams, Mr. Charles Eugene',
'Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)',
'Masselmani, Mrs. Fatima',
'Fynney, Mr. Joseph J',
'Beesley, Mr. Lawrence',
'McGowan, Miss. Anna "Annie"',
'Sloper, Mr. William Thompson',
'Palsson, Miss. Torborg Danira',
'Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)',
'Emir, Mr. Farred Chehab',
'Fortune, Mr. Charles Alexander',
'Dwyer, Miss. Ellen "Nellie"',
'Todoroff, Mr. Lalio']
```
```
빈도수 = 0
for data in dataset:
    for i in reange(len(data)):
        if data[i] == 'M' :
            빈도수 += 1
print(빈도수)
출력 > 38
```
> ⚡10818번 | 최소, 최대
> ------------
>  풀이
```

```

> ⚡2562번 | 최댓값
> ------------
>  풀이
```
for 반복문으로 리스트에 요소를 넣은뒤
파이썬 내장함수 max함수와 index 함수를 활용해서 답을 찾았다.
```

> ⚡2577번 | 숫자의 개수 
> ------------
>  풀이
```
문자를 받은후에 
곱한값은 문자열로 변환한 후
리스트로 만들어 파이썬 내장함수 conut를 활용해서 답을 도출했다.
```

> ⚡3052번 | 나머지
> ------------
>  풀이
```
입력을 나머지값으로 만들어주어 리스트로 만들어 받고 set()을 이용하여 중복을 제거한다. 
```

> ⚡1546번 | 평균
> ------------
>  풀이
```
시험점수를 int list로 받고 max함수를 이용해 최댓값을 뽑아 시험점수리스트 요소들을
문제에 표기된 공식을 적용시켜 거짓점수 리스트에 추가한다.
이후 거짓점수리스트의 합을 구한후 요소개수만큼 나누어 평균을 구한다. 
```

> ⚡8958번 | OX퀴즈
> ------------
>  풀이
```
0을 만나면 sum (총점수)에 1씩 증가하는 c를 더해준다. x 를 만나면 c를 초기화한다.
```

> ⚡4344번 | 평균은 넘겠지
> ------------
>  풀이
```
테스트 케이스를 입력을 받고 테스트 케이스만큼 반복문을 돌린다. 
점수입력을 받고 첫 요소를 학생수로 저장한뒤 삭제한다.
점수의 합을 학생수로 나누어 평균을 구한뒤
점수를 for 반복문으로 요소 마다 평균과 비교하여 큰값만 a 변수에 저장한다.
이후 비율공식을 사용하여 비율을 구한다. 또한 format을 이용하여 조건을 맞춰준다.
```
