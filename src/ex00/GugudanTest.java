package ex00;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("시작할 단을 입력하세요 (2~9)");
            int n1 = sc.nextInt();
            System.out.println("마지막 단을 입력하세요 (2~9)");
            int n2 = sc.nextInt();
            if (n1 <= n2) {
                for (int i = n1; i <= n2; i++) {
                    System.out.println(" ");
                    for (int j = 1; j <= 9; j++) {
                        System.out.println((i) + "*" + (j) + "=" + (i * j));
                    }
                }
                break;
            } else {
                System.out.println("시작할 단이 마지막 단보다 높습니다.");
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
