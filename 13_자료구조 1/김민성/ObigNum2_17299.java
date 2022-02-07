package Baekjoon0110;

import java.util.Scanner;
import java.util.Stack;

public class ObigNum2_17299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] F = new int[1000001]; //각 F값을 채우기위한 배열
        int[] in =new int[n]; // 입력값 저장
        for (int i = 0; i < n; i++){
            in[i]=sc.nextInt();
            F[in[i]]+=1;
        }
        for (int i = 0; i < n; i++){
            while(!st.isEmpty()&&F[in[st.peek()]]<F[in[i]]){
                in[st.pop()]=in[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            in[st.pop()]=-1;
        }
        for(int v :in){
            sb.append(v).append(' ');
        }
        System.out.println(sb);
    }
}
