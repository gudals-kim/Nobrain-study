package Baekjoon;

import java.util.Scanner;

public class sumCycle_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int save = n;

        int count=0;
        while(true) {
            String str = "";
            str+= save%10;
            str+=  ((save/10) +(save%10))%10;

            save =Integer.parseInt(str);
            count++;

            if(save==n) {
                System.out.println(count);
                break;
            }
        }
    }
}
