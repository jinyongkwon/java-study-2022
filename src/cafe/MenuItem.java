package cafe;

public class MenuItem {
    private int Price;
    private String Name;

    public MenuItem(String name, int price) {
        Price = price;
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }

}
