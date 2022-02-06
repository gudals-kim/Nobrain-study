package Baekjoon0105;

import java.util.Scanner;

public class GongJoon_4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int primenumber =0;
            int number = sc.nextInt();
            if(number==0) break;

            for(int i=number+1; i<=number*2; i++) {
                int count =0;
                int sqrt= (int)Math.sqrt(i)+1;     // Math.sqrt를 통해서 입력받은 수의 제곱근구하기

                for( int j=2; j<sqrt; j++) {      //  2~입력받은 수의 제곱근까지 반복문 돌기.
                    if(i%j==0) {                  // 모듈로를 통해 나머지가 0이되면 소수가 아니라는 것.
                        count=-1;
                        break;
                    }
                }
                if(count==0) {
                    primenumber++;
                }  }
            System.out.println(primenumber);
        }
    }
}
