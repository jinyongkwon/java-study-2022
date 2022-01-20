package ex11;

/*
 * 신입이 실수하지 않는 설계를 해보자!!
 * 신입이 실수하면 내 책임이니까!! 
 */

// abstract class 추상클래스 특징
// 1. new할 수 없다.
// 2. 추상 메서드를 만들 수 있다. (객체의 행위를 공통적으로 정의할 수 없을때 ex)동물은 움직이지만 날아서 움직이는 동물, 걸어서 움직이는 동물로 나뉨.)
// 3. 일반 메서드도 만들 수 있다.(모든 구체적인 애들의 공통적인 것 ex)모든 동물은 입으로 밥먹음)
abstract class ProtossUnit { // 종족이름
    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();
}

// 1. 일반 클래스는 추상 메서드를 가질 수 없다.
class Zealot extends ProtossUnit { // 근거리 공격
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

class Dragoon extends ProtossUnit { // 원거리 공격
    String name = "드라군";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

class DarkTempler extends ProtossUnit {
    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

public class Extends04 {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1. u1이 u2를 공격 => u2.hp = u2.hp - u1.attack => 자식변수에 접근 불가 => 오버라이드 사용
        u2.setHp(u2.getHp() - u1.getAttack());
        // 2. u2의 hp를 출력 => sysout(u2.hp)
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        ProtossUnit dt1 = new DarkTempler();
        attack(z1, d1);
        attack(dt1, z1);
    }
}
