package bakjoon;

import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double add, alladd = 0; // 순서대로 버블정렬에 쓸 add 변수, 평균을 구할때쓸 alladd변수
        int study; // 과목 수

        study = sc.nextInt(); // 과목 수 입력
        double div[] = new double[study]; // 처음 점수를 넣을 과목수 크기의 배열 생성
        double num[] = new double[div.length]; // 나중에 바뀐 점수를 넣을 과목수 크기의 배열 생성.
        for (int i = 0; i < div.length; i++) { // 배열의 크기(과목 수)만큼 점수 입력.
            div[i] = sc.nextInt();
        }

        // 최고 점수 구하기(버블 정렬)
        for (int j = 1; j < div.length; j++) { // 돌때마다 맨앞에 큰값이 차곡차곡 쌓이는 방식(내림차 순)
            for (int i = 0; i < div.length - j; i++) {// 돌때마다 맨앞부터 쌓이기 때문에 도는 횟수를 한번씩 줄이며 돌림
                if (div[i] < div[i + 1]) { // i번째공간의 값이 i+1번의 공간이 값이 작을경우
                    add = div[i]; // add에다가 i번째 공간의 값을 넣어놓음
                    div[i] = div[i + 1]; // i번째 공간의 값을 i+1번의 값으로 변경
                    div[i + 1] = add; // i+1번째 공간의 값을 add에다가 넣어놓은 i번째 값으로 변경
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = div[i] / div[0] * 100; // 바뀐 점수를 넣을 배열에 과목 점수 / 최고점수 *100 해서 새로 넣음.
            alladd = alladd + num[i]; // 새로운 과목별 점수를 모두 더함
        }

        System.out.println(alladd / study); // 모두 더한 값에 과목 수를 나눠서 새로운 평균을 구함.
    }
}
