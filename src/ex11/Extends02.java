package ex11;

class 동물 {

    String getName() {
        return "";
    };

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;
    }

    void setHp(int hp) {

    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String getName() {
        return name;
    };

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

    void setHp(int hp) {
        this.hp = hp;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    };

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

    void setHp(int hp) {
        this.hp = hp;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    };

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

    void setHp(int hp) {
        this.hp = hp;
    }
}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 70;
    int attack = 70;

    String getName() {
        return name;
    };

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

    void setHp(int hp) {
        this.hp = hp;
    }
}

public class Extends02 {

    // 오버라이딩 = 무효화하다 ->아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        System.out.println(unit1.getName() + "가(이) " + unit2.getName() + "를(을) 공격하고 있습니다.");
        unit2.setHp(unit2.getHp() - unit1.getAttack());
        System.out.println(unit2.getName() + "의 hp : " + unit2.getHp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();
        동물 wolf = new 늑대();

        attack(lion, tiger);
        attack(lion, bear);
        attack(wolf, lion);
    }
}
