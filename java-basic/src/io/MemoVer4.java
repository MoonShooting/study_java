package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemoVer4 {
    public static void main(String[] args) throws IOException {
        // 4. 임시파일을 만들어 저장한다. -> 저장 여부에 따라 삭제 or 이름 변경
        Scanner sc = new Scanner(System.in);
        BufferedWriter out = null;
        String content;
        String saveCheck;
        File newFile = null; //실제 생성 시 사용
        // 임시 파일 생성
        File tempFile = new File("__temp.tmp");

        out = new BufferedWriter(new FileWriter(tempFile));
        System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터키를 누르면 됩니다.");
        // 사용자로부터 한 줄씩 입력받아 임시 파일에 바로 씁니다.
        while (true) {
            content = sc.nextLine();
            if (content.isEmpty()) {
                break;
            }
            out.write(content);
            out.newLine();
        }
        out.close(); //스트림을 이 때 닫아준다!!

        //저장 여부 체크
        System.out.println("저장하시겠습니까? Y/N을 입력하세요.");
        saveCheck = sc.nextLine();

        if (saveCheck.equalsIgnoreCase("Y")) {
            //새로 생성할 파일은 여기서 사용된다.
            while (true) {
                System.out.print("파일명을 입력하세요. : ");
                String name = sc.nextLine();
                newFile = new File(name + ".txt");

                // 파일명 중복 여부 확인
                if (newFile.exists()) {
                    System.out.println("이미 존재하는 파일명입니다. 덮어쓰시겠습니까? Y/N");
                    String overwriteCheck = sc.nextLine();
                    if (overwriteCheck.equalsIgnoreCase("Y")) {
                        // 덮어쓰기 선택 시 기존 파일 삭제 후 루프 종료
                        newFile.delete();
                        break;
                    } else {  // Y가 아닌 경우 파일명 입력으로 되돌아가기
                        continue;
                    }
                } else {
                    break; // 파일이 존재하지 않으면 바로 루프 종료
                }
            }
            //저장하기로 헀다면, 임시 파일의 이름을 새 파일명으로 변경
            tempFile.renameTo(newFile);
            System.out.println(newFile.getName() + " 파일이 저장되었습니다.");
        } else {
            // 저장하지 않겠다고 한 경우 임시 파일 삭제
            tempFile.delete();
            System.out.println("저장을 취소했습니다. 임시 파일이 삭제되었습니다.");
        }


    }
}
