package day4.switchexample;

public class SwithCase {
    public static void main(String[] args) {
        /*
        switch (조건) {
            case 조건과 일치하는지 확인할 값1 : 수행문; //일치하면 수행문 수행
            breack;
            case 조건과 일치하는지 확인할 값1 : 수행문; //일치하면 수행문 수행
            breack;// case에 일치하는 경우 수행문을 실행 -> switch 조건식에서 벗어남
            default : 수행문; //기본값(초기값)으로 default. case에 일치하는 것이 아무것도 없을 때 해당 수행문 출력
        }
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
            case "Gold":
                System.out.println("금메달입니다.");
                break; //이거 하고 멈추기~
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("흠..없숨니다.");
        }
    }
}
