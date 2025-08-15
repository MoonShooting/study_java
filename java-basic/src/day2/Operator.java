package day2;

public class Operator {
    public static void main(String[] args) {
        // 연산자 : 연산에 사용하는 기호
        //항 : 연산에 사용하는 값

        /*
        1. 대입연산자 : 오른쪽 항에 있는 값을 왼쪽 항에 대입 => 왼쪽에는 변수 or 상수가 온다.
        ....복합대입연산자....
        ex- int num;
            num + 1; //2
            num += 1; //미래에 배우게 됩니당 이렇게도 쓰입니당

        2. 산술연산자 : 사칙연산과 나머지 연산 (+, -, *, /, %)
        3. 증감연산자 : ++, --
        4. 관계연산자
        5. 논리연산자 and(&&) or(||) not(!)
        6. 비트연산자 (ㄴㄴ)
        7. 조건연산자(삼항연산자)
        8. 인스턴스 연산자
        9. 형변환 연산자
        */


        //산술연산자
        int mathScore = 50;
        int engScore = 61;
        int totalScore = mathScore + engScore; // +연산자
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0; //그냥 2로 쓰면 형변환 하라고 합니다. (그리고 값도 그냥 55로 출력됩니다.)
        System.out.println(avgScore);
        double avgScore2 = totalScore / (float) 2;
        System.out.println(avgScore2);

        System.out.println(5 * 3);
        System.out.println(5 - 3);
        System.out.println(5 % 2); //나누기 한 뒤, 남은 몫 반환

        //증감연산자 : 연산 후 재할당
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println(lastScore);
        System.out.println(gameScore);//1이 증가한 뒤 gamescore값도 함께 재할당(해당 변수의 값 자체가 변경)됨
        System.out.println("뒤에다 붙여볼까요? " + lastScore++); //변경된 값이 사용되지 않습니다. = 값이 출력 후 이후에 다시 호출 시 값이 증가하게 됩니다.
        System.out.println(++lastScore);

        //관계연산자 (논리 값을 반환하는 연산자)
        System.out.println(1 > 3); //false
        System.out.println(1 < 3); //true
        System.out.println(1 >= 3); //false
        System.out.println(1 <= 3); //true
        System.out.println(1 == 3); //false
        System.out.println(1 != 3); //true

        //논리 연산자
        System.out.println("=====논리연산자 test=====");
        //and 연산자(논리곱 연산자) : 둘 다 참일 때 ture/ 아니면 false
        //or 연산자(논리합 연산자) : 둘 중 하나라도 참이면 ture / 아니면 false
        //! 연산자(부정 연산자) : 단항 연산자, 논리형 값을 반대의 값으로 바꿈
        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0); //num1이 0보다 크고, num2도 0보다 크면 true 반환
        System.out.println(flag); //true
        flag = (num1 > 0) && (num2 < 0);
        System.out.println(flag); //false
        System.out.println("--or은 어떻게 나오나 test--");
        flag = (num1 > 0) || (num2 < 0);
        System.out.println(flag); //true
        flag = (num1 < 0) || (num2 < 0);
        System.out.println(flag); //true
        System.out.println("--not test--");
        System.out.println(!flag); //true
        System.out.println(flag); //true

        //77p. 단락 회로 평가
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 2);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); //출력값이 4이면 77행의 우항이 실행되었다는 뜻 but, 실행x => 2출력임을 확인할 수 있음

        System.out.println("===========");
        int re1 = num1 + 10;
        int re2 = i + 2; //선언한 뒤 사용
        value = ((re1) > 10) || ((re2) < 2);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        //삼항연산자 (조건연산자)
        //조건문 ? (A>B)?'예쓰~':'노' 라고 하면 >값이 참일 때 뒤에 예스가 출력되고, false면 노가 출력됩니다.
        System.out.println((5 > 3) ? "예쓰" : "노");

        int faterAge = 45;
        int motherAge = 47;
        char result;
        result = (faterAge > motherAge) ? 'T' : 'F';
        System.out.println(result);

        String result2;
        result2 = (faterAge > motherAge) ? "아버지 나이가 어머니 나이보다 많습니다." : "어머니 나이가 아버지 나이보다 많습니다.";
        System.out.println(result2);

        //복합대입연산자
        //연산자의 좌항에서 우항의 값을 산술연산(+/-...)해서 좌항에 대입합니다.
        System.out.println("사용하기 전 현재 i 값: " + i);
        i = i + 2;
        i += 2;
        System.out.println(i);
        num1 -= 1;
        System.out.println("-=먹인 값: " + num1);
        num1 *= 2;
        System.out.println("*= 먹인 값: " + num1);
        num1 /= 10;
        System.out.println("/= 먹인 값: " + num1);
        num1 %= 2;
        System.out.println("%= 먹인 값: " + num1);

    }
}
