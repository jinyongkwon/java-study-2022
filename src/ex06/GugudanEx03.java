package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {
        for (int step = 2; step <= 9; step++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(step + "*" + i + "=" + (step * i)); // 구구단 2중 for문
            }
        }
    }
}