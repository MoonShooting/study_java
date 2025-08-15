package day4.switchexample;

public class SwitchCase03 {
    public static void main(String[] args) {
        int month = 0;
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                //1~12사이의 숫자가 아닌 경우
                if (month < 1 || month > 12) {
                    System.out.println("없는 달입니다.");
                } else {
                    //그마저도 아닌 경우
                    System.out.println("알 수 없는 오류입니다.");
                }
                yield 0; //예외가 되었든 예외가 아니든 값을 기본 값 출력하도록 설정해야 default 부분 에러가 안난다.
            }
        };


    }
}
