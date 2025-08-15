package day4.ifexample;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    /*
        조건
        - `/` 연산 시 나눗셈 결과는 소수 둘째 자리까지 출력
        - 나눗셈에서 0으로 나누는 경우 `"0으로 나눌 수 없습니다."` 출력
        - 존재하지 않는 연산기호 입력 시 `"지원하지 않는 연산입니다."` 출력
        - 0으로 나누는 경우 등 예외 상황도 조건문으로 처리해보기
    */
//        첫 번째 숫자: 10
//        두 번째 숫자: 3
//        연산 기호를 입력하세요: /
//        결과: 3.33

        Scanner input = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int num = input.nextInt();
        System.out.print("첫 번째 숫자 : ");
        int num2 = input.nextInt();
        System.out.print("연산기호를 입력하세요 : ");
        char symbol = input.next().charAt(0);

        //존재하지 않는 연산기호
        if (symbol != '/' && symbol != '%' && symbol != '*' && symbol != '+' && symbol != '-') {
            System.out.println("지원하지 않는 연산입니다.");
        }
        //계산
        if (symbol == '/' && (num != 0 && num2 != 0)) {
            double result = (double) num / num2;
            System.out.printf("%.2f", result);
        } else if (num == 0 || num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        if (symbol == '%' && (num != 0 && num2 != 0)) {
            int result = num % num2;
            System.out.printf("%d", result);
        } else if (num == 0 || num2 == 0) {
            System.out.println("계산 할 수 없습니다.");
        }

        if (symbol == '*') {
            int result = num * num2;
            System.out.printf("%d", result);
        }

        if (symbol == '+') {
            int result = num + num2;
            System.out.printf("%d", result);
        }

        if (symbol == '-') {
            int result = num - num2;
            System.out.printf("%d", result);
        }

        //선생님 해설
        String operator = input.next();
        operator = "++++";
        switch (operator) {
            case "+" :
                int result = num + num2;
                System.out.printf("%d", result);
                break;
            case "-" :
                result = num - num2;
                System.out.printf("%d", result);
            case "/" :
                double re2 = (double) num / num2;
                System.out.printf("%.2f", re2);
            case "*" :
                result = num * num2;
                System.out.printf("%d", result);
        }

    }
}
