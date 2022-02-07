package Baekjoon0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Charlength_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String str = br.readLine();

        int length = 0;

        for(int i = 0; i < str.length(); i++) {
            length++;
        }
        System.out.println(length);
    }
}
