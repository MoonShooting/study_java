package day7;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        //직접 출력
        System.out.println(addNum(num1, num2)); // 인자값 num1, num2

        //함수? 하나의 기능을 수행하는 코드 덩어리
        //한 작업을 여러번 반복한다면 함수로 만들어두고 필요할 때마다 호출해서 쓸 수 있다.
        //전달 할 때(인자), 전달 받을 때는 메서드 선언할 때 지정(type, 순서)한대로 설정.
        /*
        함수로 분리하는 것의 장점
        - 가독성 향상
        - 재사용성 증가, 중복코드 제거
        - 유지보수 용이성
        - 테스트 용이성
        - 의도명확화
        */

    }

    //자바독(JavaDoc) 주석이라고 한다.
    //주석 블록 안에서 특별한 태그들을 사용해 문서화 할 수 있다.
    /**
     *첫번째 항과 두번째 항을 더하기 연산 한 결과를 반환한다.
     * @param a 첫 번째 항
     * @param b 두 번째 항
     * @return 결과값
     */


    //자리를 상단으로 옮겨도 자바는 컴파일 후 동작이라 전체 스캔해서 동작 가능함..ㄹㅇ 어메이징
    public static int addNum(int a, int b) {
        int result = a + b;
        return result;
    }

}
