package Baekjoon0118;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class postfix2_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 피연산자의 갯수
        int n = Integer.parseInt(br.readLine());
        // 피연산자는 A-Z의 대문자이며 A부터 순서대로 사용
        char[] arr = br.readLine().toCharArray();
        // LIFO의 자료구조 Stack선언
        Stack<Double> stack = new Stack<>();
        // 키와 값으로 구성된 Map선언
        Map<Character,Double> map = new HashMap<>();
        // n의 갯수만큼 피연산자에 대응되는 값을 설정
        char key = 'A';
        for(int i = 0; i < n; i++) {
            map.put(key,Double.parseDouble(br.readLine()));
            key++;
        }

        for(int i = 0; i < arr.length; i++) {
            // 인덱스의 값이 A 부터 Z인 경우
            if('A' <= arr[i] && arr[i] <= 'Z') {
                stack.push(map.get(arr[i]));
            }
            else{
                double answer1 = stack.pop();
                double answer2 = stack.pop();

                switch (arr[i]) {
                    case '+' :
                        stack.push(answer2 + answer1);
                        break;
                    case '-' :
                        stack.push(answer2 - answer1);
                        break;
                    case '*' :
                        stack.push(answer2 * answer1);
                        break;
                    case '/' :
                        stack.push(answer2 / answer1);
                        break;
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}
