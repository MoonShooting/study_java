package day6;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        while (true) {
            System.out.println("1~9 사이의 정수를 입력하세요.(0 입력 시, 종료)");
            int dan = sr.nextInt();
            if (dan == 0) {
                break;
            }
            System.out.println("1~9 사이의 정수를 입력하세요.(0 입력 시, 종료)");
            int times = sr.nextInt();
            for (int i = dan; i <= 9; i++) { //곱셈 단(1~9단까지 반복)
                for (; times <= 9; times++) { //각 단에서 1~9를 곱하는 내부 반복문
                    System.out.println(i + " X " + times + "= " + i * times);
                }
                //System.out.println("---------------"); //각 단 사이 구분(내부 반복문 끝날 때마다 실행함)
            }
        }
        System.out.println("종료합니다.");

    }
}
