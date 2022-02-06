package bakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> student = new ArrayList<>();
        ArrayList<Integer> credit;
        int classes = sc.nextInt();

        for (int j = 0; j < classes; j++) {
            student.add(sc.nextInt());
            credit = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < student.get(j); i++) {
                credit.add(sc.nextInt());
                sum += credit.get(i);
            }
            double ave = sum / student.get(j);
            double count = 0;
            for (int i = 0; i < student.get(j); i++) {
                if (ave < credit.get(i)) {
                    count++;
                }
            }
            double result = (Math.round((count / student.get(j)) * 100 * 1000) / 1000.0);
            System.out.println(String.format("%.3f", result) + "%");
        }
    }
}