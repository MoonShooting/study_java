package day6;

import java.util.Scanner;

public class LoopCalculator {
    public static void main(String[] args) {
        //사칙연산 계산기
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자 : ");
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("0을 입력했으므로 종료합니다.");
                break;
            }
            System.out.print("두 번째 숫자 : ");
            int num2 = input.nextInt();
            if (num2 == 0) {
                break;
            }
            System.out.print("연산기호를 입력하세요 : ");
            String operator = input.next();

            operator = "++++";
            switch (operator) {
                case "+":
                    int result = num + num2;
                    System.out.printf("%d", result);
                    break;
                case "-":
                    result = num - num2;
                    System.out.printf("%d", result);
                case "/":
                    double re2 = (double) num / num2;
                    System.out.printf("%.2f", re2);
                case "*":
                    result = num * num2;
                    System.out.printf("%d", result);
            }
        }


    }
}
