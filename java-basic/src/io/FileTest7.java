package io;

import api.Model.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileTest7 {
    public static void main(String[] args) throws Exception{
        //객체를 출력할 수 있는 ObjectOutputStream
        //실제 출력이 가능한 FileOutputStream
        //현재 정한 확장자(바이너리파일)은 해석 가능한 프로그램으로만 열 수 있다.
        // (ex-.raw는 포토샵 등 사진관련 작업에서만, docx은 엑셀에서만, hwp는 한글에서만 열리는 것처럼)
        ObjectOutputStream out = new ObjectOutputStream((new FileOutputStream("test.dat")));

        //writeObject가 저장할 수 있는 객체 = 직렬화가 가능한 객체여야 한다.
        /*
        직렬화란?
        레퍼런스 변수 -> Student객체(값, 함수, 데이터타입 등 여러 객체와 메서드) 중
        필요한 값을 스트림을 통과 할 수 있도록 줄 세우는 과정
        주소값, 기능도 저장할 필요가 없다. 결국 필요한 '실제 값'에 대해서만 객체 직렬화가 이루어진다.
        우리가 작업할 때, 상속을 통해 자동으로 이루어진다. => 직렬화 안되었다? 상속 살펴보기
        */
        //사용 예시
//        out.writeObject(new Integer("11"));
//        out.writeObject(new StringBuffer("aazaa"));
//        out.writeObject(new ArrayList<String>());

        out.writeObject(new Student("aaa",100,90,80));
        out.writeObject(new Student("bbb",87,53,100));
        out.writeObject(new Student("ccc",79,69,66));
        out.close(); //마찬가지로 다 저장하고 나면 종료를 꼭 해주어야 함


    }
}
