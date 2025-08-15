package day11;

import java.util.Scanner;

public class StudentReportMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        printMenu();
        Student[] students = new Student[3];
        System.out.println("원하는 순서를 골라 숫자를 입력해주세요. : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            //새학년 만들기
            for (int i = 0; i < students.length; i++) {
                if(students[i] == null) {
                    students[i] = createStudent(sc);
                }
                //TODO: 멈추고 싶을 때 설정하기~

            }
            case 2:
                //read
                readStudent();
            case 3:
                //update
                updateStudent();
            case 4:
                //delete
                //엄 데이터 삭제 가비지가 해주는거 말고?
                //어차피 가라데이터잖아? 움..
                deleteStudent();
        }
    }

    public static void printMenu() {
        System.out.println("학생정보관리");
        System.out.println("1. 학생정보입력 C");
        System.out.println("2. 학생정보읽기(1명) R");
        System.out.println("3. 전채 학생 출력R");
        System.out.println("4. 학생정보수정 U");
        System.out.println("5. 학생정보삭제 D");

    }

    private static Student createStudent(Scanner sc) {
        System.out.println("생성할 학생의 정보를 입력합니다.");
        sc.nextLine();
        System.out.print("학생명 입력해주세요: ");
        String name = sc.nextLine();
        System.out.println("국어 점수를 입력해주세요: ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요: ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요: ");
        int math = sc.nextInt();

        Student s = new Student(kor, eng, math);
        s.name = name;
        s.kor = kor;
        s.eng = eng;
        s.math = math;
        System.out.println(s+": s값 이거다 임뫄");
        return s;
    }

    private static void readStudent() {

    }

    private static void updateStudent() {
    }

    private static void deleteStudent() {
    }

}
