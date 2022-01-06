package Baekjoon;


import java.util.Scanner;

public class Alram {
    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();

        if (0 <= M && M <= 44) {
            M = 60 - (45 - M);
            if (1 <= H && H <= 23) {
                H = H - 1;
            } else if (H == 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else if (M >= 45 && M <= 59) {
            M = M - 45;
            System.out.println(H + " " + M);
        }
    }
}
