package ex04;

class ABC<K, V> {
    private K a;
    private V b;

    public ABC(K a, V b) {
        this.a = a;
        this.b = b;
    }

    public K getA() {
        return a;
    }

    public void setA(K a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

}

public class test {
    public static void main(String[] args) {
        ABC<Integer, String> a = new ABC<>(10, "승현");
        System.out.println(a.getA() + a.getB());
    }

}