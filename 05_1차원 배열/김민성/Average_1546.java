package Baekjoon;

import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] number = new int[n];
        int max =0;
        double sum=0.0;
        for (int i=0; i<number.length; i++) {
            number[i]=sc.nextInt();
            if(max<number[i])
                max=number[i];
        }
        for (int i=0; i<number.length;i++) {
            sum += ((double)number[i] /(double)max)*100;
        }
        System.out.println(sum/number.length);
    }
}
