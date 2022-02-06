package bakjoon;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 순서대로 설탕무게, 3kg봉지, 5kg봉지, 5kg봉지에 담은것, 5kg봉지에 담고 남은것, 3kg봉지에 담은것, 3kg봉지에 담고
        // 남은것.
        int n, three, five, fivediv, fiveafter, threediv, threeafter;
        int end = 0;
        three = 3;
        five = 5;

        n = sc.nextInt(); // 설탕무게 입력.

        fivediv = n / five; // 5kg 봉지에 담은 값
        fiveafter = n % five; // 5kg 봉지에 담고 나머지 값

        if (fiveafter == 0) { // 5kg 봉지에 담고 나머지가 0이면 담은 값을 출력.
            System.out.println(fivediv);
        } else {
            threediv = fiveafter / three; // 3kg 봉지에 담은 값
            threeafter = fiveafter % three; // 3kg 봉지에 담고 남은 값.
            while (threeafter != 0) { // 3kg 봉지에 담고 나머지가 있으면 계속해서 반복.
                fivediv -= 1; // 5kg 봉지에 담은값 하나를 빼주고
                threeafter += 5; // 5kg을 3kg 나머지에 추가
                threediv += (threeafter / three); // 나머지를 다시 3kg 봉지에 담기.
                if (fivediv < 0 && threeafter > 0) { // 만약 5kg 봉지가 없고 3kg 나머지가 있으면
                    System.out.println("-1"); // -1을 출력하고
                    threeafter = 0; // 나머지를 0으로 만들고 반복문 종료
                    end = 1; // 마지막에 봉투 갯수가 출력되지 않게끔 end를 1로 바꿈
                }
                threeafter %= three; // 나머지를 다시 3kg봉지에 담음.
            }
            if (end == 0) { // 반복문을 빠져나왔을때 end가 디폴트값이면 봉지들의 갯수 출력.
                System.out.println(fivediv + threediv);
            }
        }
    }
}
