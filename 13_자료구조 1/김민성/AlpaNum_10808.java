package Baekjoon0118;


// 아스키코드의 a~z값은 97~122로 이루어져있다.
//따라서 입력받은 문자열을 하나의 알파벳으로 변경하기 위해 toCharArray를 사용하여 배열str에 담아주었고, 알파벳의 개수는 총 26개로 배열을 선언하였다.
//str의 길이만큼 반복문을 수행하며, 알파벳에서 아스키코드의 a값을 뺀 인덱스에 1을 증가시켜주었다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlpaNum_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int[] alpa = new int[26];
        for(int i = 0; i < str.length; i++) {
            alpa[(int)str[i] - 97] += 1;
        }

        for(int i = 0; i <alpa.length; i++) {
            System.out.print(alpa[i] + " ");
        }
    }
}
