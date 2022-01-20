package ex10;

import java.util.Scanner;

public class ArrayTest5 {
    final static int students = 5;

    private static void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하세요: ");
            array[i] = scan.nextInt();
        }
    }

    private static void getAverage(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("평균 성적은" + total / array.length + "입니다");
    }

    public static void main(String[] args) {
        int[] scores = new int[students];
        getValues(scores);
        getAverage(scores);
    }
}
