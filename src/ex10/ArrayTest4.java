package ex10;

import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        int total = 0;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요");
        size = scan.nextInt();
        int[] scores = new int[size];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("성적을 입력하세요: ");
            scores[i] = scan.nextInt();
        }
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("평균 성적은" + total / scores.length + "입니다");
    }
}
