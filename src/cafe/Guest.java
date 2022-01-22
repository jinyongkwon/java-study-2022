package cafe;

public class Guest {
    int price;
    String name;

    public void order(Menu menu, Barista barista) {
        // menu.choose(sc.getSc());
        barista.makeCoffee();
    }
}
