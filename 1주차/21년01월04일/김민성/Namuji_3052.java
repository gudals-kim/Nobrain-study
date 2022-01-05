package Baekjoon;

import java.util.Scanner;

public class Namuji_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int count = 0;
        int samecount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (sc.nextInt() % 42);
        }

        for (int i = 0; i < array.length; i++) {
            samecount = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    samecount++;
                }
            }
            if (samecount == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
