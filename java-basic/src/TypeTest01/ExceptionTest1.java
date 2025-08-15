package TypeTest01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        try {
            System.out.println("정수입력: ");
            a = sc.nextInt();
            System.out.println("정수입력: ");
            b = sc.nextInt();
            c = a / b;
            System.out.println(c);
        }catch (InputMismatchException e) {
            System.out.println("숫자로 다시 입력하세요.");
        }catch (ArithmeticException e) { //하위클래스를 앞에 두어야 한다.
            System.out.println("0으로 나눌 수 없습니다.");
            return; //메서드 종료 (프로그램 종료 => 프로그램의 나머지 부분이 나오지 않는다.)
        } catch (Exception e) {
            System.out.println("그 밖의 예외");
        } finally{
            System.out.println("무조건 실행함. 마무리 시 사용");
        }
        System.out.println("프로그램의 나머지 부분");

    }
}
