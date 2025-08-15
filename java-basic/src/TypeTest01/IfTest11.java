package TypeTest01;

import java.util.Scanner;

public class IfTest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.println("정수값 써봐바 : ");
        val = sc.nextInt();

        if (val > 0) {
            System.out.println("양수입니다.");
        } else if (val == 0) {
            System.out.println("0입니다.");
        } else System.out.println("음수입니다.");

        switch (val) {
            case 1 :
                System.out.println("값이 1인거");
            break;
            case 2 :
             System.out.println("값이 2인거");
            break;
        }


        do {
            System.out.println("입력을 완료하였습니다. while 체크 들어감돠");
        } while (val >= 0);

        while (val >= 0) {
            System.out.println("먼저 체크 들어가고 확인해보니 양수 맞네이");
        }


    }
}
