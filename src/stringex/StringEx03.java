package stringex;

import java.util.Scanner;

class Human {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public Human(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}

public class StringEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, tel;
        char gender;
        int age;

        String people = sc.nextLine();
        String tokens[] = people.split("-");

        if (tokens[0].equals("A01")) {
            String splitname[] = tokens[1].split(":");
            String splittel[] = tokens[2].split(":");
            String splitgender[] = tokens[3].split(":");
            String splitage[] = tokens[4].split(":");

            name = splitname[1];
            tel = splittel[1];
            gender = splitgender[1].charAt(0);
            String divage = splitage[1].trim();
            age = Integer.parseInt(divage);

            Human me = new Human(name, tel, gender, age);
            System.out.println("제 이름은 : " + me.getName());
            System.out.println("제 번호는 : " + me.getTel());
            System.out.println("제 성별은 : " + me.getGender());
            System.out.println("제 나이는 : " + me.getAge());

        } else {
            System.out.println("프로그램 종료");
        }
    }
}
