package Baekjoon;


import java.util.Scanner;

public class GUGUDAN_2739 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        for(int i = 1; i <= 9; i++)
            System.out.println(N + " * " + i + " = " + N*i);
    }
}
