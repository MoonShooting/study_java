package day5;

public class ForPractice {
    public static void main(String[] args) {
        //1~@까지의 합이 100이상일 때 @와 100이상이 된 누산값을 출력하세요.
        int sum = 0;
        int i = 0;
        for (; ; i++) {
            sum += i;
            if (sum >= 100) break; //sum값이 100이 되면 for문이 멈춘다.(순서상 여기를 통과 한 뒤 증감식을 가게 된다.)
        }
        System.out.println("반복문을 나온 시점에 i의 값은 " + i + "이고, sum은 " + sum+"입니다.");
    }
}
