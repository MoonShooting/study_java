package school;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 데이터 처리
 */
public class StudentService {
    private ArrayList<Student> studentList;     //학생 정보를 저장할 리스트
    private int number;                         //마지막 번호
    private final String filename = "student_data"; //파일명
    private ObjectInputStream inputStream;          //입력 스트림
    private ObjectOutputStream outputStream;        //출력 스트림

    public StudentService() {
        //기존 저장된 파일이 있으면 열고 없으면 리스트를 새로 생성
        try {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            number = (Integer) inputStream.readObject();
            studentList = (ArrayList<Student>) inputStream.readObject();
        }
        catch (Exception e) {
            studentList = new ArrayList<>();
        }
    }

    //학생정보 저장. 새로운 일련번호 부여.
    public void add(Student s) {
        number++;
        s.setNum(number);
        studentList.add(s);
    }

    //학생 정보 전체 출력 (studentList의 복사본 리턴)
    //리스트 뿐 아니라 각 요소의 값인 Student 객체도 복사본을 생성
    public ArrayList<Student> getList() {
        ArrayList<Student> newList = new ArrayList<>();

        //원본 리스트의 각 요소를 복사하여 새 리스트에 저장
        for (Student s : studentList) {
            newList.add(new Student(s));
        }
        //복사본을 총점순으로 정렬
        Collections.sort(newList);
        //복사본 리턴
        return newList;
    }

    //학생 정보 삭제 (번호를 전달받아 해당되는 Student객체를 ArrayList에서 삭제)
    public boolean delete(int num) {
        boolean result = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (num == studentList.get(i).getNum()) {       //같은 번호가 있으면
                studentList.remove(i);                      //현재 위치의 객체 삭제
                result = true;
                break;
            }
        }
        return result;
    }

    //한 학생의 정보 조회 (번호를 전달받아 해당되는 Student 객체 리턴)
    public Student getStudent(int num) {
        Student s = null;
        for (int i = 0; i < studentList.size(); i++) {
            if (num == studentList.get(i).getNum()) {       //같은 번호가 있으면
                s = studentList.get(i);
                break;
            }
        }
        return s;
    }

    //학생 정보 수정 (Student 객체를 전달받아 같은 번호의 학생정보 수정)
    public boolean modify(Student newObject) {
        boolean result = false;
        for (int i = 0; i < studentList.size(); i++) {
            Student oldObject = studentList.get(i);
            if (newObject.getNum() == oldObject.getNum()) {   //같은 번호가 있으면
                oldObject.setName(newObject.getName());
                oldObject.setKor(newObject.getKor());
                oldObject.setEng(newObject.getEng());
                oldObject.setMat(newObject.getMat());
                result = true;
                break;
            }
        }
        return result;
    }

    //학생 정보 검색 (검색결과의 복사본 리턴)
    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> newList = new ArrayList<>();

        //원본 리스트에서 이름에 전달된 문자열이 포함된 요소를 복사하여 새 리스트에 저장
        for (Student s : studentList) {
            if (s.getName().contains(name)) {
                newList.add(new Student(s));
            }
        }
        //복사본 리턴
        return newList;
    }

    //현재 상태 파일에 저장 (마지막 번호, 성적정보 리스트)
    public void save() {
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            Integer numberObject = number;
            outputStream.writeObject(numberObject);
            outputStream.writeObject(studentList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
