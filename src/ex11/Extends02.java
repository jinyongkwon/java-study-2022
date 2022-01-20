package ex11;

class 동물 {

    String name() {
        return "";
    };

    int hp() {
        return 0;
    }

    int attack() {
        return 0;
    }

    void demagehp(int a, int b) {
        ;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String name() {
        return name;
    };

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    void demagehp(int a, int b) {
        hp = a - b;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String name() {
        return name;
    };

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    void demagehp(int a, int b) {
        hp = a - b;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String name() {
        return name;
    };

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    void demagehp(int a, int b) {
        hp = a - b;
    }
}

public class Extends02 {

    // 오버라이딩 = 무효화하다 ->아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        System.out.println(unit2.name() + "가(이) 공격당하고 있습니다.");
        // unit2.hp() = unit2.hp() - unit1.attack() <= 메서드를 호출한것 변수가 아니라 값을 변경할수 없기 때문에
        // 오류가남
        unit2.demagehp(unit2.hp(), unit1.attack());
        System.out.println(unit2.name() + "의 hp : " + unit2.hp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, bear);
    }
}
