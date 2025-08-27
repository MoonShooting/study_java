package api;

import api.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //이름: 홍길동 국어: 100점 영어: 80점 수학: 90점
        Student s1 = new Student("홍길동", 100, 80, 90);
        Student s2 = new Student();
        int k = s1.getKor(); //국어점수 읽기
        //캡슐안에 들어있는건 모르지만 아무튼 쓸 수 있따~
        s1.setEng(100); //영어점수 수정
        int t = s1.getTotal(); //총점 읽기
        System.out.println(s1);

        //학생 3명을 입력받아 리스트에 저장하고 전부 출력
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<>();
        String name;
        int kor, eng, math;
        Student s;
        for (int i = 0; i < 3; i++) {
            //한 학생의 이름, 국영수 점수 입력받아 Student객체 생성하고
            System.out.println("학생명을 입력하세요.\n");
            name = sc.nextLine(); //next로 읽으면 띄워쓰기,엔터 문제로 한자리 수 외엔 Line이 나음
            System.out.println("국어,영어,수학 점수를 각각 입력 후 Enter 해주세요.");
            kor = sc.nextInt();
            eng = sc.nextInt();
            math = sc.nextInt();
            sc.nextLine(); //위치 고려
            //객체 단위로 담아서 넣기
            s = new Student(name, kor, eng, math);
            //그 객체를 리스트에 저장
            st.add(s);
        }
        //전체 출력 : 오버라이딩 안하면 toString 필요해짐
        System.out.println(st);
        //정렬
        Collections.sort(st);

        String a = "abc";
        String b = "add";
        System.out.println(a.compareTo(b));
        //String 기준, 다른 글자가 나오면 유니코드 기준으로 - 들어감
        //음수가 된다? 알파벳 기준조차 기본적으로 순서가 있는 상태라는 것
        //글자수 차이로 -가 나올 수 있다. (음수,양수,0 구분)


    }
}
