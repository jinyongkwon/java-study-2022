package ex10;

class Car {
    public int speed;
    public int gear;
    public String color;

    public Car() {
        speed = 0;
        gear = 1;
        color = "red";
    }

    public void speedUp() {
        speed += 10;
    }

    public String toString() {
        return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
    }
}

public class CarArrayTest {
    public static void main(String[] args) {
        final int num_cars = 5;
        Car[] cars = new Car[num_cars];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }
        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp();
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            ;
        }
    }
}
