package airport2;

import java.util.List;
import java.util.Scanner;

import airport2.FlightDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======== 출발일을 입력하세요 ========");
        System.out.println("ex ) 20220126");
        // depPlandTime의 값이 길이가 8자가 아니면 프로그램을 종료한다.
        String depPlandTime = sc.nextLine();
        if (depPlandTime.length() != 8) {
            System.out.println("출발일을 잘못 입력하셨습니다.");
            System.exit(0);
        }

        System.out.println("======== 출발지를 입력하세요 ========");
        System.out.println("ex ) 무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해");
        System.out.println("ex ) 사천, 울산, 인천, 김포, 포항, 대구, 청주");
        // depAirportNm 값이 길이가 2자가 아니면 프로그램을 종료한다.
        String depAirportNm = sc.nextLine();
        if (depAirportNm.length() != 2) {
            System.out.println("출발지를 잘못 입력하셨습니다.");
            System.exit(0);
        }

        System.out.println("======== 도착지를 입력하세요 ========");
        System.out.println("ex ) 무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해");
        System.out.println("ex ) 사천, 울산, 인천, 김포, 포항, 대구, 청주");
        // arrAirportNm 값이 길이가 2자가 아니면 프로그램을 종료한다.
        String arrAirportNm = sc.nextLine();
        if (arrAirportNm.length() != 2) {
            System.out.println("도착지를 잘못 입력하셨습니다.");
            System.exit(0);
        }

        List<Item> flighList = DownloadFlight.getFlightList(depPlandTime, depAirportNm, arrAirportNm);
        // System.out.println(flightList);
        for (int i = 0; i < flighList.size(); i++) {
            System.out.println("========================");
            System.out.println("출발시간 : " + flighList.get(i).getDepPlandTime());
            System.out.println("도착시간 : " + flighList.get(i).getArrPlandTime());
            System.out.println("요금 : " + flighList.get(i).getEconomyCharge());
            System.out.println("항공사 : " + flighList.get(i).getAirlineNm());
            System.out.println("========================");
        }

    }
}