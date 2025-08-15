package day3;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        /*
        금액 : 67340
        50000원 : 1
        10000원 : 1
        5000원 : 1
        1000원 : 2
        500원 : 0
        100원 : 3
        50원 : 0
        10원 : 4
        67340원은 총 12개 필요
        */
        Scanner input = new Scanner(System.in);
//        ntf("%d원은 총 %d개 필요", price, vSum);

        //System.out.print("금액 : ");
//        int price = input.nextInt();
//        int nowPrice, val5, val1, val5000, val1000, val500, val100, val50, val0, vSum;
//        val5 = price / 50000; //5만원권 1장
//        System.out.println(val5);
//        nowPrice = price % 50000; //5만원 빼고 다시 남은 몫
//        val1 = price / 10000; //만원권 몇장 세기
//        nowPrice = nowPrice % 10000; //재할당 (여러번 하기 싫은데 뭘로 줄이지..)
//        val5000 = price / 5000;//오천원권 세기
//        nowPrice = nowPrice % 5000;//재할장
//        val1000 = nowPrice / 1000;//천원권 세기
//        nowPrice = nowPrice % 1000;//재할당
//        val500 = nowPrice / 500;//500원 세기
//        nowPrice = nowPrice % 500;//재할당
//        val100 = nowPrice / 100;//100원 세기
//        nowPrice = nowPrice % 50;//재할당
//        val50 = nowPrice / 50;//50원 세기
//        nowPrice = nowPrice % 10;//재할당
//        val0 = nowPrice / 10;//10원 세기
//        vSum = val5 + val1 + val5000 + val1000 + val500 + val100 + val50 + val0; //count로 변경
//        System.out.pri
        // 선생님 풀이
        int m5, m1, c5, c1, b5, b1, s5, s1, count;
        System.out.print("금액 : ");
        int value = input.nextInt();
        int totalPrice = value;
        count = 0;

        //5만원권 계산
        m5 = value / 50000;
        count += m5;
        value %= 50000;

        //1만원권 계산
        m1 = value / 10000;
        count += m1;
        value %= 10000;

        //5000원권 계산
        c5 = value / 5000;
        count += c5;
        value %= 5000;

        //1000원권 계산
        c1 = value / 1000;
        System.out.println(c1);
        count += c1;
        value %= 1000;

        //500원권 계산
        b5 = value / 500;
        count += b5;
        value %= 500;

        //100원권 계산
        b1 = value / 100;
        count += b1;
        value %= 100;

        //50원권 계산
        s5 = value / 50;
        count += s5;
        value %= 50;

        //10원권 계산
        s1 = value / 10;
        count += s1;
        value %= 10;

        //출력
        System.out.printf("%d %d %d %d %d %d %d %d%n",m5, m1, c5, c1, b5, b1, s5, s1);
        System.out.printf("%d원은 총 %d개 필요",totalPrice,count);

    }
}
