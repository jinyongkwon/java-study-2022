package ex22;

import java.util.HashSet;
import java.util.Random;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Integer> lotto = new HashSet<Integer>();
        while (true) {
            int n = r.nextInt(45) + 1; // 45 = 0~44 => +1 = 1~45
            lotto.add(n);
            if (lotto.size() == 6) {
                break;
            }
        }

        System.out.println(lotto);
    }
}
