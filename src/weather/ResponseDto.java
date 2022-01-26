package weather;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {

    private Response response;

    @AllArgsConstructor
    @Data
    class Response {

        private Header header;

        @AllArgsConstructor
        @Data
        class Header {

            private String resultCode;

            private String resultMsg;

        }

        private Body body;

        @AllArgsConstructor
        @Data
        class Body {

            private String dataType;

            private Items items;

            @AllArgsConstructor
            @Data
            class Items {

                private List<Item> item = null;

                @AllArgsConstructor
                @Data
                class Item {

                    private String baseDate;

                    private String baseTime;

                    private String category;

                    private Integer nx;

                    private Integer ny;

                    private String obsrValue;

                }

            }

            private Integer pageNo;

            private Integer numOfRows;

            private Integer totalCount;

        }

    }

}
