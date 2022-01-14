package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if(조건) => 그게 아니라 이것이라면
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점");
        } else if (point >= 80) { // point가 89~80 사이라면?
            System.out.println("B학점");
        } else if (point >= 70) { // point가 79~70 사이라면?
            System.out.println("C학점");
        } else if (point >= 60) { // point가 69~60 사이라면?
            System.out.println("D학점");
        } else { // point가 60아래라면?
            System.out.println("F학점");
        }
    }// 메인 끝
}