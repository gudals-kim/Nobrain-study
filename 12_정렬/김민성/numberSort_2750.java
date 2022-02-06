package Baekjoon0107;

import java.util.Arrays;
import java.util.Scanner;

public class numberSort_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt(); // 받을 수의 갯수
        int[] number = new int[n];

        for(int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);

        for(int num : number) {
            System.out.println(num);
        }
    }
}
