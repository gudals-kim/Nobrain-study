package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Max_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[9];

        for(int i = 0; i < 9; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];
        int index = 0;

        for(int j = 1; j < 9; j++) {
            if(number[j] > max) {
                max = number[j];
                index = j;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
