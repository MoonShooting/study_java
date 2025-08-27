package io;

import java.io.File;
import java.io.IOException;

public class FileTest4 {
    public static void main(String[] args) {
        File a = new File("a.txt"); //없는 파일
        File b = new File("c:\\java-busan-12th\\Test"); //있는 디렉토리
        File c = new File("."); //상대경로: 현재 디렉토리
        File d = new File("sub"); //없는 디렉토리
        File e = new File("c:\\java-busan-12th\\Test\\a.text"); //있는 파일

        //현재 경로에 a.txt 파일이 없으면 생성
        if (!e.isFile()) {
            try {
                e.createNewFile();
                System.out.println("aㅇㅇ");
            } catch (IOException ex) {
                System.out.println("응 없어 에러야 돌아가~");
                return;
            }
        }
        //현재 경로에 sub 폴더가 없으면 생성
        if (!d.isDirectory()) {
            System.out.println("dㅇㅇ");
            d.mkdir();
        }

        //a 객체가 가리키는 파일 삭제
        e.delete();

        System.out.println();


    }
}
