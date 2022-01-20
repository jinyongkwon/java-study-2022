package ex22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CollectionEx04 {
    public static void main(String[] args) {
        // 사용 함수들
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); // 랜덤 메서드
        int num, same = 0; // 랜덤으로 들어가는 숫자, 맞춘횟수
        HashSet<Integer> setLotto = new HashSet<Integer>(); // 당첨 번호
        ArrayList<ArrayList<Integer>> chanceLotto = new ArrayList<ArrayList<Integer>>(); // 기회
        HashSet<Integer> pickLotto = new HashSet<Integer>(); // 뽑은 번호

        // 1000원당 기회 1번 부여
        int money = sc.nextInt(); // 투입금액
        System.out.println(); // 줄 뛰우기
        System.out.println("받은 금액 : " + money + "원");
        int chance = money / 1000; // 투입금액당 기회수
        System.out.println("기회 : " + chance + "번");

        // 당첨 번호 구하기.
        while (true) {
            num = r.nextInt(45) + 1;
            setLotto.add(num);
            if (setLotto.size() == 6) {
                break;
            }
        }

        // 자동으로 번호 뽑기
        while (true) {
            while (true) {
                num = r.nextInt(45) + 1;
                pickLotto.add(num);
                if (pickLotto.size() == 6) {
                    break;
                }
            }
            ArrayList<Integer> pick = new ArrayList<>(pickLotto); // 뽑은 번호를 ArrayList로 변환
            Collections.sort(pick); // 뽑은 번호를 정렬
            chanceLotto.add(pick); // 기회 1회 소모. => 뽑은 번호를 기회에 넣음 즉 1줄완성.
            if (chanceLotto.size() == chance) { // 기회수가 다되므로 break;
                break;
            }
            pickLotto = new HashSet<Integer>(); // 한줄 더 생성.
        }

        // 번호 출력
        ArrayList<Integer> lotto = new ArrayList<>(setLotto); // 당첨 번호 ArrayList로 변환
        Collections.sort(lotto); // // 당첨 번호 크기순으로 정렬
        System.out.println(); // 줄 뛰우기
        System.out.println("뽑은 번호 : " + chanceLotto); // 뽑은 번호 모두 출력
        System.out.println(); // 줄 뛰우기
        System.out.println("당첨 번호 : " + lotto); // 당첨 번호 모두 출력

        // 번호 비교
        for (int i = 0; i < chanceLotto.size(); i++) { // i = 기회
            System.out.println(); // 줄 뛰우기
            System.out.println(i + 1 + "번째 기회");
            for (int j = 0; j < 6; j++) { // j = 로또 당첨 번호
                for (int k = 0; k < 6; k++) { // k = 내가 뽑은 번호
                    if (lotto.get(j) == chanceLotto.get(i).get(k)) { // lotto.get(j) = 로또 당첨번호, chanceLotto.get(i) = 기회,
                                                                     // chanceLotto.get(i).get(k) = 내가 뽑은 번호
                        same++; // 당첨번호와 뽑은번호가 맞으면 맞춘갯수 1씩 증가
                    }
                }
            }
            if (same > 0) { // 맞춘갯수가 1이상 있으면
                System.out.println(same + "개 맞았습니다.");
            } else { // 맞춘갯수가 0이면
                System.out.println("꽝입니다");
            }
            same = 0; // 한번의 기회가 끝나면 맞춘갯수 초기화
        }
    }
}
