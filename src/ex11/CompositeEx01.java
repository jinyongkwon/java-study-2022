package ex11;

class 엔진 {
    int power = 5000;
}

// has 관계를 만드는 법 = 콤포지션
// 생성자로 주입 받기
// 상속의 관계가 아닐때 다른 클래스의 것을 써야할때 사용
class 소나타 {

    // has 관계 => 소나타는 엔진에 의존적이다.
    // 구체적인 것에 의존하고 있는 것은 강한 결합 ex)BMW엔진, 침대
    // 추상적인 것에 의존하고 있는 것은 느슨한 결합 (코드 수정이 필요없다.) ex)엔진, 가구
    엔진 engine; // 편하게 쓰려고 절대 초기화 시키면 안됨. 추후에 추상화를 하게되면 엔진이 추가될때마다 바꿔야함

    소나타(엔진 engine) {
        this.engine = engine;
    }

}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);

    }
}
