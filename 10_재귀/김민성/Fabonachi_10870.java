package Baekjoon0106;

import java.util.Scanner;

public class Fabonachi_10870 {
    public static int Fabo(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        return Fabo(n - 1) + Fabo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fabo(n));
    }
}
