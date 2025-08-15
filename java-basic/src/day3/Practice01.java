package day3;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
         * 예제. 타수와 안타수를 변수에 저장하고 타율을 계산하세요
         * 타수 : 55555
         * 안타 : 9955
         * 타율 : 0.179
         *
         * 결과 예시(타율이 0.179로 나왔을 때)
         * > 1할 7푼 9리로 출력합니다.
         *
         */

        double at_bats = 10;//타수 선언과 동시에 초기화
        double hits = 1; //안타 선언과 동시에 초기화
        double batting_average; //타율 명명

        batting_average = hits / at_bats; //타율 계산식 : 타율 = 타수 / 안타
        System.out.println(batting_average + "할"); //문제: 그냥 뒤에 할만 붙이면 소숫점 자리수가 바뀌었을 때 그냥 마지막에 할이 붙기만 한다.
        double re1 = batting_average * 100;

        //===========================
        int ab = 54561;
        int h = 621;
        double avg;

        //타율 계산
        avg = (double) h / ab;
        //System.out.println(avg);
        //출력 예문 맞추기
        int n1, n2, n3;
        n1 = (int) (avg * 10); //할
        n2 = (int) (avg * 100) % 10; //푼
        n3 = (int) (avg * 1000) % 10; //리
        //System.out.println(n1 + "할" + n2 + "푼" + n3 + "리");

        //입력받고 바로 출력하도록 Scanner 사용하여 풀어보기!
        Scanner input = new Scanner(System.in);
        System.out.print("타수 : ");
        int ab2 = input.nextInt();

        System.out.print("안타 : ");
        int b2 = input.nextInt();
        double val = (double) b2 / ab2;
        int hal = (int) (val * 10); //할
        int pun = (int) (val * 100) % 10; //푼
        int lee = (int) (val * 1000) % 10; //리

        System.out.printf("타율 : %.3f%n", val); //소숫점 3자리까지만 출력
        String value1 = "할";
        String value2 = "푼";
        String value3 = "리";
        // String으로 변경하기
        //System.out.printf("%s", val);
        System.out.printf("%d%s%d%s%d%s",hal,value1,pun,value2,lee,value3);
    }
}
