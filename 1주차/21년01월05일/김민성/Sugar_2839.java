package Baekjoon1105;

import java.util.Scanner;

public class Sugar_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 2 || n == 4 || n == 7) {
            System.out.println("-1");
        } else if ((n % 5 == 1) || (n % 5 == 3)) {
            System.out.println(n / 5 + 1);
        } else if ((n % 5 == 2) || (n % 5 == 4)) {
            System.out.println(n / 5 + 2);
        } else if (n % 5 == 0) {
            System.out.println(n / 5);
        }
    }
}
