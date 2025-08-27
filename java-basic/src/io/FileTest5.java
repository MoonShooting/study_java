package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileTest5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File file = null;
        BufferedWriter out = null;
        String fileName = null;
        String content = null;

        while (true) {
            System.out.println("파일명 입력: ");
            fileName = sc.nextLine();
            file = new File(fileName + ".txt"); //파일명 객체 생성
            if (file.isFile()) { //이미 사용중인 이름인지 확인
                //있으면 덮어쓸지 여부 확인
                System.out.println("덮어쓰겠습니까? Y/N을 입력하세요.");
                content = sc.nextLine();
                //N입력하면 새로 파일명 입력받기(다시 while 위에서 시작)
                if (content.equalsIgnoreCase("Y")) {
                    break;
                } else { //이상한 단어 쓰는 것도 no로 가정하여 구문 작성
                    continue;
                }
//                if (content.equals("N") || content.equals("n")) {
//                    continue;
//                } else if (content.equals("Y") || content.equals("y")) {
//                    break;
//                } else {
//                    System.out.println("입력값이 다릅니다. 다시 입력하세요. ");
//                    continue;
//                }
            }
            break;
        }
        //파일 생성(=스트림 객체 생성)
        //버퍼를 쓰려면 혼자 못써서 원래의 입출력 가능한 클래스를 만들어야 사용가능
        //최초에 입출력에 대해 생성자로 전달해서 초기화하면 사용가능
        out = new BufferedWriter(new FileWriter(file));
        //반복적으로 내용 입력받아 파일에 저장(한 줄씩 입력할 때마다 저장)
        //횟수 제한이 없음 => while
        System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터를 입력하세요.");
        while (true) {
            content = sc.nextLine();
            if (content.isEmpty()) break; //엔터 입력 2번 시 작업 종료 => 값이 0이다., ""이다.
            //content.length() == 0
            out.write(content);
            out.newLine(); // 줄 끝마다 엔터(\n) 대신 이걸 사용하면 자동으로 정렬해준다.
        }
        System.out.println(file.getName() + " 파일이 저장되었습니다.");

        //스트림 닫기
        out.close();

    }
}
