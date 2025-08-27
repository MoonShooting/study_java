package api.Controller;

import api.Model.Student;
import api.Util.FormatSet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 데이터 처리(안보이는 내부 구조, public 기능 등 포함됨.)
 *
 */
public class StudentService {
    private ArrayList<Student> studentList;
    private int number; //자동저장 넘버링 체크용(마지막 번호 체크)
    private final String filename = "student001";
    ObjectInputStream inputStream = null;
    ObjectOutputStream outputStream = null;

    public StudentService() {
        //있으면 열고, 없으면 새로 생성
        try {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            //넘버링 추가
            number = (Integer) inputStream.readObject();
//            studentList = new ArrayList<>(); //있으면 수정
            studentList = (ArrayList<Student>) inputStream.readObject();
        } catch (Exception e) { //없으면 생성
            studentList = new ArrayList<>();
        }

    }

    /**
     * 학생 정보 입력
     * 학번 입력 방식에 따라 처리 방식이 다름
     * 자동 저장 방식 채택 시, boolean으로 넘버링 무사 반환 여부 체크하여 값 넘기는걸 추천
     *
     * @param s
     * @return true
     */
    public boolean add(Student s) {
        boolean check = false;
        number++; //새 학번: 마지막 넘버링에 +1
        s.setNum(number);
        System.out.println(s);
        try {
            studentList.add(s);
            check = true;
        } catch (Exception e) {
            System.out.println("저장에 실패했습니다.");
        }
        return check; //입력순으로 저장
    }

    //수정할 학생 목록 학번을 기준으로 조회
    public Student getStudent(int num) {
        if (studentList.isEmpty()) {
            System.out.println("학생 성적 관리 목록에 없습니다. 다시 확인해주세요.");
            return null;
        }

        for (Student s : studentList) {
            if (s.getNum() == num) {
                return s; //찾으면 이미 여기서 반환됨
            }
        }
        System.out.println("학번을 다시 확인해주세요.");
        return null; // 찾지 못하면 null 반환
    }

    //학생 정보 수정
    public boolean modify(Student s) {
        if (s == null) {
            System.out.println("수정할 값을 제대로 받아오지 못했습니다.");
            return false;
        }
        System.out.println("수정되었습니다.");
        System.out.println(s);
        return true;
    }

    //학생 정보 삭제(학번 기준 해당하는 Student객체를 ArrayList에서 삭제)
    public Student delete(int num) {
        Student s = getStudent(num); //학번 유효성 검사 끝내고 나온 값.
//        for(Student st : studentList) {
//            if(s.getNum() == num) {
//                studentList.remove(s);
//                return s; //삭제 완료 시, 삭제한 값 반환
//            }
//        }
        if (s != null) {
            studentList.remove(s); // 해당 객체만 삭제
            return s;
        }
        System.out.println("해당 학번의 학생이 존재하지 않습니다.");
        return null;
    }

    //학생 성적 프로그램의 학생 목록이 있는지 유무 체크
    public boolean searchStudent() {
        if (studentList.isEmpty()) {
            System.out.println("목록이 없습니다.");
            return false;
        }
        return true;
    }

    //학생 이름으로 검색
    public void searchName(String name) {
        boolean found = false; // 찾았는지 여부 체크

        // 제목줄은 딱 한 번만 출력(보기 좋게 정렬)
        System.out.printf("%-6s %-6s %-6s %-6s %-6s %-6s %-6s\n", "학번", "이름", "국어", "영어", "수학","총점","평균");
        Collections.sort(studentList); //정렬
        for (Student s : studentList) {
            if (s.getName().startsWith(name)) {

                System.out.printf("%-6d %-6s %-6d %-6d %-6d %-6d %-6s\n",
                        s.getNum(), s.getName(), s.getKor(), s.getEng(), s.getMat(), s.getTotal(),
                        FormatSet.formatAvg(s.getAvg()));
                found = true;
            }
        }

        if (!found) {
            System.out.println("찾는 정보가 없습니다.");
        }
    }

    //학생 정보 전체 출력 (studentList의 복사본 리턴)
    //실제 값이 아닌 복사복으로 해야 값이 안전하게 출력만 한다.
    public ArrayList<Student> getList() {
        ArrayList<Student> newList = new ArrayList<>();
        //for문에 복사본을 담아서 새 리스트에 담는다.
        for (Student s : studentList) {
            newList.add(new Student(s));
        }
        Collections.sort(newList); //담아둔 복사본 총점순으로 정렬
        return newList;
    }

    public void save() {
        //현재 상태 파일에 저장(마지막 번호, 성적정보 리스트)
        try {
            //객체로 저장 하는 방식
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            Integer numberObject = number;
            outputStream.writeObject(numberObject);
            outputStream.writeObject(studentList);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
