package api.Model;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
    //멤버변수(필드)
    private int num;
    private String name; //이름
    private int kor; //국어점수
    private int eng; //영어점수
    private int mat; //수학점수
    private int total; //총점
    private double avg; //평균

    //메소드
    //값을 담기 위해 필요함. 불러서 쓰기 위함.
    //생성자 생성 규칙:
    // 1. 메서드의 이름 = 클래스명과 동일
    // 2. 기본 생성자는 파라미터(인자)를 받지 않는다.
    // 3. 안만들고 쓸려고 할 때 자동으로 생김.
    // 단, 인자값이 있는 버전 하나라도 만들면 생성자가 자동으로 생성되지 않기 때문에 그 경우 생성자를 하나 만들어두어야 한다.
    // 4. 반환하는 자료형 타입(리턴 타입)을 아무것도 쓰지 않는다.
    // 5. 접근 지정자는 객체를 만들 때 사용하기 때문에 public으로 쓰는 것이 정석이다.
    public Student() {

    }

    // 이름과 점수를 인자로 받는 생성자
    public Student(String n, int k, int e, int m) {
        this.name = n;
        setScores(k, e, m);
    }

    // 모든 멤버 변수를 인자로 받는 생성자
    public Student(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        setScores(kor, eng, mat);
    }

    // 깊은 복사를 위한 복사 생성자
    // 기존 Student 객체를 복사하여 새로운 객체 만들기
    public Student(Student other) {
        this.num = other.num;
        this.name = new String(other.name);
        setScores(other.kor, other.eng, other.mat);
    }

    // 점수를 설정하고 총점과 평균을 계산하는 내부 헬퍼 메서드
    private void setScores(int kor, int eng, int mat) {
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.total = this.kor + this.eng + this.mat;
        this.avg = (double) this.total / 3.0;
    }

    // Getter와 Setter
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

    // 점수 변경 시 총점과 평균을 자동으로 재계산하도록 수정했습니다.
    public void setKor(int kor) {
        this.kor = kor;
        this.total = this.kor + this.eng + this.mat;
        this.avg = (double) this.total / 3.0;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.total = this.kor + this.eng + this.mat;
        this.avg = (double) this.total / 3.0;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
        this.total = this.kor + this.eng + this.mat;
        this.avg = (double) this.total / 3.0;
    }

    public int getTotal() {
        return total;
    }

    public double getAvg() {
        return avg;
    }

    private void setTotal(int total) {
        this.total = total;
    }

    private void setAvg(double avg) {
        this.avg = avg;
    }

    //총점 기준으로 정렬
    @Override
    public int compareTo(Student o) {
        //내림차순으로 설정
        return o.getTotal() - this.getTotal();
    }

    //손수 오버라이딩 간다ㅏ
    //직접 타이핑하면 에러가 잘나는데 잡을 수단이 없음(에러가 안뜨거든)
    @Override //에러나면서 명명규칙 맞는지 여부 알려줌
    public String toString() {
        return "학번: " + num + ", 이름: " + name + ", 국어: " + kor + ", 영어: " + eng + ", 수학: " + mat;
    }

}
