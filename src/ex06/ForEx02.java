package ex06;

public class ForEx02 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i < 25; i = i + 1) {
            System.out.println(i);
            result = result * 2;
        }
        System.out.println(result);
    }
}
