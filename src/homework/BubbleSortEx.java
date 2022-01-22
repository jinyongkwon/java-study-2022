package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List의 크기를 입력하세요");
        final int size = sc.nextInt(); // 변하지 않는 값의 사이즈를 입력.
        int num, pick, up;
        List<Integer> list = new ArrayList<Integer>(size); // size = ArrayList의 사이즈(크기)를 지정
        System.out.println("\nList의 들어갈 숫자를 크기만큼 입력하세요"); // \n = 줄바꿈
        for (int i = 0; i < size; i++) {
            num = sc.nextInt();
            list.add(num); // list에 사이즈만큼 숫자 추가.
        }
        System.out.println("\n오름차순으로 버블정렬을 하실거면 1,\n내림차순으로 버블정렬을 하실거면 0을 눌러주세요.");
        up = sc.nextInt();
        if (up == 1) {
            System.out.println("\n오름차순 버블정렬을 시작합니다.");
            for (int i = 1; i < size; i++) { // 돌때마다 맨뒤에 큰값이 차곡차곡 쌓이는 방식
                for (int j = 0; j < size - i; j++) { // 돌때마다 맨뒤부터 쌓이기 때문에 도는 횟수를 한번씩 줄이며 돌림
                    if (list.get(j) > list.get(j + 1)) { // j번째공간의 값이 j+1번의 공간이 값이 클경우
                        pick = list.get(j); // pick에다가 j번째 공간의 값을 넣어놓음
                        list.set(j, list.get(j + 1)); // j번째 공간의 값을 j+1번의 값으로 변경
                        list.set(j + 1, pick); // j+1번째 공간의 값을 pick에다가 넣어놓은 j번째 값으로 변경
                    }
                }
            }
        } else {
            System.out.println("\n내림차순 버블정렬을 시작합니다.");
            for (int i = 1; i < size; i++) { // 오름차순과 방식은 같지만 작은값이 차곡차곡 쌓임.
                for (int j = 0; j < size - i; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                        pick = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, pick);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
