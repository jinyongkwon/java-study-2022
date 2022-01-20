package stringex.practice;

public class Test8 {
    public static void main(String[] args) {
        String str = "AB CD";
        String replaceAll = str.replaceAll("\\p{Space}", "*"); // 정규표현식을 지정한 문자로 바꿔서 출력
        System.out.println("replaceAll: " + replaceAll);
    }
}
