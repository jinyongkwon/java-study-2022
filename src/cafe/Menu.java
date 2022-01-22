package cafe;

import java.util.List;

public class Menu {
    private List<MenuItem> sc;

    public void choose(MenuItem item) {
        // item.getName();
        // item.getPrice();
    }

    public List<MenuItem> getSc() {
        return sc;
    }

    public void setSc(List<MenuItem> sc) {
        this.sc = sc;
    }
}
