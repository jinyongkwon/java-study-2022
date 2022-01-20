package ex11.p2;

import ex11.p1.AccessEx01; // p1패키지에 있는 ex01에 접근

public class AccessEx02 {
    public static void main(String[] args) {
        AccessEx01 a1 = new AccessEx01(); // alt + shift + o
        a1.m1(); // AccessEx01 class를 생성자를 통해 호출하고 m1 메서드를 사용

        AccessEx03 a3 = new AccessEx03(); // AccessEx03 class를 생성자를 통해 호출
        a3.m3(); // m3 메서드 사용
        // a3.m4(); // m4 메서드는 private이여서 호출이 불가
        a3.통로(); // public으로 만든 통로를 통해서 private인 m4를 호출
    }
}