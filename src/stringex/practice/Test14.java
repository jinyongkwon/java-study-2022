package stringex.practice;

public class Test14 {
    public static void main(String[] args) {
        String s = "     java java java     ";
        String v;
        v = s.trim(); // 문자열에 양 끝 공백을 없에준다.
        System.out.println("trim:" + v);
    }
}
