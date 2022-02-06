package Baekjoon0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toCharArray();

        for(int i = 0; i < str.length; i++) {
            if('A' <= str[i] && str[i] <= 'Z') {
                if('N' <= str[i]) {
                    str[i] -= 13;
                }else {
                    str[i] += 13;
                }
            }
            if('a' <= str[i] && str[i] <= 'z') {
                if('n' <= str[i]) {
                    str[i]-=13;
                }else {
                    str[i] += 13;
                }
            }
        }
        for (char c : str) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
