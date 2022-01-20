package srp;

// 종업원 - 요리사 (의존성)
public class 종업원 {
    public 음식 주문받기(요리사 chef) { // 종업원은 요리사에 의존적이기 때문에 매개변수를 받음
        음식 jjajang = chef.음식생성(); // c : 음식이 만들어진 heap공간이 만들어진 주소
        return jjajang; // 아무것도 없음.
    }
}
