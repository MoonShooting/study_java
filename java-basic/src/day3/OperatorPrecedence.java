package day3;

public class OperatorPrecedence {
    public static void main(String[] args) {
        /*
        연산자 우선순위
        - 괄호 > 단항 > 이항(산술 > 비교,관계 > 논리 > 대입) > 삼항
        - 그냥 괄호를 쓰거나 변수에 저장하고 코드 순서에 유의하는 것이 더 가독성이 좋다(코드품질향상)
        */

        //1. 곱셉과 덧셈의 우선순위
        int result1 = 2 + 3 * 4; //기본적인 사칙연산 방식에서는 괄호를 안써도 무관하나 쓰는 쪽이 가독성 있음
        // (아래 이유들로 인해 하는 쪽이 낫다.)
        System.out.println("result1= " + result1);

        //2. 괄호를 사용해 우선순위를 변경
        int result2 = (2 + 3) * 4; //덧셈을 먼저하도록 설정
        System.out.println("result2 " + result2);

        //3. 대입 연산자와 산술 연산자의 우선순위
        int a = 10;
        int b = 5;
        a = b + 2; //b+2를 먼저 계산 후 대입이 진행된다.
        System.out.println("a= " + a);

        //4. 비교 연산자와 논리 연산자의 우선순위
        boolean result3 = 5 > 3 && 2 < 4;
        //첫번째. 5>3 true인지 체크, 두번째.true면 2<4 true인지 체크, 세번째 result3에 대입
        System.out.println("result3= " + result3);

        //5. 논리 부정 연산자와 비교 연산자의 우선순위
        int result4 = 10 - 3 + 2 * 5 / (1 + 1);
        /*  1. 괄호 2
            2. 곱하기 2*5=10
            3. 나누기 10/2 = 5
            4. 뺄셈 10-3=7
            5. 덧셈 7+5=12
         */
        System.out.println("result4= " + result4);

    }
}
