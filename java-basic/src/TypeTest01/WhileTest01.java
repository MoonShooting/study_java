package TypeTest01;

import java.util.Objects;
import java.util.Scanner;

public class WhileTest01 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = -1, s = 0;

        //0을 입력받으면 지금까지 입력한 정수 값 모두 더해서 출력
//        while (n != 0) {
//            System.out.println("정수 입력: ");
//            n = sr.nextInt();
//            s += n;
//        }
//        System.out.println("합계 : " + s);
//        String val = "";
//        do {
//            System.out.println("정수 입력: ");
//            n = sr.nextInt();
//            s += n;
//        }while (n != 0); //!Objects.equals(val, "1")
//        System.out.println("합계 : " + s);
        s = 0;
        while (true) {
            try {
                System.out.println("정수 입력: ");
                n = sr.nextInt();
            } catch (Exception e) {
                System.out.println("어어 숫자라고 돌아가 다시 숫자로 써");
                //버퍼 한번에 비우도록 설정
                sr.nextLine();
                continue;
            }
            if (n == 0) {
                break;
            }
            s += n;
        }
        System.out.println("합계 : " + s); //도달할 수 없는 구문이라는 에러 발생

    }
}
