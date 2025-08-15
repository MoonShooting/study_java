package day5;

public class WhileExample {
    public static void main(String[] args) {
        /*
        1. while문
        while (조건식) { //자체가 실행문이 아니여서 ;를 붙이진 않음
            실행문;
        }
        조건은 boolean값을 반환해야 하며 참을 반환하는 동안 실행문을 반복
        실행내용은 중괄호 안에 들어있음 while문의 중괄호 끝에는 세미콜론을 쓰지 않음
        */
        int num = 1;
        int sum = 0; // 누산 결과를 담을 변수

        while (num <= 10) { //조건부터 확인
            sum += num;
            num++;
        }
        System.out.println("1~10까지 합은" + sum + "입니다.");
    }
}
