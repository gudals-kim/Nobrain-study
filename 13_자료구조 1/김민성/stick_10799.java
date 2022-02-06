package Baekjoon0110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stick_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') cnt += stack.size();
                else cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}