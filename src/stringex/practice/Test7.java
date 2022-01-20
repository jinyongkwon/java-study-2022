package stringex.practice;

public class Test7 {
    public static void main(String[] args) {
        String str = "A*B*C*D";
        String replace = str.replace("*", "-"); // 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력
        System.out.println("replace: " + replace);
    }
}
