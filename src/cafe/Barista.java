package cafe;

abstract public class Barista {
    abstract public Coffee makeCoffee(MenuItem menu);

    abstract String getName();
}

class 공유 extends Barista {
    private final String name;

    public 공유(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Coffee makeCoffee(MenuItem menu) {
        Coffee coffee = new Coffee(menu);
        return coffee;
    }

}
