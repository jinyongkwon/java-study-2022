package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import data00.ResponseDto.Response.Body.Items.FlightItem;

public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=dKBYvXftyqx9iXdnLhqwWVL4GXucV5LSvUvQ%2FttIrjjWo%2FDEwK9KG9MwmrWoaKTgamp8VUXTr%2F%2BZp5acNayxZw%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20220128&airlineId=AAR&_type=json");

            // conn -> Byte Stream 선!!
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 리턴타입을 부모로 맞춘 이유가 뭘쓸지 모르기때문에

            // 원래 default는 1Byte로 한글을 읽었기 때문에 한글이 깨졌다.
            // utf-8 : 한글을 3Byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine(); // 버퍼 비우기
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<FlightItem> result = dto.getResponse().getBody().getItems().getItem();
            // System.out.println(dto.getResponse().getBody().getItems().getItem().get(0).getAirlineNm());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
        }
    }
}
