package Baekjoon0110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class charReverse_9093 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String str = br.readLine() + "\n";
            Stack<Character> st = new Stack<Character>();

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
                    while(!st.empty()) {
                        System.out.print(st.pop());
                    }
                    System.out.print(str.charAt(j));
                }else {
                    st.push(str.charAt(j));
                }
            }
        }
    }
}
