package day9;

public class Student {
    //인스턴스 생성: 존재하는 학생 데이터가 생성된다
    //필드: 객체의 상태
    private int studentId;
    String studentName;
    int grade;
    String address;


//    Student() {
//
//    }

    //생성자: return 타입이 필요하지 않다.
    //인스턴스가 생성될 때 데이터 값을 가공하여 제공하고자 할 때 등의 상황에서 선언
    Student(int studentId, String studentName, int grade, String address) {
        //this.를 붙이면 현재 객체의 studentId를 가리킨다.
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.address = address;
    }

    //매서드: 객체가 할 수 있는 것, 동작
    public int getStudentId() {
        return studentId;
    }

    //매개변수로 int studentId값을 받아와서
    void greet() {
        System.out.println(studentName + "님이 인사합니다: 안녕하세요");
    }

    public void setStudentId(int studentId) {
        //해당 private studentId를 넣어서 변경할 수 있도록 설정해준다.
        //이러면 외부 클래스에서 값을 변경하여도 에러가 발생하지 않는다.
        this.studentId = studentId;
    }

}
