package Baekjoon;

import java.util.Scanner;

public class StringIterator_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // test 갯수이고 테스트 하는 횟수만 전역변수로 선언해주고 나머지 변수들은 for 문 안에서 실행하게끔 안에서 선언
        // 알아야 할 점으로는 Scanner로 String을 받을 때 next와 nextLine의 차이점으로는
        // String을 입력을 받을때 next()는 공백을 기준으로 입력을 받고,
        //nextLine()은 한 줄을 입력 받는 것이다.

        for(int i = 0; i < n; i++) { // n번을 반복 해야 하기 때문에 가장 바깥쪽 for 문으로 감싸준다.
            int num = sc.nextInt(); // 몇 번 반복 할 것인지
            String st = sc.next(); // 문자열을 받아준다.

            for(int j = 0; j < st.length(); j++) {
                for(int k = 0; k < num; k++) {
                    System.out.print(st.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
