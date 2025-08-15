package day6;

import java.util.Scanner;

public class LoopPractice03 {
    public static void main(String[] args) {
        //정수를 입력받아 합계를 구한다.
        //입력받은 정수가 0이면 무조건 종료한다.
        //for while do-while 세가지 버전으로 만드세요.
        Scanner input = new Scanner(System.in);
        System.out.print("정수1 입력:");
        int num = input.nextInt();
        int sum = 0;
        int temp = 2;
        //for문
//        for (int i = temp; ; i++) {
//            sum += num;
//            if (num == 0) {
//                System.out.println("합계: " + sum);
//                break;
//            } else {
//                System.out.println("정수" + i + " 입력:");
//                num = input.nextInt();
//            }
//        }

        //while문
//        while (num != 0) {
//            temp++;
//            sum += num;
//            System.out.print("정수" + temp + " 입력:");
//            num = input.nextInt();
//        }
//        System.out.println("합계: " + sum);

        //do-while문
        do {
            temp++;
            sum += num;
            System.out.print("정수" + temp + " 입력:");
            num = input.nextInt();
        } while (num != 0);
        System.out.println("합계: " + sum);

    }
}
