package day6;

import java.util.Scanner;

public class LoopPractice03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, sum = 0, i;
        for (i = 0; n != 0; i++) {
            System.out.printf("정수%d 입력:", i);
            n = sc.nextInt();
            sum += n;

            if (n == 0) { //조건에 따라 합계 영향을 준다면 위치를 변경해야 함.
                break;
            }
        }
        System.out.println("합계 " + sum);

        //while
        i = 1; //초기화 여기다 하긴 하는데, 같이 작업할 때 여기다 초기화 하는건 비추천~
        // 할거면 주석으로 초기화 목적 + 이유 간단히 써야 작업할 때 문제가 안생김
        while (true) { // true인 경우 = 항상 동작하겠다는 의미
            System.out.printf("정수%d 입력:", i);
            n = sc.nextInt();
            sum += n;
            if (n == 0) {
                break;
            }
            i++;
        }
        System.out.println("합계 " + sum);

        //do-while
        do {
            System.out.printf("정수%d 입력:", i);
            n = sc.nextInt();
            sum += n;
            if (n == 0) {
                break;
            }
            i++;
        }while (n != 0);
        System.out.println("합계 " + sum);

    }
}
