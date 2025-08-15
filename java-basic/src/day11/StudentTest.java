package day11;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(Student.getSerialNum()); //Student클래스가 호출을 하는 메서드 -> static
        // 초기화되면서 다른 static메서드도 호출할 수 있는 상태가 된다.
        Student[] students = new Student[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("학생명을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("학생의 점수를 입력해주세요.");
        System.out.println("국어 점수: ");
        System.out.println("수학 점수: ");
        System.out.println("영어 점수: ");



    }
}
