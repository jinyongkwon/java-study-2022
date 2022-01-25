package cafe;

import java.util.List;

public class Menu {
    private List<MenuItem> item;

    public Menu(List<MenuItem> item) {
        this.item = item;
    }

    public MenuItem choose(String name) {
        for (MenuItem each : item) {
            if (each.getName().equals(name)) {
                return each;
            }
        }

        return null;
    }
}
