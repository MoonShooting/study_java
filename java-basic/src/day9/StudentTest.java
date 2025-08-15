package day9;

import day8.kitchen.Ramen;

public class StudentTest {
    public static void main(String[] args) {

        //Student seo = new Student(); //student에서 빈 메서드로 생성된다.
        //이건 직접 StudentTest.java에서 선언한 데이터를 바로 출력한 것
//        seo.setStudentId(000102);
        //seo.studentName = "서희연";
        //System.out.println(seo.getStudentId());
        // System.out.println(seo.studentName);

        //이건 student의 생성자를 통해 정해진 형식의 데이터를 모두 타입에 맞추어 입력하려 출력한 경우
        Student kim = new Student(456789, "김민서", 1, "부산광역시 중구 무역회관");
        System.out.println(kim.getStudentId());
        System.out.println(kim.studentName);
        System.out.println(kim);
        kim.greet(); //student의 선언된 함수를 곧바로 호출함
        System.out.println(kim.studentName + "님의 학번은 " + kim.getStudentId() + "입니다.");

//        kim.studentId = 12344;
        //앗 학번은 안바뀌는 값인데??
        System.out.println(kim.studentName + "님의 학번은 " + kim.getStudentId() + "입니다.");

        Ramen ram = new Ramen();
//        Student stu = new Student();
//        stu.name = "김석현";

    }
}
