package ex12;

import java.util.Arrays;

class Student implements Comparable {
    private String name;
    private double gpa;

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public int compareTo(Object obj) {
        Student other = (Student) obj;
        if (gpa < other.gpa) {
            return -1;
        } else if (gpa > other.gpa) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 3.39);
        students[1] = new Student("임꺽정", 4.21);
        students[2] = new Student("황진이", 2.19);

        Arrays.sort(students);
        for (Student s : students) {
            System.out.println("이름 = " + s.getName() + "평점 : " + s.getGPA());
        }
    }
}
