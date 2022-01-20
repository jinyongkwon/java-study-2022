package ex20;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(1900 + d.getYear());
        System.out.println(d.getMonth() + 1);
        System.out.println(d.getDate());

        d.setHours(12);
        d.setMinutes(34);
        d.setSeconds(0);
        System.out.println(d);
    }
}
