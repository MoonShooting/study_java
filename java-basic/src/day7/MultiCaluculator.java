package day7;

import java.util.Scanner;

public class MultiCaluculator {
    public static void main(String[] args) {
        //선생님 풀이
        while (true) {
            printMenu(); //메뉴에 대한 값을 print하기 위함으로 return이 필요없음
            System.out.print("메뉴 선택: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    loopYear();
                    break;
                case 2:
                    loopbmi();
                    break;
                case 3:
                    /*
                    성적 출력결과 Student[] = new Student[3]; //학생객체 필드 수정해야함
                    학생객체 안에 성적 결과를 출력하는 메서드를 만들 것
                    학생 객체의 생성은 현재 클래스 안에서 입력을 받아서 만들 것
                    배열이 완성되면 각 학생의 성적 겨로가를 출력하고 끝내기
                    break;
                    */

                    loopCalculator();
                    break;
                case 0:
                    System.out.println("프로그램 종료합니다.");
                    return; //main메서드 안쪽이기 때문에 main메서드를 종료하겠다는 의미
            }
        }
    }

    /**
     * 메뉴를 보여주는 메서드
     */
    public static void printMenu() {
        System.out.println("=== 다기능 계산기 ===");
        System.out.println("1. BMI 계산기");
        System.out.println("2. 윤년 계산기");
        System.out.println("3. 사칙연산 계산기");
        System.out.println("4. 구구단 계산기");
        System.out.println("5. 누산값 계산기");
        //메인을 멈추거나 메인을 다시 고르거나 등 스택구조 설정 필요
        //실행 중인 메모리에 먼저 동작중인 친구를 완료 시키고, 또 새로 만나면 처리하고 끝내고, 메모리 정리하고...
        //선입선출~이 될 수 있도록 위로 쌓은 다음 순서대로 처리하는 방식을 일컫는다.
        System.out.println("0. 종료");
    }


    public static void loopYear() { //완성된 기능을 그냥 호출만 하기 때문에 굳이 매개변수 필요x
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("태어난 해를 입력하세요 (종료하려면 0 입력): ");
            int birth = input.nextInt();
            if (birth == 0) {
                System.out.println("종료합니다.");
                break;
            }
            if ((birth % 4 == 0 && birth % 100 != 0) || (birth % 400 == 0)) {
                System.out.println("윤년입니다.");
            } else {
                System.out.println("윤년이 아닙니다~");
            }
        }
    }

    public static void loopbmi() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("체중을 입력하세요(kg단위) : ");
            int weight = input.nextInt();
            System.out.print("신장을 입력하세요(cm단위) : ");
            int height = input.nextInt();
            if (weight == 0 || height == 0) {
                break;
            }
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
            System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다.", bmi, result);
            System.out.println();
        }
        System.out.println("0을 입력하여 종료합니다.");
    }

    public static void loopCalculator() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자 : ");
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("0을 입력했으므로 종료합니다.");
                break;
            }
            System.out.print("두 번째 숫자 : ");
            int num2 = input.nextInt();
            if (num2 == 0) {
                break;
            }
            System.out.print("연산기호를 입력하세요 : ");
            String operator = input.next();

            operator = "++++";
            switch (operator) {
                case "+":
                    int result = num + num2;
                    System.out.printf("%d", result);
                    break;
                case "-":
                    result = num - num2;
                    System.out.printf("%d", result);
                case "/":
                    double re2 = (double) num / num2;
                    System.out.printf("%.2f", re2);
                case "*":
                    result = num * num2;
                    System.out.printf("%d", result);
            }
        }
    }


}
