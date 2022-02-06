package Baekjoon0110;

import java.util.Scanner;
import java.util.Stack;

public class charReverse2_9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder= new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            char[] input = sc.nextLine().toCharArray();
            for(int i=0;i<input.length;i++){
                if(input[i]==' '){ // 띄어쓰기를 만날 경우 스텍에 쌓아논 단어들을 저장한다.
                    while(!stack.isEmpty()){
                        stringBuilder.append(stack.pop());
                    }
                    stringBuilder.append(' ');
                }
                else stack.push(input[i]); // 입력
            }

            while(!stack.isEmpty()){ // 마지막에 입력된값 저장
                stringBuilder.append(stack.pop());
            }

            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
