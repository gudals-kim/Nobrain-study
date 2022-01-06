package Baekjoon;

import java.util.Scanner;

public class numberSum_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 몇 개의 숫자를 받을 것인가
        String a = sc.next();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
