package day4.ifexample;

import java.util.Scanner;

public class IfPractice02 {
    public static void main(String[] args) {
        //생년과 올해를 입력받으세요
        //문제1) 태어난 해가 잘못된 값일 경우 "태어난 해는 올해보다 이전이어야 합니다."를 출력하는 조건문을 만드세요.
        //올바른 값일 경우 몇살 출력

        //문제2) 태어난 해와 올해가 홀수 or 짝수 확인
        //문제3) "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다" 를 출력하는 조건문을 만드세요.

        Scanner input = new Scanner(System.in);
        System.out.print("생년(4자리)을 입력해주세요 : ");
        int birth = input.nextInt();
        System.out.print("올해(4자리)를 입력해주세요 : ");
        int nowYear = input.nextInt();
        if (birth > nowYear) {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다.");
        } else if (nowYear > 2025) {
            System.out.println("올해는 2025년 입니다. 미래인간?");
        } else {
            System.out.printf("%d살 입니다. %n", nowYear - birth);
        }

        //문제2
        if (birth % 2 == 1 && nowYear % 2 == 1) {
            System.out.println("태어난 해와 올해가 홀수입니다~");
        } else if (birth % 2 == 0&& nowYear % 2 == 0) {
            System.out.println("태어난 해와 올해가 짝수입니다~");
        } else {
            System.out.println("태어난 해와 올해가 홀짝이 안맞으시네요. 언럭키?");
        }

        //문제3 "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다" 를 출력하는 조건문을 만드세요.
        if(birth % 3 == 0 && nowYear % 5 == 1) { //5의 배수가 아니다 (!= 1로 하거나 ==1로 하거나)
            System.out.println("태어난 해가 3의 배수이고 올해는 5의 배수가 아니다.");
        } else {
            System.out.println("나니노나이챳다~");
        }


    }
}
