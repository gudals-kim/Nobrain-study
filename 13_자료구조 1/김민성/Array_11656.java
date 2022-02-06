package Baekjoon0118;

import java.util.Arrays;
import java.util.Scanner;

public class Array_11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] stra = new String[str.length()];

        for (int i = 0; i < stra.length; i++) {
            // 이름에서 인덱스 번호에 해당하는 것들을 떼어준다.
            stra[i] = str.substring(i);
        }
        Arrays.sort(stra);

        for (String s : stra) {
            System.out.println(s);
        }
    }
}
