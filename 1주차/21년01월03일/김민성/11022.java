package Baekjoon;


import java.util.Scanner;

public class sumAB8_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = a[i] + b[i];
        }
        for(int j = 0; j < n; j++){
            System.out.println("Case #" + (j+1) + ": " + a[j] + " + " + b[j] + " = " + sum[j]);
        }
    }
}
