package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for(int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        Arrays.sort(number);
        System.out.println(number[0] + " " + number[n-1]);
<<<<<<< HEAD

=======
>>>>>>> parent of ee64aa0 (Delete 05_1차원 배열/김민성 directory)
    }
}
