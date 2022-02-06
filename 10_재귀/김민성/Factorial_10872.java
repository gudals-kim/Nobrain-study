package Baekjoon0106;

import java.util.Scanner;

public class Factorial_10872 {
    public static int fact(int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            if(n == 0) {
                System.out.println("1");
            }else {
                sum *= i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
