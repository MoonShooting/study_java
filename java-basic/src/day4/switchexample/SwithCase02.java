package day4.switchexample;

public class SwithCase02 {
    public static void main(String[] args) {
        /*
            breack가 없어도 switch-case 기본 동작과 목적에 부합하도록, 간결하게 쓰는 방법

        */
        int ranking = 1;
        char medalColor;
        switch (ranking) {
            case 1:
                medalColor = 'G';
                break; //이거 하고 멈추기~
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }
        System.out.println(medalColor); //값이 확실하게 무엇이 될지 모르기 때문에 초기값 필요

        String medal = "Gold";
        switch (medal) {
            case "Gold"->System.out.println("금메달입니다.");
            case "Silver"->System.out.println("은메달입니다.");
            case "Bronze"->System.out.println("동메달입니다.");
            default->System.out.println("메달? 없숨니다.");
        }
        //바로 switch문을 변수에 담아서 출력하는 방법도 있다.
        String message = switch (medal) {
            case "Gold"->"금메달입니다.";
            case "Silver"->"은메달입니다.";
            case "Bronze"->"동메달입니다.";
            default-> {
                if("blank" == medal) {
                   yield  "메달? 없숨니다.";
                } else {
                    yield  "알 수 없습니다.";
                    //switch-case 안에 복잡한 제어문이 더 들어가는 경우 수행결과를 반환하기 위해 사용함
                }
            }
        };
        System.out.println(message);

    }
}
