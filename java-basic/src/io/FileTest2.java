package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("c:\\java-busan-12th\\Test\\a.text");
        } catch (FileNotFoundException e) { //없는 파일을 열면 에러 발생하니까 처리.
            //catch를 IOException 으로 처리하더라도 가능(상속관계가 IOException가 더 상위 클래스라서)
            System.out.println();
        }

        //read를 쓸 때마다 하나씩 읽고, 그 다음을 읽는다.
        int ch;
        try {
            //todo: 한 줄씩 읽거나 한번에 다 읽어오려면?
            while ((ch = in.read()) != -1) {
                System.out.println((char) ch);
            }
//            while (true) {
//                if (in != null) {
//                    ch = in.read();
//                    if (ch == -1) break;
//                    System.out.println(ch);
//                }
//            }
        } catch (IOException e) {
            System.out.println("읽기 에러 발생");
        }


        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
