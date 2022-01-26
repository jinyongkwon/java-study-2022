package weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import weather.ResponseDto.Response.Body.Items.Item;

public class DownloadWeather {
    public static Map<String, String> getWeatherList() {
        Map<String, String> WeatherMap = new HashMap<>();
        // 날짜 구하기
        LocalDate now = LocalDate.now();
        String a = now + "";
        String data = "";
        String tokens[] = a.split("-");
        for (int i = 0; i < 3; i++) {
            data = data + tokens[i];
        }

        // 현재시간구하기
        LocalTime now1 = LocalTime.now();
        String time = now1.getHour() + "00";
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=dKBYvXftyqx9iXdnLhqwWVL4GXucV5LSvUvQ%2FttIrjjWo%2FDEwK9KG9MwmrWoaKTgamp8VUXTr%2F%2BZp5acNayxZw%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + data + "&base_time=" + time + "&nx=97&ny=74");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            for (int i = 0; i < result.size(); i++) {
                if ((result.get(i).getCategory()).equals("T1H"))
                    WeatherMap.put("온도", result.get(i).getObsrValue());
            }

        } catch (Exception e) {
            System.out.println("온도 조회중 오류가 발생했습니다.");
        }
        return WeatherMap;
    }

    public static void main(String[] args) {
        Map<String, String> weatheMap = DownloadWeather.getWeatherList();
        System.out.println("부산사하구 현재시간기준 온도는 " + weatheMap.get("온도") + "도 입니다");
    }
}