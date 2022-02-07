package Baekjoon0107;

import java.util.Arrays;
import java.util.Scanner;

public class XYsort_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 받아야 할 좌표 갯수

        int[][] arr = new int[n][2]; // 2차원 배열

        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // x 좌표
            arr[i][1] = sc.nextInt(); // y 좌표
        }

        Arrays.sort(arr, (e1, e2) -> { // 람다식
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            else  {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
