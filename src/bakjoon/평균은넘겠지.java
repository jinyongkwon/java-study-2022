package bakjoon;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<Integer>();
        ArrayList<Integer> classs = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> testcase = new ArrayList<ArrayList<Integer>>();
        ArrayList<Double> average = new ArrayList<Double>();
        DecimalFormat form = new DecimalFormat("#.000");
        Scanner sc = new Scanner(System.in);
        int c, plus = 0, k = 0;
        int student;
        c = sc.nextInt();
        // 점수랑 다넣기
        for (int j = 0; j < c; j++) {
            student = sc.nextInt();
            classs.add(student);
            score = new ArrayList<Integer>();
            for (int i = 0; i < student; i++) {
                int num = sc.nextInt();
                score.add(num);
            }
            testcase.add(score);
        }

        // 케이스별 평균점수 계산
        for (int i = 0; i < c; i++) {
            int add = 0;
            for (int j = 0; j < classs.get(k); j++) {
                add = add + testcase.get(i).get(j);
            }
            k++;
            average.add((double) add);
            average.set(i, average.get(i) / classs.get(i));
        }

        // 케이스별 평균 퍼센트 계산
        k = 0;
        for (int i = 0; i < average.size(); i++) {
            for (int j = 0; j < classs.get(k); j++) {
                if (average.get(i) < testcase.get(i).get(j)) {
                    plus++;
                }
            }
            k++;
            average.set(i, (double) plus / classs.get(i) * 100);
            average.set(i, (double) Math.round(average.get(i) * 1000) / 1000);
            plus = 0;
        }

        // 출력
        for (int i = 0; i < average.size(); i++) {
            System.out.println(form.format(average.get(i)) + "%");
        }

    }
}
