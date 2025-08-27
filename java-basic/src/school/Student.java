package school;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
    //멤버변수
    private int num;                //번호
    private String name;            //이름
    private int kor;                //국어점수
    private int eng;                //영어점수
    private int mat;                //수학점수

    //생성자
    public Student() {
    }

    public Student(String n, int k, int e, int m) {
        name = n;
        kor = k;
        eng = e;
        mat = m;
    }

    public Student(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    //복사 생성자 (객체의 deep copy시 사용)
    public Student(Student other) {
        this.num = other.num;
        this.name = other.name;
        this.kor = other.kor;
        this.eng = other.eng;
        this.mat = other.mat;
    }

    //메소드
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTotal() {
        return kor + eng + mat;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    //대소 비교를 위한 메소드 오버라이딩 (총점 기준으로 성적 비교)
    @Override
    public int compareTo(Student o) {
        return o.getTotal() - this.getTotal();
    }

    //문자열로 변환하기 위한 메소드 오버라이딩

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", mat=" + mat +
                '}';
    }
}
