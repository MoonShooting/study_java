public class Variable {
    public static void main(String[] args) {
        //변수 = 값을 담는 상자
        //값 = 메모리에 저장된 데이터 조각
        int num; //데이터타입 int = 정수형 num이라는 이름의 변수 선언
        num = 100; // 100을 num이라는 이름의 변수에 담았다.
        System.out.println(num);

        num = 300;
        System.out.println(num);

        
        int num2 = 200; // 변수 선언과 동시에 값을 대입(할당)
        //변수 초기화 = 변수 준비하여 처음으로 값을 넣는 것
        System.out.println(num2 + num);

        // int $_va@Srs = 120; // 쓰면 안됨

        // int int //예약어는 안됨

        int num3;
        num3 = num - 30;
        System.out.println(num3);

        //변수 이름 규칙
        /*
        1. 영문자나 숫자를 사용. 특수문자는 $와 _사용가능
        2. 숫자로 시작할 수 없다.
        3. 예약어를 사용할 수 없다.
        */

    }
}
