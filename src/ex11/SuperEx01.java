package ex11;

class 가구 {
    String name = "가구";

    가구() { // 부모가 있을때 자식이 메모리에 뜨려면 부모는 디폴트 생성자 여야한다.
    }

    가구(int num) { // 하지만 이렇게 매개변수가 있는 생성자를 만드는 방법도 있다. super()를 사용
        System.out.println("실행될까?");
    }
}

// is 관계
// 1. super는 부모의 heap공간, this는 자신의 heap공간
// 2.자식을 new하면 자식의 생성자에 super() 문장이 생략되어 있음. (상속의 관계)
class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super(1); // super() 이 문장이 항상 생략되어 있음. 내가 적으면 사라지고 적은걸 실행 -> 매개변수가 있는 부모 생성자 사용 가능
        System.out.println(super.name);
    }
}

// super 부모, this 자기자신
public class SuperEx01 {
    public static void main(String[] args) {
        침대 s = new 침대(); // 부모가 있기 때문에 new 가구(); 도 같이 된것
    }
}
