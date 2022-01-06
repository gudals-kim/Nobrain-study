package Baekjoon;

import java.util.Scanner;

public class Quadrant_14681 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(0 < a && 0 < b) {
            System.out.println("1");
        }else if(0 < a && 0 > b){
            System.out.println("4");
        }else if(0 > a && 0 < b) {
            System.out.println("2");
        }else {
            System.out.println(3);
        }
    }
}
