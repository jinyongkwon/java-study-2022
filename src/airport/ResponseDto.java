package airport;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {

    private Response response;

    @Data
    @AllArgsConstructor
    class Response {

        private Header header;

        @Data
        @AllArgsConstructor
        class Header {

            private String resultCode;

            private String resultMsg;

        }

        private Body body;

        @Data
        @AllArgsConstructor
        class Body {

            private Items items;

            @Data
            @AllArgsConstructor
            class Items {

                private List<T> item;

                @Data
                @AllArgsConstructor
                class FlightItem {

                    private String airlineNm;

                    private String arrAirportNm;

                    private String arrPlandTime;

                    private String depAirportNm;

                    private String depPlandTime;

                    private int economyCharge;

                    private int prestigeCharge;

                    private String vihicleId;

                }

                @Data
                @AllArgsConstructor
                class AirportItem {

                    private String airportId;

                    private String airportNm;

                }

            }

            public Integer numOfRows;

            public Integer pageNo;

            public Integer totalCount;

        }

    }

}
