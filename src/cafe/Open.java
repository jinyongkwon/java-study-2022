package cafe;

public class Open {
    public static void main(String[] args) {
        Guest 홍길동 = new Guest();
        Menu 메뉴 = new Menu();
        Barista 공유 = new Barista();

        홍길동.order(메뉴, 공유);
    }
}
