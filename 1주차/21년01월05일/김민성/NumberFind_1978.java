package Baekjoon1105;

import java.util.Scanner;

public class NumberFind_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] number = new int[n];
        int count = 0;
        int pCount = 0;

        for(int i = 0; i < n; i++) {
            count = 0;
            number[i] = sc.nextInt();
            for(int j = 2; j <= number[i]; j++) {
                if(number[i]%j == 0) {
                    count++;
                }
            }
            if(count == 1)
                pCount++;
        }
        System.out.println(pCount);
    }
}
