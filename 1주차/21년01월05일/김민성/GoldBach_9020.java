package Baekjoon1105;

import java.util.Scanner;

public class GoldBach_9020<a> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        for (int i = 0; i < testNum; i++) {
            int a = sc.nextInt();
            bach(a);
        }
    }

    public static void bach(int a) {
        int num = 0;
        for (int i = 2; i <= (a / 2); i++){
            if(!decimal(i)) continue;
            if(decimal(i)&&decimal(a-1))
                num=i;
        }
        System.out.println(num + " " + (a-num));
    }

    public static boolean decimal(int a) {
        for(int i = 2; i< Math.sqrt(a); i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
