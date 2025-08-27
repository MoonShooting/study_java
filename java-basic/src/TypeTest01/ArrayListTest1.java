package TypeTest01;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //기본 자료형을 객체로 만듦
        //new ArrayList<Integer>(); 이렇게 쓰는 방식은 이제 안씀!
        ArrayList<Integer> list = new ArrayList<>(); //10개짜리 공간이 생겼다.
        //데이터 타입에 맞추어서 객체를 만든다. Integer i = new Integer(1); //숫자니까 Integer형식 맞춤

        list.add(1); //생략하여 자동인식. 숫자라면 자동 형변환이 가능
        list.add(10);
        list.add(3);
        System.out.println(list.get(0)); //a[0] 로 읽기 쓰기가 가능
        // arrayList에서는 get(),set()으로 []를 대신하여 씀
        System.out.println(list.size()); //실제 저장된 배열 내 개수
//        System.out.println(list.get(11)); //배열처럼 에러 발생. 아직 값이 없으니까.
        //Error: Index 11 out of bounds for length 3
        System.out.println(list); //class로 정의되어 있어서 이렇게 써도 주소값이 아닌 배열 출력함

        list.add(7);//숫자 7을 맨 뒤에 추가 (기본적으로 마지막에 추가)
        list.add(0, 99); //숫자 99를 맨 앞에 추가
        list.set(0, 88); //맨 앞의 숫자를 88로 수정
        System.out.println(list); // 88 1 10 3 7
        //객체의 toString 메서드로 호출한다. (모든 객체는 안만들어도 기본적으로 toString을 가지고 있다.)
        // -> 근본이 Object 라서
        //한 줄씩 보고 싶으면 for문 씀
        System.out.println("시자악~");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //향상된 for문
//        for (Integer j : list) {
//            System.out.println(j);
//        }
//        list.get(list.lastIndexOf(10));//마지막 위치 반환

    }
}
