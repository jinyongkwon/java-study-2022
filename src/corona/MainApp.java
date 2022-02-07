package corona;

import java.util.List;
import java.util.Scanner;

import corona.ResponseDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== 시작일을 입력하세요 ========");
        System.out.println("ex ) 20220110");
        // depPlandTime의 값이 길이가 8자가 아니면 프로그램을 종료한다.
        String startCreateDt = sc.nextLine();
        if (startCreateDt.length() != 8) {
            System.out.println("시작일을 잘못 입력하셨습니다.");
            System.exit(0);
        }
        System.out.println("======== 종료일을 입력하세요 ========");
        System.out.println("ex ) 20220115");
        // depPlandTime의 값이 길이가 8자가 아니면 프로그램을 종료한다.
        String endCreateDt = sc.nextLine();
        if (endCreateDt.length() != 8) {
            System.out.println("종료일을 잘못 입력하셨습니다.");
            System.exit(0);
        }
        List<Item> coronaList = DownloadItem.getCoronaList(startCreateDt, endCreateDt);
        for (int i = 0; i < coronaList.size(); i++) {
            System.out.println("========================");
            System.out.println("누적 의심신고검사자 : " + coronaList.get(i).getAccExamCnt());
            System.out.println("등록 시각 : " + coronaList.get(i).getCreateDt());
            System.out.println("사망자 수 : " + coronaList.get(i).getDeathCnt());
            System.out.println("확진자 수 : " + coronaList.get(i).getDecideCnt());
            System.out.println("감염현황 고유 값 : " + coronaList.get(i).getSeq());
            System.out.println("기준일 : " + coronaList.get(i).getStateDt());
            System.out.println("기준 시간 : " + coronaList.get(i).getStateTime());
            System.out.println("수정 시각 : " + coronaList.get(i).getUpdateDt());
            System.out.println("========================");
        }
    }
}
