package TypeTest01;

import java.util.ArrayList;

public class ArrayListexample1 {
    public static void main(String[] args) {
        //로또번호 생성 예제
        //arrayList로 구현
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        for (int i = 0; i < 7; i++) {
            num = (int) (Math.random() * 45 + 1);
            list.set(i, list.get(num));
            //todo: error : Index 27 out of bounds for length 0 해결
        }
        System.out.println("추첨 번호 확인: "+list);

    }
}
