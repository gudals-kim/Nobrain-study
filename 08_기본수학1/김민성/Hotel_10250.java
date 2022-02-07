package Baekjoon0105;

import java.util.Scanner;

public class Hotel_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // test 갯수


        for (int i = 0; i < n; i++) {
            int Height = sc.nextInt(); // 호텔 높이
            int room = sc.nextInt(); // 각 층의 방 갯수
            int host = sc.nextInt(); // 몇 번째 손님인지

            int count = 0;
            int[] save = new int[10000];
            for (int j = 1; j <= room; j++) {
                for (int k = 1; k <= Height; k++) {
                    save[count] = ((k * 100) + j);
                    count++;
                }
            }
            System.out.println(save[host - 1]);
        }
    }
}
