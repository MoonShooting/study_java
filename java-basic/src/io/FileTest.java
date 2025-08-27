package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        FileWriter out = null;
        //파일 생성
        try {
            //todo: 같은 이름 있을 때 확인 필요
            out = new FileWriter("c:\\java-busan-12th\\Test\\a.text"); //자기가 만든 c드라이브 내 폴더로 지정
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 생성 실패");
            return;
        }
        //입력도 에러가 발생할 수 있어서 catch가 필요함
        try {
            //todo: 작성을 다 하고 한번에 저장하려면?
            out.write('A'); //1byte
            out.write('\n'); // 엔터가 2byte가 되는 이유 => 윈도우에서 \r\n 동작(줄끝,줄바꿈)이 코드의 \n과 동일
            out.write('가'); //2byte
        } catch (IOException e) {
            System.out.println("쓰기 오류");
//            throw new RuntimeException(e); //런타임 에러 던진다
        }

        try {
            out.close();
        }catch (IOException e) {
            System.out.println("스트림 닫기 오류");
        }



    }
}
