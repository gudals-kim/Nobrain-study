package Baekjoon;
import java.util.Scanner;

public class characterStudy_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 알파벳 갯수 만큼 배열 생성

        String a = sc.next().toUpperCase(); // 대소문자 구분 없이 하기 위해서 toUpperCase를 사용
        int[] intarr = new int[a.length()]; // 문자열을 받는 대로 동적 배열 생성

        int su;
        for(int i = 0; i < intarr.length; i++) {
            su = (int)(a.charAt(i) - 65);
            arr[su]++;
        }
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int cnt = 0;
        int index = 0;
        char result = '?';
        for(int i = 0; i < arr.length; i++){
            if(max == arr[i]) {
                cnt++;
                index = i;
            }else if(cnt >= 2) {
                break;
            }
        }
        if(cnt >= 2) {
            System.out.println(result);
        }else {
            System.out.println((char)(index + 65));
        }
    }
}
