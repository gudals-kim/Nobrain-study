package Baekjoon;

import java.util.Scanner;

public class sumAB7_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];
        int a, b;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum[i] = a + b;
        }

        for(int j = 0; j < n; j++){
            System.out.println("Case #" + (j+1) + ": " + sum[j]);
        }
    }
}
