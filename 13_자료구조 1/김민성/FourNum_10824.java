package Baekjoon0118;

import java.util.Scanner;

public class FourNum_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        String sum1 = a + b;
        String sum2 = c + d;

        long A = Long.parseLong(sum1);
        long B = Long.parseLong(sum2);

        System.out.println(A+B);

    }
}
