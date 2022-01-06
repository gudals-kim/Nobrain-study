package Baekjoon1105;

import java.util.Scanner;

public class Benefit_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sPrice = sc.nextInt();
        int dPrice = sc.nextInt();
        int nPrice = sc.nextInt();

        if(dPrice >= nPrice) {
            System.out.println(-1);
        }
        else {
            System.out.println(sPrice/(nPrice-dPrice)+1);
        }
    }
}
