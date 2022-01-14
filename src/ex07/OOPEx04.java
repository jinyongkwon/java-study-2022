package ex07;

// 1. 자바는 모든 코드가 class 내부에 있어야 한다.
// 2. 자바는 즉 class만 1급
// 3. class = 설계도
// 4. 클래스는 상태(변수)와 행위(메서드)를 가진다.
// 5. static은 찾을 때 클래스명, 변수명
// 6. static이 아닌 애들은 메모리에 뛰우는 법 new 클래스명() => heap에 뜬다.

class Dog {
    int 배고픔 = 100; // 0~100

    void 밥먹기() {// 메서드 = 행위
        배고픔 = 0;
    }
}

public class OOPEx04 {

    public static void main(String[] args) {
        Dog ddd = new Dog();
        System.out.println(ddd.배고픔);
        ddd.밥먹기(); // 행위
        System.out.println(ddd.배고픔);
    }
}
