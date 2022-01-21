package lottoex;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력받아ㅓ 횟수 정하기 ex) 5000 -> 5회
        Scanner sc = new Scanner(System.in);
        long money = sc.nextInt();
        int count = (int) money / 1000;
        System.out.println("받은 금액 : " + money);
        System.out.println("로또 횟수 : " + count);

        // 테스트
        if (count == 5) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
}
