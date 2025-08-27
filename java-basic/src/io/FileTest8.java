package io;

import api.Model.Student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileTest8 {
    public static void main(String[] args) throws Exception {
        //파일을 열어보자. 열기 위해 객체를 읽어와야 한다.
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.dat"));
        Student s = null;
        //한 개만 읽을 때 => 첫번째 학생의 정보만 읽어온다.
        //원래 Student인데 상위 타입을 참조해서 원래 타입을 알려주는 것으로, 데이터 타입의 강제 형변환과는 다르다.

        try {
            while (true) {
                s = (Student) in.readObject(); //return을 Object로 읽어와서 형변환을 함.
                System.out.println(s);
            }
        }catch (EOFException e) {
            System.out.println("출력할 객체가 더 존재하지 않습니다.");
        }

        in.close(); //출력 종료

    }
}
