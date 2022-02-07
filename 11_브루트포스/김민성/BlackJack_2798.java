package Baekjoon0106;

import java.util.Scanner;

public class BlackJack_2798<closeSum> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt(); // 카드의 갯수
        int cardSum = sc.nextInt(); // 원하는 카드 3장의 합
        int sum = 0;
        int closeSum = 0;
        int[] bJack = new int[card];

        for (int i = 0; i < card; i++) {
            bJack[i] = sc.nextInt();
        }

        for (int i = 0; i < card - 2; i++) { // 1 번째 card
            for (int j = i + 1; j < card; j++) { // 2 번째 card
                for (int k = j + 1; k < card; k++) { // 3 번째 card
                    sum = bJack[i] + bJack[j] + bJack[k];  // card 3장의 합

                    if (cardSum >= sum) {  // 만약 원하는 카드 3장의 합이 뽑은 card 3장의 합 보다 같거나 크면
                        if (closeSum <= sum)
                            closeSum = sum;
                    }
                    sum = 0;
                }
            }
        }
        System.out.println(closeSum);
    }
}
