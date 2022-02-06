package Baekjoon0107;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class numberSort2_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        // list 계열 중에 하나를 사용
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int num : list) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}
