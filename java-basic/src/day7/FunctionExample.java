package day7;

import day8.Student;

import java.util.Scanner;

public class FunctionExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //무한루프 돌아서 왜지?했는데, main이 끝나야 하는지, 다시 메뉴선택을 돌게 만들 것인지 체크해야 한다.
        //따라서 return을 switch-case에서 줘야 하고, 가독성을 위해서 printMenu를 만들어서 상단의 메뉴 종류도 별도로 출력하는 게 좋다.
        while (true) {
            System.out.print("메뉴 선택: ");
            printMenu();
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    loopBmi();
                    break;
                case 2:
                    loopYear();
                    break;
                case 3:
                    loopCalculator();
                    break;
                case 4:
                    loopGugudan();
                    break;
                case 5:
                    loopBasic();
                    break;
                case 6:
                    loopGrade(sc);
                    break;
                case 0:
                    System.out.println("프로그램 종료합니다.");
                    return;
            }
        }
    }


    public static void printMenu() {
        System.out.println("=== 다기능 계산기 ===");
        System.out.println("1. BMI 계산기");
        System.out.println("2. 윤년 계산기");
        System.out.println("3. 사칙연산 계산기");
        System.out.println("4. 구구단 계산기");
        System.out.println("5. 누산값 계산기");
        System.out.println("6. 성적리포트 출력기");
        System.out.println("0. 종료");
    }

    public static void loopYear() {
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

    public static void loopBmi() {
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

    /**
     * 사칙연산 계산기에 대한 메서드
     */
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

    /**
     * 구구단 계산기에 대한 메서드
     */
    public static void loopGugudan() {
        Scanner sr = new Scanner(System.in);
        System.out.println("1~9 사이의 정수를 입력하세요.(0 입력 시, 종료)");
        int dan = sr.nextInt();
        if (dan == 0) {
            System.out.println("종료합니다.");
            return;
        }
        System.out.println("1~9 사이의 정수를 입력하세요.(0 입력 시, 종료)");
        int times = sr.nextInt();
        if (times == 0) {
            System.out.println("종료합니다.");
            return;
        }
        int i = dan;
        //이 부분 확인하기
        for (; i <= 9; i++) { //곱셈 단(1~9단까지 반복)
            for (; times <= 9; times++) { //각 단에서 1~9를 곱하는 내부 반복문
                System.out.println(i + " X " + times + "= " + i * times);
            }
        }


    }

    /**
     * 누산값에 대한 메서드
     */
    public static void loopBasic() {
        Scanner sr = new Scanner(System.in);
        while (true) {
            System.out.println("0~10 사이의 정수를 입력해 주세요.(0입력시 종료)");
            int num = sr.nextInt();
            if (num == 0) {
                break;
            }
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            System.out.println("반복문을 나온 시점에 i의 값은 " + num + "이고, sum은 " + sum + "입니다.");
        }
    }

    public static void loopGrade(Scanner sc) {
        //6. 성적종합결과 국어 영어 수학 성적을 입력받아 3칸짜리 정수 배열에 저장하고 총점 평균 게산 및 등급을 출력하기
        Student[] students = new Student[3];
        int kor;
        int eng;
        int math;
        int sum;
        double avg;
        char grade = ' ';
        //객체 개념에서 보면 grade는 입력받을 값은 아님. 점수 메기는 사람이 따로 있는데 객체 따로 생성해서 다집어 넣으면 안되나??
        //TODO: 학생명은 별도로 받기
            for (int i = 0; i < students.length; i++) {
                sc.nextLine(); //버퍼를 처음에도 비워줘야함..멍청한 컴퓨터..
                System.out.println("학생명을 입력하세요.");
                String name = sc.nextLine();
                System.out.println(name + "학생의 성적은 다음과 같습니다.");
                System.out.print(i + " 번째 과목 점수 입력 : ");

                System.out.print("국어: ");
                kor = sc.nextInt();
                System.out.print("영어: ");
                eng = sc.nextInt();
                System.out.print("수학: ");
                math = sc.nextInt();
                sc.nextLine(); // 버퍼 비우기

                if (kor == 0 || eng == 0 || math == 0) {
                    System.out.println("0을 입력했으므로 종료합니다.");
                    break;
                }
                //입력받은 값을 students[i] for문을 돌리면서 안에 대입됨
                students[i] = new Student(kor, eng, math);
                sum = getTotal(students[i]);
                System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
                System.out.println("총점: " + sum);
                avg = getAverage(students[i]);
                System.out.printf("평균: %.2f\n", avg);
                grade = getGrade(students[i], grade);
                System.out.println("등급: " + grade);
            }

        //초기화 위치 확인
        //배열 값 계산 방식 확인
        //자바에서는 이때 Student class에서 작업을 하나??
        //TODO: 위치 수정 필요(for문 순서 확인)
        System.out.println("===성적 결과===");
        System.out.print("입력한 점수: ");
        System.out.println("--------------------");
    }

    //합계
    public static int getTotal(Student s) {
        return s.kor + s.eng + s.math;
    }

    //메서드(자바에서 동작은 클래스 객체 안에서 만든다ㅏㅏㅏㅏㅏ)
    public static double getAverage(Student s) {
        return (double) getTotal(s) / 3;
    }

    public static char getGrade(Student s, char grade) {
        double avgCheck = getAverage(s);
        if (avgCheck >= 90) grade = 'A';
        if (avgCheck >= 80) grade = 'B';
        if (avgCheck >= 70) grade = 'C';
        if (avgCheck >= 60) grade = 'D';
        if (avgCheck < 60 && avgCheck > 0) grade = 'F';
        return grade;
    }

}
