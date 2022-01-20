package stringex.practice;

public class Test15 {
    public static void main(String[] args) {
        int i = 12345;
        long l = 123123L;
        char c = '1';
        System.out.println("valueOf: " + String.valueOf(i)); // 지정한 개체의 원시 값을 반환
        System.out.println("valueOf: " + String.valueOf(l));
        System.out.println("valueOf: " + String.valueOf(c));
    }
}
