package day4.ifexample;

import java.util.Scanner;

public class IfPractice01 {
    public static void main(String[] args) {
        //시험점수를 정수로 입력받습니다. (0~100점)
        /*
        합격입니다/불합격입니다. (80점 기준)
        90점 이상 A
        80점 이상 B
        70점 이상 C
        60점 이상 D
        60점 미만 F

        범위를 벗어나는 입력치는 "입력오류"로 출력하세요.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("점수를 입력하세요(0~100) : ");
        int score = input.nextInt();

        //합격 여부만 확인하는 경우
        if(score <= 100 && score > 80) {
            System.out.println("합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }

        //둘 다 처리하는 경우
        if(score > 101) {
            System.out.println("입력 오류");
        }else if(score > 90) {
            System.out.println("A");
            System.out.println("합격입니다.");
        }else if(score > 80){
            System.out.println("B");
            System.out.println("합격입니다.");
        } else if (score > 70) {
            System.out.println("C");
            System.out.println("불합격입니다.");
        } else if (score > 60) {
            System.out.println("D");
            System.out.println("불합격입니다.");
        } else if (score < 60 && score > 0) {
            System.out.println("F");
            System.out.println("불합격입니다.");
        }
        else {
            System.out.println("입력오류");
        }
    }
}
