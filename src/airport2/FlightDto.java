package airport2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // 풀생성자

@Data // getter, setter, toString
public class FlightDto {
    private Response response;

    @AllArgsConstructor

    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor

        @Data
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor

        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor

            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor

                @Data
                class Item {
                    private String airlineNm; // 항공사이름
                    private String arrAirportNm; // 도착공항이름
                    private String arrPlandTime; // 도착시간
                    private String depAirportNm; // 출발공항이름
                    private String depPlandTime; // 출발시간
                    private int economyCharge; // 일반석운임
                    private int prestigeCharge; // 비즈니스석운임
                    private String vihicleId; // 항공편명
                }
            }
        }
    }
}