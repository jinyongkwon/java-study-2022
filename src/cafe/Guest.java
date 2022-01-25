package cafe;

abstract public class Guest {
    abstract public void order(String menuname, Menu menu, Barista barista);
}

class 홍길동 extends Guest {
    private final String name;

    public 홍길동(String name) {
        this.name = name;
    }

    @Override
    public void order(String menuname, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuname);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.println(
                name + "이 " + barista.getName() + "에게 " + coffee.getPrice() + "원 " + coffee.getName() + "을(를) 받았습니다.");
    }
}