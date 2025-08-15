package day4.ifexample;

import java.util.Scanner;

public class BmiExample {
    public static void main(String[] args) {
        /*
        사용자에게 키(cm)와 몸무게(kg)를 입력받고,
        BMI 계산 후 비만도 등급(저체중 / 정상 / 과체중 / 비만)을 출력하는 프로그램 작성
        double, 형변환, 조건문, printf 사용

        💡 BMI 계산식:
        BMI = 체중(kg) / (신장(m) * 신장(m))
        💡 판정 기준
        BMI < 18.5: 저체중
        18.5 ≤ BMI < 23: 정상
        23 ≤ BMI < 25: 과체중
        25 이상: 비만

        출력예시
        체중을 입력하세요 (kg단위) : 50
        신장을 입력하세요 (cm단위) : 160
        당신의 BMI는 19.53이며, '정상'입니다.
        */
        //입력받기
        Scanner input = new Scanner(System.in);
        System.out.print("체중을 입력하세요(kg단위) : ");
        int weight = input.nextInt();
        System.out.print("신장을 입력하세요(cm단위) : ");
        int height = input.nextInt();
        //bmi 계산식
        double heightMeter = (double) weight / (height * height);
        double bmi = heightMeter * 10000; //출력값에 맞추어 자릿수 재할당
        //출력 값 조건식
        String result = null;
        if (bmi >= 25) {
            result = "비만";
        } else if (bmi >= 23) {
            result = "과체중";
        } else if (bmi >= 18.5) {
            result = "정상";
        } else {
            result = "저체중";
        }
//        System.out.println(bmi);
//        System.out.println(result);
          System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다.", bmi, result);

    }
}
