package day6;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1~10 사이의 정수를 입력하세요(0 입력시 종료)");
            int i = sc.nextInt();
            System.out.println("1~10 사이의 정수를 입력하세요(0 입력시 종료)");
            int j = sc.nextInt();
            if (i == 0 || j == 0) {
                System.out.println("종료합니다.");
                break;
            }
            int temp = 0;
            // 변수 temp를 이용해 값 교환
            if (i > j) {
                temp = i; // 큰 수를 temp에 담기
                i = j; //작은 수를 큰 수였던 값에 담기
                j = temp; // 큰수 temp를 작은 수 j에 담기
            }

            int sum = 0;
            for (int k = i; k <= j; k++) {
                System.out.println("누산한 i값: " + k);
                sum += k;
            }
            System.out.println("반복문을 나온 시점에 i의 값은 " + i + "이고, sum은 " + sum + "입니다.");
        }

    }
}
