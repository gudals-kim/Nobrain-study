package Baekjoon0105;

import java.util.Scanner;

public class find_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int crossCount = 1;
        int countSum = 0;

        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위를 판별한다.
            if (n <= countSum + crossCount) {
                if (crossCount % 2 == 1) { // 만약 대각선의 갯수가 홀수라면 분모가 큰 수부터 시작한다.
                    // 분모는 대각선 갯수 - (n번째 - 직전 대각선까지의 누적 - 1)
                    // 분자는 n번째  - 직전 대각선까지의 누적합
                    System.out.print((crossCount - (n - countSum - 1)) + "/" + (n - countSum));
                    break;
                } else { // 만약 대각선의 갯수가 짝수라면
                    // 홀수 일 때의 출력을 반대로 하면 된다.
                    System.out.print((n - countSum) + "/" + (crossCount - (n - countSum - 1)));
                    break;
                }
            } else {
                countSum += crossCount;
                crossCount++;
            }
        }
    }
}
