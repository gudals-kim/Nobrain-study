package Baekjoon;

import java.util.Scanner;

public class ThreeInteger_10430 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int c = b%10; // 일의 자리
        int d = (b%100)/10; // 십의 자리
        int e = b/100;
        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*b);
    }
}
