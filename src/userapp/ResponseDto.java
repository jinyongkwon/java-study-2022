package userapp;

import java.util.List;

import lombok.Data;

@Data
public class ResponseDto {
    private int code; // 1 성공, -1 실패, 0은 데이터 없음.
    private String msg; // 실패 원인
    private List<User> data;
}
