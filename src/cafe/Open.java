package cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Open {
    public static void main(String[] args) {
        Guest guest = new 홍길동("홍길동");
        Barista barista = new 공유("공유");
        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카페라떼", 2000);
        MenuItem m3 = new MenuItem("카라멜마키아또", 2500);
        MenuItem m4 = new MenuItem("돌체라떼", 3000);
        List<MenuItem> menuitem = new ArrayList<>(Arrays.asList(m1, m2, m3, m4));
        Menu menu = new Menu(menuitem);

        guest.order("돌체라떼", menu, barista);
    }
}
