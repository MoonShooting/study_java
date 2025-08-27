package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Memo2 {
    public static void main(String[] args) throws IOException {

        /*
        이 중에 골라서 하나의 방법으로 만들어보세요.
        1. String을 이어붙인다.
        2. StringBuffer에 모아놓는다. -> toString()으로 String으로 변환해서 저장한다.
        3. String들을 ArrayList에 저장한다. -> 반복문으로 String들을 꺼내어 저장한다.
        4. 임시파일을 만들어 저장한다. -> 저장 여부에 따라 삭제 or 이름 변경 (아직 안해본거라 방법 따로 찾아보기)
        */
        Scanner sc = new Scanner(System.in);
        File file = null;
        BufferedWriter out = null;
        String saveCheck;
        String name;
        ArrayList<String> content = new ArrayList<>();
        String line;
        //내용입력
        while (true) {
            System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터키를 누르면 됩니다.");
            line = sc.nextLine();
            if (line.isEmpty()) break; //값이 없으면 멈춤
            content.add(line); //ArrayList에 저장하기

            System.out.println("덮어쓰겠습니까? Y/N을 입력하세요.");
            saveCheck = sc.nextLine();
            //N입력하면 새로 파일명 입력받기(다시 while 위에서 시작)
            if (saveCheck.equalsIgnoreCase("Y")) {
                //todo: 수정
//                System.out.print("파일명을 입력하세요. : ");
//                name = sc.nextLine();
//                file = new File(name + ".txt"); //파일명 객체 생성
//                if (file.isFile()) { //이미 사용중인 이름인지 확인
//                    break;
//                } else {
//                    continue;
//                }
//
//                //파일 생성
//                out = new BufferedWriter(new FileWriter(file));
                while (true) {
                    System.out.print("파일명을 입력하세요. : ");
                    name = sc.nextLine();
                    file = new File(name + ".txt");

                    if (file.exists()) {
                        System.out.println("이미 존재하는 파일명입니다. 덮어쓰시겠습니까? Y/N");
                        String overwriteCheck = sc.nextLine();
                        if (overwriteCheck.equalsIgnoreCase("Y")) {
                            break; // 덮어쓰기 선택 시 루프 종료
                        }
                    } else {
                        break; // 파일이 존재하지 않으면 바로 루프 종료
                    }
                }

                // 3. 파일에 내용 쓰기
                try {
                    out = new BufferedWriter(new FileWriter(file));
                    for (String lines : content) {
                        out.write(lines);
                        out.newLine(); // 각 줄마다 줄바꿈
                    }
                    System.out.println(file.getName() + " 파일이 성공적으로 저장되었습니다.");
                } catch (IOException e) {
                    System.out.println("파일 저장 중 오류가 발생했습니다.");
                    e.printStackTrace();
                } finally {
                    // 4. 리소스 정리
                    if (out != null) {
                        out.close();
                    }
                    sc.close();
                }
            } else {
                System.out.println("저장을 취소했습니다.");
                sc.close();
            }

        }


    }
}