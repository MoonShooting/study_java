package day4.ifexample;

import java.util.Scanner;

public class IfPractice03 {
    public static void main(String[] args) {
        //태어난 해가 윤년인지 확인하여 결과를 출력하세요.
        //4년마다 윤년/ 100년마다 평년. 단, 400년마다 무조건 윤년.
        //2001, 1900년 평년, 2004,2000 윤년

        Scanner input = new Scanner(System.in);
        System.out.print("태어난 해를 입력하세요 : ");
        int birth = input.nextInt();

        if((birth%4 == 0 && birth %100 != 0) || (birth%400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다~");
        }




    }
}
