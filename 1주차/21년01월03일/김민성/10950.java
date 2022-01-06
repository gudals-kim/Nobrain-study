package Baekjoon;

import java.util.Scanner;

public class sumAB3_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int n = sc.nextInt();
        int[] sum = new int[n];

        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum[i]=a+b;
        }
        for(int j = 0; j < n; j++) {
            System.out.println(sum[j]);
        }
    }
}
