package stringex.practice;

public class Test10 {
    public static void main(String[] args) {
        String str = "ABCDEF";
        String substring = str.substring(1, 4); // 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
        System.out.println("substring: " + substring);
    }
}
