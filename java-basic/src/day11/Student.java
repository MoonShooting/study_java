package day11;

public class Student {
    private static int serialNum = 1000;
    int studentID;
    String name;
    int grade;
    int math;
    int eng;
    int kor;
    int total;
    double average;

    public Student(int kor, int eng, int math) {
        serialNum++;//1001부터 시작
        this.studentID = serialNum;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    //이건 이전에 작업한거
//    public Student(String name, int grade) {
//        serialNum++;//1001부터 시작
//        this.studentID = serialNum;
//        this.name = name;
//        this.grade = grade;
//    }

    //자동생성에 대한 get(),set()도 static이 된다.
    public static int getSerialNum() {
        return serialNum;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", math=" + math +
                ", eng=" + eng +
                ", kor=" + kor +
                ", total=" + total +
                ", average=" + average +
                '}';
    }
//메서드 오버라이딩(빌드)
//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentID=" + studentID +
//                ", name='" + name + '\'' +
//                ", grade=" + grade +
//                '}';
//    }

}
