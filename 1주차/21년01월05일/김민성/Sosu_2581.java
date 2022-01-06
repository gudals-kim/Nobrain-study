package Baekjoon1105;

import java.util.Scanner;

public class Sosu_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max;
        min = sc.nextInt();
        max = sc.nextInt();
        int sum = 0;
        int[] arr = new int[max - min + 1];

        for (int i = min; i < max + 1; i++) {
            int flag = 0;   //소수 판별 변수
            if (i == 1) // 1은 소수x
            {
                continue;
            } else if (i == 2) // 2는 소수
            {
                flag = 1;
            } else // 1과 2가 아닐 때
            {
                for (int j = 2; j < i; j++) {
                    flag = 0;       //소수 판별 변수 초기화
                    if (i % j == 0) //변수 i가 j로 나누었을때 나머지가 0이면 소수 x
                    {
                        break;
                    }
                    flag = 1; //소수일 경우 소수 판별 변수는 1
                }
            }

            if (flag == 1) {
                sum += i;
                arr[i - min] = i;

            }
        }
        for (int i = 0; i < max - min + 1; i++) {
            if (arr[i] != 0) //배열에 0이 아닌 수가 있을 경우를 검색
            {
                System.out.println(sum + "\n" + arr[i]); //제일 처음 0이 아닌 수가 나왔을 경우
                // 출력 후 프로그램 종료
                return;
            }
        }
        System.out.println("-1"); // 소수가 없을 경우 -1 출력 후 종료
        return;
    }
}
