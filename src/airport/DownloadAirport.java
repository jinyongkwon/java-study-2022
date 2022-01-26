package airport;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import airport.ResponseDto.Response.Body.Items.AirportItem;

public class DownloadAirport {
    public static Map<String, String> getAirportList() {
        Map<String, String> airportMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto<AirportItem> dto = gson.fromJson(responseJson, ResponseDto.class);
            List<AirportItem> result = dto.getResponse().getBody().getItems().getItem();
            airportMap.put(result.get(0).getAirportNm(), result.get(0).getAirportId());
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }
            System.out.println("중단점");
        } catch (Exception e) {
            System.out.println("항공사 조회중 오류가 발생했습니다.");
        }
        return airportMap;
    }
}