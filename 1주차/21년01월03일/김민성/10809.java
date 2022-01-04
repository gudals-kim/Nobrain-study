package Baekjoon;

import java.util.Scanner;

public class String_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        for(int i = 0; i < 26; i++){ // 처음에 알바벳 숫자대로 배열을 만들어주고 그 다음 모두 -1로 초기화
            arr[i] = -1;
        }


        String s = sc.nextLine(); // 문자열 받아주기

        for(int i = 0; i < s.length(); i++) { // for 문을 통해 문자열의 각 문자를 검사한다.
                                            // 즉, charAt() 이라는 메소드를 사용하여 문자를 추출한 뒤 ch 라는 변수에 저장해준다.
            char ch = s.charAt(i);         // 각 문자열을 char ch에 저장한다.

            if(arr[ch - 'a'] == -1){ // arr 값의 원소가 -1인 경우 초기화
                arr[ch - 'a'] = i;
            }
        }
        for(int val : arr) { // 배열 출력
            System.out.print(val + " ");
        }
    }
}
