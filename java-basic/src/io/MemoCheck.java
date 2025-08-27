package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemoCheck {
    public static void main(String[] args) throws IOException {
        //선생님 풀이
        //3. String들을 ArrayList에 저장한다. -> 반복문으로 String들을 꺼내어 저장한다.
        Scanner sc = new Scanner(System.in);
        File file = null;
        BufferedWriter out = null;
        String saveCheck;
        String content;
        ArrayList<String> list = new ArrayList<>();
        //내용 입력
        while (true) {
            content = sc.nextLine(); //사용자로부터 한 줄씩 입력 받음
            if (content.isEmpty()) break;
            list.add(content); //메모리에 모아두고
        }
        
        //저장 여부 확인 이전과 동일
        System.out.println("저장하시겠습니까? Y/N을 입력하세요.");
        saveCheck = sc.nextLine();
        if (saveCheck.equalsIgnoreCase("Y")) {
            while (true) {
                System.out.print("파일명을 입력하세요. : ");
                String name = sc.nextLine();
                file = new File(name + ".txt");
                //파일명 중복 여부 확인
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
        }
        //저장하기(out가 null인 경우까지 체크하진 않았음. 실전에서는 에러 가능성 염두해두기)
        //메모리에 모아둔 ArrayList의 내용을 파일에 한 줄씩 씁니다.
        for (String s : list) {
            out.write(s);
            out.newLine(); // 줄바꿈을 추가하여 각 줄을 구분합니다.
        }
        out.close();

    }
}
