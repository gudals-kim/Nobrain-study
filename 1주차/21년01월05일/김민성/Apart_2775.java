package Baekjoon1105;

import java.util.Scanner;

public class Apart_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] apart = new int[15][15]; //1층 부터 15층까지

        for(int i = 1; i < apart.length; i++) { // 0층 주민 저장
            apart[0][i] = i;
        }
        for(int i = 1; i < apart.length; i++) { // 1층 1호부터 저장
            int down = 0;
            for(int j = 1; j < apart.length; j++) {
                apart[i][j] = apart[i-1][j] + down;
                down = apart[i][j];
            }
        }

        int n = sc.nextInt(); // 테스트 갯수
        for(int i = 0; i < n; i++) {
            int floor = sc.nextInt(); // 몇 층
            int ho = sc.nextInt(); // 몇 호
            System.out.println(apart[floor][ho]);
        }
    }
}
