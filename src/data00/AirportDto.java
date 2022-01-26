package data00;

import java.util.List;

import lombok.Data;

@Data
public class AirportDto {

    private Response response;

    @Data
    class Response {

        private Header header;

        @Data
        class Header {

            private String resultCode;

            private String resultMsg;
        }

        private Body body;

        @Data
        class Body {

            private Items items;

            @Data
            class Items {

                private List<Item> item = null;

                @Data
                class Item {

                    private String airportId;

                    private String airportNm;
                }

            }
        }
    }
}
