package stringex.practice;

public class Test21 {
    public static void main(String[] args) {
        int i = 123456;
        String str1 = String.format("%,d", i);
        String str2 = "123456";
        boolean matches = str1.matches(str2); // 지정한 정규 표현과 일치 할때 true를 반환
        System.out.println("matches: " + matches);
    }
}
