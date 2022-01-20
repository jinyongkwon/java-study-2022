package ex20;

import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Will Java change my life?");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
