package srp;

public class 요리사 {
    public 음식 음식생성() {
        음식 jjajang = new 음식("짜장면"); // 음식은 요리사만 만들어야할 책임이 있다.
        return jjajang;
    }
}
