package Baekjoon;

import java.util.Scanner;

public class OXQuiz_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str;

        for (int i = 0; i < n; i++) {
            str = sc.next();
            int count = 0;
            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
<<<<<<< HEAD

=======
>>>>>>> parent of ee64aa0 (Delete 05_1차원 배열/김민성 directory)
        }
    }
}
