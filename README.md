#  ๐์๊ณ ๋ฆฌ์ฆ | ์ ๋ณด์ฒ๋ฆฌ๊ธฐ์ฌ ์คํฐ๋

---------------
# ๐ Info

โ ๋งค์ผ [์ด์ํญ](https://github.com/gudals-kim/Nobrain-study/issues) ์ ๊ฐ์ธ ํ ๋น๋์ด ์ฌ๋ผ์จ๋ค.

โ ๋งค์ผ ํ ๋น๋์ ์ฑ์ฐ์ง ๋ชปํ๋ฉด [๋ฒ๊ธํญ](https://github.com/gudals-kim/Nobrain-study/issues/62#issue-1092605610) ์ ๋ฒ๊ธ์ด ์์ธ๋ค.

<details>
  <summary>๐์์ธํ</summary>

- [๋ฒ๊ธ ์ ์ฑ](https://github.com/gudals-kim/Nobrain-study/issues/24#issue-1074549551)

</details>

-------------
# ๐ ๋ชฉํ
โ ๋ฐฑ์ค ๊ณจ๋ ์ด์

โ ์ผ์ฑ SW ์ญ๋ ํ์คํธ ๋ค ํ๊ธฐ

โ ๊ธฐ์ด ์๊ณ ๋ฆฌ์ฆ, ์๋ฃ๊ตฌ์กฐ ์๋ฒฝ ์ดํด

----------------

# ๐ ์๋ฃ๊ตฌ์กฐ ๊ฐ๋

<details>
    <summary>๐ ๋ฐฐ์ด ๊ฐ๋ ์ ๋ฆฌ</summary>

> ๋ฐฐ์ด ๊ฐ๋ 
> ------------
> - ๋ฐ์ดํฐ๋ฅผ ๋์ดํ๊ณ , ๊ฐ ๋ฐ์ดํฐ๋ฅผ ์ธ๋ฑ์ค์ ๋์ํ๋๋ก ๊ตฌ์ฑํ ๋ฐ์ดํฐ ๊ตฌ์กฐ
> - ํ์ด์ฌ์์๋ ๋ฆฌ์คํธ ํ์์ด ๋ฐฐ์ด ๊ธฐ๋ฅ์ ์ ๊ณตํจ
> ------------
## 1. ๋ฐฐ์ด์ด ํ์ํ ์ด์ 
- ๊ฐ์ ์ข๋ฅ์ ๋ฐ์ดํฐ๋ฅผ ํจ์จ์ ์ผ๋ก ๊ด๋ฆฌํ๊ธฐ ์ํด ์ฌ์ฉ๋๋ค.
- ๊ฐ์ ์ข๋ฅ์ ๋ฐ์ดํฐ๋ฅผ ์์ฐจ์ ์ผ๋ก ์ ์ฅํ๋ค.

## 2. ๋ฐฐ์ด์ ์ฅ์ 
- ๋น ๋ฅธ ์ ๊ทผ์ด ๊ฐ๋ฅํ๋ค.
## 3. ๋ฐฐ์ด์ ๋จ์ 
- ๊ณต๊ฐ์ ๋ญ๋น๊ฐ ์์ ์ ์๊ณ , ๋ฐ์ดํฐ์ ์ถ๊ฐ ๋ฐ ์ญ์ ๊ฐ ๋ฒ๊ฑฐ๋กญ๋ค.
- ๋ฏธ๋ฆฌ ๊ณต๊ฐ์ ์ง์ ํด์ผ ํ๋ค.
## 4. ํ์ด์ฌ์์์ ๋ฐฐ์ด
- ํ์ด์ฌ ๋ฆฌ์คํธ ํ์ฉ
```
# 1์ฐจ์ ๋ฐฐ์ด
data = [1,2,3,4,5]
print (data)
์ถ๋ ฅ > [1,2,3,4,5]
```
```
# 2์ฐจ์ ๋ฐฐ์ด : ๋ฆฌ์คํธ๋ก ๊ตฌํ์
data = [[1,2,3],[4,5,6],[7,8,9]]
print(data)
print(data[0])
print(data[1][2])
print(data[0][2])
์ถ๋ ฅ > [[1,2,3],[4,5,6],[7,8,9]] # data
์ถ๋ ฅ > [1,2,3] # data[0]
์ถ๋ ฅ > 6 #data[1][2]
์ถ๋ ฅ > 3 #data[0][2]
```
### ํ์ด์ฌ ์ฐ์ต ๋ฌธ์  1
- ๋ค์ dataset ์์ ์ ์ฒด ์ด๋ฆ ์์ M์ด ๋ช๋ฒ ๋์๋์ง ๋น๋์ ์ถ๋ ฅํ๊ธฐ
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
๋น๋์ = 0
for data in dataset:
    for i in reange(len(data)):
        if data[i] == 'M' :
            ๋น๋์ += 1
print(๋น๋์)
์ถ๋ ฅ > 38
```
</details>
<details>
    <summary>๐ ํ ๊ฐ๋ ์ ๋ฆฌ</summary>

##  ํ (Queue)

### 1. ํ ๊ตฌ์กฐ
* ์ค์ ์๋ ํ์์ ์ ์ฌ
* ๊ฐ์ฅ ๋จผ์  ๋ฃ์ ๋ฐ์ดํฐ๋ฅผ ๊ฐ์ฅ ๋จผ์  ๊บผ๋ผ ์ ์๋ ๊ตฌ์กฐ
  - ์์์ ์์ ๊ฐ์ฅ ๋จผ์  ์ค์ ์  ์ฌ๋์ด ์ ์ผ ๋จผ์  ์์์ ์ ์์ฅํ๋ ๊ฒ๊ณผ ๋์ผ
  - FIFO(First-In, First-Out) ๋๋ LILO(Last-In, Last-Out) ๋ฐฉ์์ผ๋ก ์คํ๊ณผ ๊บผ๋ด๋ ์์๊ฐ ๋ฐ๋
  
<img src="https://www.fun-coding.org/00_Images/queue.png" />
* ์ถ์ฒ: http://www.stoimen.com/blog/2012/06/05/computer-algorithms-stack-and-queue-data-structure/

### 2. ์์๋ ์ฉ์ด
* Enqueue: ํ์ ๋ฐ์ดํฐ๋ฅผ ๋ฃ๋ ๊ธฐ๋ฅ
* Dequeue: ํ์์ ๋ฐ์ดํฐ๋ฅผ ๊บผ๋ด๋ ๊ธฐ๋ฅ
* <font color='yellow'>Visualgo ์ฌ์ดํธ์์ ์์ฐํด๋ณด๋ฉฐ ์ดํดํ๊ธฐ (enqueue/dequeue ๋ง ํด๋ฆญํด๋ณด๋ฉฐ): https://visualgo.net/en/list</font>

### 3. ํ์ด์ฌ queue ๋ผ์ด๋ธ๋ฌ๋ฆฌ ํ์ฉํด์ ํ ์๋ฃ ๊ตฌ์กฐ ์ฌ์ฉํ๊ธฐ
* **queue ๋ผ์ด๋ธ๋ฌ๋ฆฌ์๋ ๋ค์ํ ํ ๊ตฌ์กฐ๋ก Queue(), LifoQueue(), PriorityQueue() ์ ๊ณต**
* <font color='yellow'>ํ๋ก๊ทธ๋จ์ ์์ฑํ  ๋ ํ๋ก๊ทธ๋จ์ ๋ฐ๋ผ ์ ํฉํ ์๋ฃ ๊ตฌ์กฐ๋ฅผ ์ฌ์ฉ</font>
  - Queue(): ๊ฐ์ฅ ์ผ๋ฐ์ ์ธ ํ ์๋ฃ ๊ตฌ์กฐ
  - LifoQueue(): ๋์ค์ ์๋ ฅ๋ ๋ฐ์ดํฐ๊ฐ ๋จผ์  ์ถ๋ ฅ๋๋ ๊ตฌ์กฐ (์คํ ๊ตฌ์กฐ๋ผ๊ณ  ๋ณด๋ฉด ๋จ)
  - PriorityQueue(): ๋ฐ์ดํฐ๋ง๋ค ์ฐ์ ์์๋ฅผ ๋ฃ์ด์, ์ฐ์ ์์๊ฐ ๋์ ์์ผ๋ก ๋ฐ์ดํฐ ์ถ๋ ฅ
  
> ์ผ๋ฐ์ ์ธ ํ ์ธ์ ๋ค์ํ ์ ์ฑ์ด ์ ์ฉ๋ ํ๋ค์ด ์์

#### โ 3.1. Queue()๋ก ํ ๋ง๋ค๊ธฐ (๊ฐ์ฅ ์ผ๋ฐ์ ์ธ ํ, FIFO(First-In, First-Out))
```
import queue             #ํ ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ํฌํธ

data_queue = queue.Queue()  # ๋ณ์๋ฅผ Queue๋ก ์ ์ธ

data_queue.put("funcoding") # put์ ํตํ ๋ฐ์ดํฐ ์ถ๊ฐ
data_queue.put(1) 
data_queue.qsize()  # Queue์ ํฌ๊ธฐ ์ถ๋ ฅ
data_queue.get()  # Queue ๋ฐ์ดํฐ ๋ฝ๊ธฐ
data_queue.get()
```
```
์ถ๋ ฅ > 2            #data_queue.qsize()
์ถ๋ ฅ > funcoding    #data_queue.get()
์ถ๋ ฅ > 1            #data_queue.get()
```
#### โ 3.2. LifoQueue()๋ก ํ ๋ง๋ค๊ธฐ (LIFO(Last-In, First-Out))
```
import queue
data_queue = queue.LifoQueue()

data_queue.put("funcoding")
data_queue.put(1)

data_queue.qsize()

data_queue.get()

```
```
์ถ๋ ฅ > 2          #data_queue.qsize()
์ถ๋ ฅ > 1          #data_queue.get()
```
#### โ 3.3. PriorityQueue()๋ก ํ ๋ง๋ค๊ธฐ
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
์ถ๋ ฅ > 3                    #data_queue.qsize()
์ถ๋ ฅ > (5, 1)               #data_queue.get()
์ถ๋ ฅ > (10, 'korea')        #data_queue.get()
```
### โ ์ฐธ๊ณ : ์ด๋์ ํ๊ฐ ๋ง์ด ์ฐ์ผ๊น?
- ๋ฉํฐ ํ์คํน์ ์ํ ํ๋ก์ธ์ค ์ค์ผ์ฅด๋ง ๋ฐฉ์์ ๊ตฌํํ๊ธฐ ์ํด ๋ง์ด ์ฌ์ฉ๋จ (์ด์์ฒด์  ์ฐธ์กฐ)

> ํ์ ๊ฒฝ์ฐ์๋ ์ฅ๋จ์  ๋ณด๋ค๋ (ํน๋ณํ ์ธ๊ธ๋๋ ์ฅ๋จ์ ์ด ์์), ํ์ ํ์ฉ ์๋ก ํ๋ก์ธ์ค ์ค์ผ์ฅด๋ง ๋ฐฉ์์ ํจ๊ป ์ดํดํด๋๋ ๊ฒ์ด ์ข์

### 4. ํ๋ก๊ทธ๋๋ฐ ์ฐ์ต 
<div class="alert alert-block alert-warning">
<strong><font color="green" size="3em">์ฐ์ต1: ๋ฆฌ์คํธ ๋ณ์๋ก ํ๋ฅผ ๋ค๋ฃจ๋ enqueue, dequeue ๊ธฐ๋ฅ ๊ตฌํํด๋ณด๊ธฐ</font></strong>
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
์ถ๋ ฅ > 10 # len(queue_list)
์ถ๋ ฅ > 2  # dequeue()
```

</details>


-------------
##

# ๐ฉโ๐ฉโ๐ฆโ๐ฆ ๋ฉค๋ฒ

<br/>

<table>
    <tr>
      <td height="140px" align="center"> <a href="https://github.com/gudals-kim"><img src="https://avatars.githubusercontent.com/u/53683522?v=4" width="140px" /><br/> ์ ๋ณด๋ณด์์ ๊ณต <br/> ๊นํ๋ฏผ (Python)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/sohoung"><img src="https://avatars.githubusercontent.com/u/91325373?v=4" width="140px" /><br/> ์ ๋ณด๋ณด์์ ๊ณต <br/> ๊น๋ฏผ์ฑ (JAVA)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/park121234"><img src="https://avatars.githubusercontent.com/u/84003592?v=4" width="140px" /><br/> ์ ๋ณด๋ณด์์ ๊ณต <br/> ๋ฐ๊ดํ (Swift)</a></td>
      <td height="140px" align="center"> <a href="https://github.com/leel5337"><img src="https://avatars.githubusercontent.com/u/84003717?v=4" width="140px" /><br/> ์ ๋ณด๋ณด์์ ๊ณต <br/> ์ด์ ํ (javaScript)</a></td>
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

# ๐ ์งํ ์์

<br/>

<table>
  <tr>
    <td align="center">์์</td>
    <td align="center">์๊ณ ๋ฆฌ์ฆ</td>
    <td align="center">๋ฌธ์ ์ง</td>
    <td align="center">์ด ๋ฌธ์  ์</td>
    <td align="center">ํต๊ณผ ๊ธฐ์ค ์</td>
    <td align="center">์ํ</td>
  </tr>
  <tr>
    <td align="center">00</td>
    <td align="center" width="300px">์์ถ๋ ฅ๊ณผ ์ฌ์น์ฐ์ฐ</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/01_%EC%9E%85%EC%B6%9C%EB%A0%A5%EA%B3%BC%20%EC%82%AC%EC%B9%99%EC%97%B0%EC%82%B0">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="70px">4/4</td>
  </tr>
  <tr>
    <td align="center">01</td>
    <td align="center" width="300px">if ๋ฌธ</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/02_if%EB%AC%B8">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">02</td>
    <td align="center" width="300px">for ๋ฌธ</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/03_for%EB%AC%B8">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">03</td>
    <td align="center" width="300px">while๋ฌธ</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/04_while%EB%AC%B8">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">3</td>
    <td align="center" width="120px">3</td>
    <td align="center" width="80px">4/4</td>
  </tr><tr>
    <td align="center">04</td>
    <td align="center" width="300px">1์ฐจ์ ๋ฐฐ์ด</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/05_1%EC%B0%A8%EC%9B%90%20%EB%B0%B0%EC%97%B4">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">7</td>
    <td align="center" width="120px">7</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">05</td>
    <td align="center" width="300px">ํจ์ </td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/06_%ED%95%A8%EC%88%98">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">3</td>
    <td align="center" width="120px">3</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">06</td>
    <td align="center" width="300px">๋ฌธ์์ด</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/07_%EB%AC%B8%EC%9E%90%EC%97%B4">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">10</td>
    <td align="center" width="120px">10</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">07</td>
    <td align="center" width="300px">๊ธฐ๋ณธ ์ํ1</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/08_%EA%B8%B0%EB%B3%B8%EC%88%98%ED%95%991">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">9</td>
    <td align="center" width="120px">9</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">08</td>
    <td align="center" width="300px">๊ธฐ๋ณธ ์ํ2</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/09_%EA%B8%B0%EB%B3%B8%EC%88%98%ED%95%992">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">11</td>
    <td align="center" width="120px">11</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">09</td>
    <td align="center" width="300px">์ฌ๊ท</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/10_%EC%9E%AC%EA%B7%80">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">4</td>
    <td align="center" width="120px">4</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">10</td>
    <td align="center" width="300px">๋ธ๋ฃจํธ ํฌ์ค</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/11_%EB%B8%8C%EB%A3%A8%ED%8A%B8%ED%8F%AC%EC%8A%A4">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">11</td>
    <td align="center" width="300px">์ ๋ ฌ</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/12_%EC%A0%95%EB%A0%AC">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">10</td>
    <td align="center" width="120px">10</td>
    <td align="center" width="80px">1/4</td>
  </tr>
  <tr>
    <td align="center">12</td>
    <td align="center" width="300px">์๋ฃ๊ตฌ์กฐ 1</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/13_%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0%201">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">19</td>
    <td align="center" width="120px">19</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">13</td>
    <td align="center" width="300px">์ํ 1</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/14_%EC%88%98%ED%95%991">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">19</td>
    <td align="center" width="120px">19</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">14</td>
    <td align="center" width="300px">๋ค์ด๋๋ฏน ํ๋ก๊ทธ๋๋ฐ 1</td>
    <td align="center" width="110px"><a href="https://github.com/gudals-kim/Nobrain-study/tree/master/15_%EB%8B%A4%EC%9D%B4%EB%82%98%EB%AF%B9%20%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D1">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">29</td>
    <td align="center" width="120px">29</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">15</td>
    <td align="center" width="300px">๋ธ๋ฃจํธ ํฌ์ค 2</td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">8</td>
    <td align="center" width="120px">8</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">16</td>
    <td align="center" width="300px">๋ธ๋ฃจํธ ํฌ์ค(N,M)</td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">12</td>
    <td align="center" width="120px">12</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">17</td>
    <td align="center" width="300px">๋ธ๋ฃจํธ ํฌ์ค (์์ด)</td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">6</td>
    <td align="center" width="120px">6</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">18</td>
    <td align="center" width="300px">๋ธ๋ฃจํธ ํฌ์ค (๋นํธ๋ง์คํฌ)</td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">4</td>
    <td align="center" width="120px">4</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">19</td>
    <td align="center" width="300px">๊ทธ๋ํ 1</td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">14</td>
    <td align="center" width="120px">14</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">20</td>
    <td align="center" width="300px">BFS </td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">4/4</td>
  </tr>
  <tr>
    <td align="center">21</td>
    <td align="center" width="300px">ํธ๋ฆฌ 1 </td>
    <td align="center" width="110px"><a href="">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">5</td>
    <td align="center" width="120px">5</td>
    <td align="center" width="80px">0/4</td>
  </tr>
  <tr>
    <td align="center">22</td>
    <td align="center" width="300px">์ผ์ฑ SW ์ญ๋ ํ์คํธ ๊ธฐ์ถ ๋ฌธ์ </td>
    <td align="center" width="110px"><a href="https://www.acmicpc.net/workbook/view/1152">๋ฐ๋ก๊ฐ๊ธฐ</a></td>
    <td align="center" width="120px">null</td>
    <td align="center" width="120px">null</td>
    <td align="center" width="80px">์ค๋น์ค..</td>
  </tr>
  <tr>
    <td align="center">23</td>
    <td align="center" width="300px">null</td>
    <td align="center" width="110px"><a href="">null</a></td>
    <td align="center" width="120px">null</td>
    <td align="center" width="120px">null</td>
    <td align="center" width="80px">์ค๋น์ค..</td>
  </tr>
</table>

<br/><br/>
