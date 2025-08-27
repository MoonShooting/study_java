package io;

import java.io.*;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileTest3 {
    public static void main(String[] args) {
        /*
        [실행1]
        파일명 입력 : (사용자가 입력하는 부분) c:\aaa\Test.java
        import java.util.*;
        ...
        [실행2]
        파일명 입력 : (사용자가 입력하는 부분) c:\aaa\bbb
        파일이 없습니다.
        
        * */
        //필요 변수 선언, 객체 생성
        FileReader reader = null;
        File f = null;
        Scanner sc = new Scanner(System.in);
        String fileName;
        int ch = 0;  //파일명 입력 후 중복 체크 -> 생성
        System.out.print("파일명 입력: "); //메시지 출력
        fileName = sc.nextLine(); //파일명 입력받기

        //파일로부터 읽을 수 있는 스트림객체 생성(파일 열기)
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없는데요 휴먼??");
            //return; //main 메서드 종료(메서드 종료 시 사용)
            System.exit(0);//위치 관계 없이 프로그램 종료(0: 정상 종료)
        }

        try { //try가 안에 있으면 예외 발생 시 break;가 필요
            while (true) {
                ch = reader.read(); //반복문으로 1문자씩 읽기 -> 문자말고 통째로 읽기로 변환
                if (ch == -1) break; //-1이 리턴되면 반복 종료
                System.out.println((char) ch); //읽은 문자 화면에 출력
            }
        } catch (IOException e) {
            System.out.println("출력 에러 확인");
            e.printStackTrace();
        }

        //스트림 객체 닫기
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("스트림 객체 닫기 에러");
        }


    }
}
