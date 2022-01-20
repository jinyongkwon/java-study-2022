package ex22;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {

        // ArrayList는 데이터가 중복되도 되는 데이터 모임
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> datas = new ArrayList<String>();
        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");
        datas.add("데이터5"); // 추가

        datas.set(1, "data2"); // 수정
        datas.remove(4); // 삭제

        System.out.println(datas.get(0)); // 불러오기
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        System.out.println(datas.get(3));
        // System.out.println(datas.get(4));

    }
}
