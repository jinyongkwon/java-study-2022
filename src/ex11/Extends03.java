package ex11;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!!
class 애완동물 {
    void sound() {
    }

    String name() {
        return "";
    }

    void changename() {

    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }

    String name() {
        return name;
    }

    void changename() {
        name = "길멍이";
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void sound() {
        System.out.println("야옹");
    }

    String name() {
        return name;
    }

    void changename() {
        name = "길냥이";
    }
}

public class Extends03 {

    static void start(애완동물 u1) {
        u1.sound();
        System.out.println(u1.name());
        u1.changename();
        System.out.println(u1.name());
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이();
        강아지 dog = new 강아지();
        start(cat);
        start(dog);
    }
}