package stringex.practice;

public class Test17 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "c";
        boolean contains = str1.contains(str2); // 기준인 str1이 str2의 값을 포함하고 있으면 true, 다르면 false
        System.out.println("contains: " + contains);
    }
}
