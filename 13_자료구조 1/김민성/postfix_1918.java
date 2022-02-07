package Baekjoon0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class postfix_1918 {
    // 우선순위를 정하는 메서드로 (의 우선순위는 3순위 +,-의 연산 기호는 우선순위가 2이고 *,/의 연산 기호는 우선순위가 1이다.
    // 이런 우선순위를 바탕으로 값을 비교하여 우선순위를 나타내준다.
    static int precedence(char ch) {
        if (ch == '(') {
            return 0;
        }
        if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자를 입력받아 문자별로 배열에 넣는다.
        char[] arr = br.readLine().toCharArray();
        // 출력을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 후입선출의 자료구조인 Stack 선언
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // 배열의 i번 째 요소가 A~Z인 경우
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                // sb에 넣는다.
                sb.append(arr[i]);
            } else if (arr[i] == '(') {
                stack.push(arr[i]);
            } else if (arr[i] == ')') {
                // 스택이 비어있지 않고, 스택의 최 상단이 열린 괄호일 경우
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        // pop을 수행하고 반복문을 빠져나온다.
                        stack.pop();
                        break;
                    }
                    // 그 외의 경우 sb에 pop을 수행한 값을 넣는다.
                    sb.append(stack.pop());
                }
            }
            // 그 외의 경우
            else {
                // 스택이 비어있지 않고, 스택의 최상단에 있는 값에 대한 우선순위와 배열의 i번째 값의 우선순위를 비교한다.
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(arr[i])) {
                    sb.append(stack.pop());
                }
                // 그 외의 경우 스택에 넣는다.
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // 결과 값 출력
        System.out.println(sb);
    }
}
