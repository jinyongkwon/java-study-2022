package bakjoon;

import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double add, alladd = 0;
        int study;

        study = sc.nextInt();
        double div[] = new double[study];
        double num[] = new double[div.length];
        for (int i = 0; i < div.length; i++) {
            div[i] = sc.nextInt();
        }

        for (int j = 0; j < div.length - 1; j++) {
            for (int i = 0; i < div.length - 1; i++) {
                if (div[i] < div[i + 1]) {
                    add = div[i];
                    div[i] = div[i + 1];
                    div[i + 1] = add;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = div[i] / div[0] * 100;
        }

        for (int i = 0; i < num.length; i++) {
            alladd = alladd + num[i];
        }

        System.out.println(alladd / study);
    }
}
