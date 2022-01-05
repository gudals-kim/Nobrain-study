package Baekjoon;

import java.util.Scanner;

public class Xnumber_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받는 갯수
        int[] number = new int[n];
        int c = sc.nextInt(); // 비교대상

        for(int i = 0; i < n; i++){
            number[i] = sc.nextInt();
        }

        for(int j = 0; j < n; j++){
            if(number[j] < c) {
                System.out.print(number[j] + " ");
            }
        }
    }
}
