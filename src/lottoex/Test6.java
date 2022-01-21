package lottoex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 6. ArrayList 로또 2개 만들어서 비교해보기
        // Mock
        List<Integer> lotto1 = Arrays.asList(1, 3, 4, 5, 6, 7);
        ArrayList<Integer> lotto2 = new ArrayList<>();

        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(4);
        lotto2.add(5);
        lotto2.add(6);
        lotto2.add(7);

        // 두개 비교하는 코드
        int failcheck = 0;
        final int LOTTOCYCLE = 6; // final이 붙은 변수는 대문자로 정의한다.

        for (int i = 0; i < LOTTOCYCLE; i++) { // lotto1.size()로 비교하게 되면 스택이 증가하고 큐가 증가하게되므로 변하지 않는 수라면 상수를 사용하는것이 좋다.
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println("테스트 성공");
            } else {
                failcheck++;
            }
        }

        if (lotto1.get(0) == lotto2.get(0)) {
            System.out.println("0 번지의 값이 일치합니다.");
        } else {
            failcheck++;
        }
        if (lotto1.get(1) == lotto2.get(1)) {
            System.out.println("1 번지의 값이 일치합니다.");
        } else {
            failcheck++;
        }
    }
}
