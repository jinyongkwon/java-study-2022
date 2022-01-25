package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다.
        // 입력장치 => 출력장치 : InputStream
        // 출력장치 => 입력장치 : OutputStream
        InputStream s = System.in;
        try {
            int n = s.read();
            System.out.println((char) n); // char는 항상 아스키코드로 변환시켜줌
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream os = System.out;
    }
}
