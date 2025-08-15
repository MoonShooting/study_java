package day8;

public class Student {
    //객체란? 현실세게의 사물이나 개념을 프로그래밍적으로 표현한 것
    // 또는 그 표현을 코드로 구현해 생성된 실체(인스턴스)
    //필드 : 객체의 상태(객체가 아는 것)
    private static int sirialNum = 1;
    int studentID;
    public String name;
    public int math;
    public int eng;
    public int kor;
    int total;
    double average;
//    String phone;

    public Student(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        sirialNum++; //자동생성
        studentID = sirialNum;//id에 적용
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", math=" + math +
                ", eng=" + eng +
                ", kor=" + kor +
                ", total=" + total +
                ", average=" + average +
                '}';
    }

    //메서드: 객체의 동작, 기능
    public void goSchool() {
        System.out.println("학교에 갑니다...");
    }
}
