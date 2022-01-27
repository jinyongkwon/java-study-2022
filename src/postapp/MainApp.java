package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            // conn은 ByteStream 아직 방향을 안정함.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine(); // 버퍼 비우기 한번에 안비워지면 while돌려야함
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패" + dto.getMsg());
                return;
            }

            // 2. 프로그램 만들기
            // 주석 남기며 하나하나 쪼개기

            // (1) 화면에 회원정보를 출력하겠다. for문 사용!!
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("회원타이틀 : " + dto.getData().get(i).getTitle());
                System.out.println("회원content : " + dto.getData().get(i).getContent());
                System.out.println("회원Id : " + dto.getData().get(i).getUser().getId());
                System.out.println("회원이름 : " + dto.getData().get(i).getUser().getUsername());
                System.out.println("회원비밀번호 : " + dto.getData().get(i).getUser().getPassword());
                System.out.println("회원이메일 : " + dto.getData().get(i).getUser().getEmail());
                System.out.println("회원가입 : " + dto.getData().get(i).getUser().getCreated());
                System.out.println("회원로그인 : " + dto.getData().get(i).getUser().getUpdated());
                System.out.println("회원가입날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("회원로그인날짜 : " + dto.getData().get(i).getUpdated());
                System.out.println("===========");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
