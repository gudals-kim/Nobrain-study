package Baekjoon;

import java.util.Scanner;

public class OverAverage_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            int[] student = new int[sc.nextInt()];
            double sum = 0;
            double avg = 0.0;
            double count = 0.0;

            for(int j = 0; j < student.length; j++) {
                student[j] = sc.nextInt();
                sum += student[j];
            }
            avg = sum / (double)student.length;

            for (int a=0; a<student.length; a++) {
                if(avg<student[a]) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(double)(count/student.length)*100);
        }
    }
}
