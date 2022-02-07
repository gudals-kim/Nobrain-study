#  📝알고리즘 | 정보처리기사 스터디

---------------
# 📌 Info

✔ 매일 [이슈탭](https://github.com/gudals-kim/Nobrain-study/issues) 에 개인 할당량이 올라온다.

✔ 매일 할당량을 채우지 못하면 [벌금탭](https://github.com/gudals-kim/Nobrain-study/issues/62#issue-1092605610) 에 벌금이 쌓인다.

<details>
  <summary>🔍자세히</summary>

- [벌금 정책](https://github.com/gudals-kim/Nobrain-study/issues/24#issue-1074549551)

</details>

-------------
# 📌 목표
✔ 백준 골드 이상

✔ 삼성 SW 역량 테스트 다 풀기

✔ 기초 알고리즘, 자료구조 완벽 이해

----------------
-------------
# 📌 자료구조 개념

<details>
    <summary>🔍 배열 개념 정리</summary>

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
</details>
<details>
    <summary>🔍 큐 개념 정리</summary>

##  큐 (Queue)

### 1. 큐 구조
* 줄을 서는 행위와 유사
* 가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조
  - 음식점에서 가장 먼저 줄을 선 사람이 제일 먼저 음식점에 입장하는 것과 동일
  - FIFO(First-In, First-Out) 또는 LILO(Last-In, Last-Out) 방식으로 스택과 꺼내는 순서가 반대
  
<img src="https://www.fun-coding.org/00_Images/queue.png" />
* 출처: http://www.stoimen.com/blog/2012/06/05/computer-algorithms-stack-and-queue-data-structure/

### 2. 알아둘 용어
* Enqueue: 큐에 데이터를 넣는 기능
* Dequeue: 큐에서 데이터를 꺼내는 기능
* <font color='yellow'>Visualgo 사이트에서 시연해보며 이해하기 (enqueue/dequeue 만 클릭해보며): https://visualgo.net/en/list</font>

### 3. 파이썬 queue 라이브러리 활용해서 큐 자료 구조 사용하기
* **queue 라이브러리에는 다양한 큐 구조로 Queue(), LifoQueue(), PriorityQueue() 제공**
* <font color='yellow'>프로그램을 작성할 때 프로그램에 따라 적합한 자료 구조를 사용</font>
  - Queue(): 가장 일반적인 큐 자료 구조
  - LifoQueue(): 나중에 입력된 데이터가 먼저 출력되는 구조 (스택 구조라고 보면 됨)
  - PriorityQueue(): 데이터마다 우선순위를 넣어서, 우선순위가 높은 순으로 데이터 출력
  
> 일반적인 큐 외에 다양한 정책이 적용된 큐들이 있음

#### ✔ 3.1. Queue()로 큐 만들기 (가장 일반적인 큐, FIFO(First-In, First-Out))
```
import queue             #큐 라이브러리 임포트

data_queue = queue.Queue()  # 변수를 Queue로 선언

data_queue.put("funcoding") # put을 통한 데이터 추가
data_queue.put(1) 
data_queue.qsize()  # Queue의 크기 출력
data_queue.get()  # Queue 데이터 뽑기
data_queue.get()
```
```
출력 > 2            #data_queue.qsize()
출력 > funcoding    #data_queue.get()
출력 > 1            #data_queue.get()
```
#### ✔ 3.2. LifoQueue()로 큐 만들기 (LIFO(Last-In, First-Out))
```
import queue
data_queue = queue.LifoQueue()

data_queue.put("funcoding")
data_queue.put(1)

data_queue.qsize()

data_queue.get()

```
```
출력 > 2          #data_queue.qsize()
출력 > 1          #data_queue.get()
```
#### ✔ 3.3. PriorityQueue()로 큐 만들기
```
import queue

data_queue = queue.PriorityQueue()

data_queue.put((10, "korea"))
data_queue.put((5, 1))
data_queue.put((15, "china"))

data_queue.qsize()

data_queue.get()

data_queue.get()
```
```
출력 > 3                    #data_queue.qsize()
출력 > (5, 1)               #data_queue.get()
출력 > (10, 'korea')        #data_queue.get()
```
### ✔ 참고: 어디에 큐가 많이 쓰일까?
- 멀티 태스킹을 위한 프로세스 스케쥴링 방식을 구현하기 위해 많이 사용됨 (운영체제 참조)

> 큐의 경우에는 장단점 보다는 (특별히 언급되는 장단점이 없음), 큐의 활용 예로 프로세스 스케쥴링 방식을 함께 이해해두는 것이 좋음

### 4. 프로그래밍 연습 
<div class="alert alert-block alert-warning">
<strong><font color="green" size="3em">연습1: 리스트 변수로 큐를 다루는 enqueue, dequeue 기능 구현해보기</font></strong>
</div>

```
queue_list = list()

def enqueue(data):
    queue_list.append(data)
    
def dequeue():
    data = queue_list[0]
    del queue_list[0]
    return data

for index in range(10):
    enqueue(index)

len(queue_list)
dequeue()
```
```
출력 > 10 # len(queue_list)
출력 > 2  # dequeue()
```

</details>


-------------
##

# 👩‍👩‍👦‍👦 멤버

<br/>

<table>
    <tr>
      <td height="140px" align="center"> <a href="https://github.com/gudals-kim"><img src="https://avatars.githubusercontent.com/u/53683522?v=4" width="140px" /><br/> 정보보안전공 <br/> 김형민 (Python)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/sohoung"><img src="https://avatars.githubusercontent.com/u/91325373?v=4" width="140px" /><br/> 정보보안전공 <br/> 김민성 (JAVA)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/park121234"><img src="https://avatars.githubusercontent.com/u/84003592?v=4" width="140px" /><br/> 정보보안전공 <br/> 박광현 (Swift)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/leel5337"><img src="https://avatars.githubusercontent.com/u/84003717?v=4" width="140px" /><br/> 정보보안전공 <br/> 이정현 (javaScript)</a></td>
    </tr>
    <tr>
      <td align="center"><a href="https://solved.ac/gudals"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=gudals" /></a><br/><a href="https://www.acmicpc.net/user/gudals">Baekjoon</a><br/><a href="https://solved.ac/profile/gudals">solved.ac</a></td>
      <td align="center"><a href="https://solved.ac/sohoung"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=sohoung" /></a><br/><a href="https://www.acmicpc.net/user/sohoung">Baekjoon</a><br/><a href="https://solved.ac/profile/sohoung">solved.ac</a></td>
      <td align="center"><a href="https://solved.ac/rhkdgus5260"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=rhkdgus5260" /></a><br/><a href="https://www.acmicpc.net/user/rhkdgus5260">Baekjoon</a><br/><a href="https://solved.ac/profile/rhkdgus5260">solved.ac</a></td>
      <td align="center"><a href="https://solved.ac/lel5337"><img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=lel5337" /></a><br/><a href="https://www.acmicpc.net/user/lel5337">Baekjoon</a><br/><a href="https://solved.ac/profile/lel5337">solved.ac</a></td>
     
  </tr>

</table>

<br>
<br/>

---------

##

# 📖 진행 순서

<br/>

<table>
  <tr>
    <td align="center">순서</td>
    <td align="center">알고리즘</td>
    <td align="center">문제집</td>
    <td align="center">총 문제 수</td>
    <td align="center">통과 기준 수</td>
    <td align="center">상태</td>
  </tr>
  <tr>
    <td align="center">00</td>
    <td align="center" width="300px">입출력과 사칙연산</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/01_%EC%9E%85%EC%B6%9C%EB%A0%A5%EA%B3%BC%20%EC%82%AC%EC%B9%99%EC%97%B0%EC%82%B0">바로가기</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="70px">4/4</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center" width="300px">if 문</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/02_if%EB%AC%B8">바로가기</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center" width="300px">for 문</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/03_for%EB%AC%B8">바로가기</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center" width="300px">while문</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/04_while%EB%AC%B8">바로가기</a></td>
    <td align="center" width="120px">3</td>
    <td align="center" width="120px">3</td>
    <td align="center" width="80px">4/4</td>
  </tr><tr>
    <td align="center">04</td>
    <td align="center" width="300px">1차원 배열</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/05_1%EC%B0%A8%EC%9B%90%20%EB%B0%B0%EC%97%B4">바로가기</a></td>
    <td align="center" width="120px">7</td>
    <td align="center" width="120px">7</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center" width="300px">함수 </td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/06_%ED%95%A8%EC%88%98">바로가기</a></td>
    <td align="center" width="120px">3</td>
    <td align="center" width="120px">3</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">06</td>
    <td align="center" width="300px">문자열</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/07_%EB%AC%B8%EC%9E%90%EC%97%B4">바로가기</a></td>
    <td align="center" width="120px">10</td>
    <td align="center" width="120px">10</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">07</td>
    <td align="center" width="300px">기본 수학1</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/08_%EA%B8%B0%EB%B3%B8%EC%88%98%ED%95%991">바로가기</a></td>
    <td align="center" width="120px">9</td>
    <td align="center" width="120px">9</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">08</td>
    <td align="center" width="300px">기본 수학2</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/09_%EA%B8%B0%EB%B3%B8%EC%88%98%ED%95%992">바로가기</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">09</td>
    <td align="center" width="300px">재귀</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/10_%EC%9E%AC%EA%B7%80">바로가기</a></td>
    <td align="center" width="120px">4</td>
    <td align="center" width="120px">4</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">10</td>
    <td align="center" width="300px">브루트 포스</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/11_%EB%B8%8C%EB%A3%A8%ED%8A%B8%ED%8F%AC%EC%8A%A4">바로가기</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">11</td>
    <td align="center" width="300px">정렬</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/12_%EC%A0%95%EB%A0%AC">바로가기</a></td>
    <td align="center" width="120px">10</td>
    <td align="center" width="120px">10</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">12</td>
    <td align="center" width="300px">자료구조 1</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/13_%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0%201">바로가기</a></td>
    <td align="center" width="120px">19</td>
    <td align="center" width="120px">19</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">13</td>
    <td align="center" width="300px">수학 1</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">19</td>
    <td align="center" width="120px">19</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">14</td>
    <td align="center" width="300px">다이나믹 프로그래밍 1</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">29</td>
    <td align="center" width="120px">29</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">15</td>
    <td align="center" width="300px">브루트 포스 2</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">8</td>
    <td align="center" width="120px">8</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">16</td>
    <td align="center" width="300px">브루트 포스(N,M)</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">12</td>
    <td align="center" width="120px">12</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">17</td>
    <td align="center" width="300px">브루트 포스 (순열)</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">6</td>
    <td align="center" width="120px">6</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">18</td>
    <td align="center" width="300px">브루트 포스 (비트마스크)</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">4</td>
    <td align="center" width="120px">4</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">19</td>
    <td align="center" width="300px">그래프 1</td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">14</td>
    <td align="center" width="120px">14</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">20</td>
    <td align="center" width="300px">BFS </td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">21</td>
    <td align="center" width="300px">트리 1 </td>
    <td align="center" width="110px"><a href="">바로가기</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">22</td>
    <td align="center" width="300px">삼성 SW 역량 테스트 기출 문제</td>
    <td align="center" width="110px"><a href="https://www.acmicpc.net/workbook/view/1152">바로가기</a></td>
    <td align="center" width="120px">null</td>
    <td align="center" width="120px">null</td>
    <td align="center" width="80px">준비중..</td>
  </tr>
  <tr>
    <td align="center">23</td>
    <td align="center" width="300px">null</td>
    <td align="center" width="110px"><a href="">null</a></td>
    <td align="center" width="120px">null</td>
    <td align="center" width="120px">null</td>
    <td align="center" width="80px">준비중..</td>
  </tr>
</table>

<br/><br/>
