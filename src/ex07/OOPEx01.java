package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {
    public static void main(String[] args) {
        // new는 heap공간에 할당하라는 키워드
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다. => static은 이미 떠있기 때문에 뜰 필요가 없음.

        Car s1 = new Car();
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

        new Car();
    }
}
