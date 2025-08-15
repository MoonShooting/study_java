package day3;

//1. Scanner를 사용하기 위해 import 한다.

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        //2. Scanner 객체를 생성한다.
        Scanner scanner = new Scanner(System.in);

        //3. Scanner 객체를 사용하여 입력을 받는다.
        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine(); //문자 입력 가능
        System.out.println("변경하실 이름을 입력해주세요.: ");
        //scanner.nextLine();
        //nextInt(); 얘는 숫자만 읽음(줄바꿈 문자를 안읽음)
        //버퍼에 남아있는 개행문자(\n)를 제거해줘야함.
        String newName = scanner.nextLine();
        System.out.println("변경된 이름은: "+newName);

        scanner.close(); // 리소스 해제

        System.out.println("숫자를 입력해주세요: ");
        int a = scanner.nextInt(); //정수값(숫자) 입력 가능
        System.out.println("입력완료" + a);

        //4. 여러개를 입력받을 때는 1,2는 제외 3번을 반복한다.
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //5. 입력받은 정수값 사용하기
        int result = a + b + c;
        System.out.println("입력받은 값의 합계 " + result);


    }
}
