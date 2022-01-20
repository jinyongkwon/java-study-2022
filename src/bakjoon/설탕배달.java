package bakjoon;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, three, five, fivediv, fiveafter, threediv, threeafter;
        int end = 0;

        n = sc.nextInt();
        three = 3;
        five = 5;
        fivediv = n / five;
        fiveafter = n % five;

        if (fiveafter == 0) {
            System.out.println(fivediv);
        } else {
            threediv = fiveafter / three;
            threeafter = fiveafter % three;
            while (threeafter != 0) {
                fivediv -= 1;
                threeafter += 5;
                threediv += (threeafter / three);
                if (fivediv < 0 && threeafter > 0) {
                    System.out.println("-1");
                    threeafter = 0;
                    end = 1;
                }
                threeafter %= three;
            }
            if (end == 0) {
                System.out.println(fivediv + threediv);
            }
        }
    }
}
