package day7;

public class DataType {
    public static void main(String[] args) {
        // 데이터를 저장하는 공간의 크기는 바이트 단위로 말한다~
        // 변수를 선언할 때 데이터 타입을 정하기!!
        /*
        기본 자료형(= 원시 자료형 primitive type)
        정수형 byte(1) short(2) int(4) long(8)
        문자형 char(2) //비유하자면 한 글자~몇 글자 정도의 작은 단위
        실수형 : 소숫점 단위 float(4) double(8)
        논리형 boolean(1) // yes or no에 주로 쓰임
        각 자료형은 담을 수 있는 데이터의 크기가 다르다. 데이터가 넘치면 오류 발생

        참조 자료형(......)
        문자열 저장 String "abcd fefd asdf asdf"와 같이 문장이나 단어처럼 '열'인 것
        값을 저장하는 방식과 그 값을 접근하는 방식에서 차이가 난다.
        실제 데이터는 다른 곳에 있고, 그 위치가 어디인지를 변수에 저장하는 방식
        */

        //정수형
        byte bVal = 20;
        // byte overByteVal = 128; // byte의 최대 크기를 넘어서 다른 타입 제안(컴파일 오류)
        short sVal = 30;
        int iVal = 40;
        print(bVal + sVal + iVal);

        //문자형
        char ch1 = 'A';
        //    car ch1 = "A";
        print(ch1);
        print(ch1); //강제로 숫자 출력
        char ch2 = 66;
        print(ch2); // 아스키코드 66 = B 출력

        int ch3 = 67;
        print(ch3);
        System.out.println((char) ch3); //반대로 숫자->문자 강제 형변환 가능

        char ch4 = '한';
        char ch5 = '\uD55c';
        print(ch5);
        System.out.println(ch5);
        System.out.println((int) ch4);

        boolean isStudent = false;
        print(isStudent);
        //System.out.println((int)isStudent); //논리형을 정수형으로 형변환 할 수 없다.

        //실수형
        double dNum = 3.14D; // 알파벳 필수X
        float fNum = 3.14F; // 알페벳 필수

        print(dNum);
        print(fNum);

        print(0.1 + 0.2); //0과 1로 소수점 아래의 숫자를 정확하게 표현할 수 없기 때문에 연산 결과에 오차가 발생.

        //참조자료형 맛보기
        String s1 = "hello";
        print(s1);


    }

    // 함수의 오버로딩 : 같은 이름의 메서드를 여러 개 정의하되, 매개변수의 개수나 타입을 다르게 정의하여 사용하는 기능
    //메서드의 이름은 같아야 함
    //매개변수의 개수 또는 타입이 달라야 한다.
    //변환 타입은 오버로딩에 영향을 주지 않는다. (매개변수가 같고 반환값만 다른 것은 각 메서드를 구분할 수 없음)
    public static void print(double a) {
        System.out.println("숫자를 출력합니다." + a);
        //void로 쓰면 return값이 필요없다.
    }

    public static void print(boolean b) { //boolean 타입을 받는 함수
        System.out.println("논리형 값을 출력합니다."+b);
        //void로 쓰면 return값이 필요없다.
    }

    public static void print(String str) { //boolean 타입을 받는 함수
        System.out.println("문자열 값을 출력합니다."+str);
    }

}
