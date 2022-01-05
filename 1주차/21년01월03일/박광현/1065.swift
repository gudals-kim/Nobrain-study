
// N을 입력받는다.
let N = Int(readLine()!)!
//답을 입력받은 변수 cnt
var cnt = 0

// 1 ~ N까지 순회합니다.
(1...N).forEach {
    //$0은 1 ~ N의 값이 순차적으로 들어갑니다.
    var num = $0
    var prev = Int.max, now = Int.max
    var diff = Int.max
    //한수인지 체크하는 변수
    var isHansoo = true
    //현재 수의 각자리 수를 보며 차잇값 확인
    while num > 0 {
        let rem = num % 10
        //현재 순회하는 각 자릿값
        now = rem
        //만약 이전값이 저장안되어있으면, 아직 차잇값 비교 X
        //현재값을 이전값으로 넣어둔다.
        if prev == Int.max {
            prev = rem
        } else {
            if diff == Int.max {
                diff = now - prev
            } else {
                //이전 차잇값이 있다면, 현재 now - prev 차잇값과 비교하여 한수여부를 체크한다.
                let tDiff = now - prev
                if tDiff != diff { isHansoo = false; break }
    }
}
        prev = now
        num /= 10
    }
    // 만약 한수라면 카운트한다.
    if isHansoo { cnt += 1 }
}

//답 출력
print(cnt)
