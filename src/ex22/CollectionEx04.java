package ex22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int money = sc.nextInt();
        // System.out.println("받은 금액 : " + money + "원");
        // int chance = money / 1000;
        // System.out.println("기회 : " + chance + "번");
        Random r = new Random();
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        while (true) {
            int num = r.nextInt(45) + 1;
            lotto.add(num);
            if (lotto.size() > 1) {
                for (int j = 0; j < lotto.size(); j++) {
                    for (int i = lotto.size() - 1; i == 0; i--) {
                        if (lotto.get(j) == lotto.get(i - j)) {
                            lotto.remove(i);
                        }
                    }
                }
            }
            if (lotto.size() == 6) {
                break;
            }
        }
        Collections.sort(lotto);
        HashSet<Integer> pick = new HashSet<Integer>();
        while (true) {
            int num = r.nextInt(45) + 1;
            pick.add(num);
            if (pick.size() == 6) {
                break;
            }
        }
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
        myTreeSet.addAll(pick);
        System.out.println(pick);
        System.out.println(lotto);
    }
}
