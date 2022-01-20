package ex10;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        final int student = 5;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[student];
        for (int i = 0; i < student; i++) {
            System.out.println("성적을 입력하세요: ");
            scores[i] = scan.nextInt();
        }
        for (int i = 0; i < student; i++) {
            total += scores[i];
        }
        System.out.println("평균성적은 " + total / student + "입니다");
    }
}
