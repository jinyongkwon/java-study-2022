package bakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> student = new ArrayList<>(); // 학생 리스트
        ArrayList<Integer> credit; // 성적 리스트
        int classes = sc.nextInt(); // 학급의 수 입력.

        for (int j = 0; j < classes; j++) { // 학급의 수만큼 반복.
            student.add(sc.nextInt());// 학생 리스트에 학생의 수를 추가.
            credit = new ArrayList<>();// 성적 리스트 생성.
            int sum = 0; // 성적의 총 합
            for (int i = 0; i < student.get(j); i++) { // 학생의 수만큼 반복.
                credit.add(sc.nextInt()); // 성적 리스트에 성적 추가.
                sum += credit.get(i); // 성적을 추가할때마다 성적의 총 합에 더함.
            }
            double ave = sum / student.get(j); // 학급의 평균을 구함.
            int count = 0; // 평균을 넘은 학생의 수
            for (int i = 0; i < student.get(j); i++) { // 학생의 수만큼 반복.
                if (ave < credit.get(i)) { // 만약 평균보다 학생의 성적이 높으면
                    count++; // 평균을 넘은 학생의 수 1 추가
                }
            }

            // 소수점 3자리 까지 출력하기 위해 count를 double로 형변환
            // Math.round를 사용하여 %수치로 변환
            // String.format을 사용하여 소수점 3자리 까지 무조건 출력
            double result = (Math.round(((double) count / student.get(j)) * 100 * 1000) / 1000.0);
            System.out.println(String.format("%.3f", result) + "%");
        }
    }
}