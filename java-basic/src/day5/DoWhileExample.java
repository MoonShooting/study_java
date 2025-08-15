package day5;

public class DoWhileExample {
    public static void main(String[] args) {
        // 2. do-while 문
        /*
        실행문이라 마지막에 ;를 붙인다.
        do {
            실행문; //조건식이 참이 아니라도 우선 1회 실행
        } while (조건식);
        실행문 자체가 1회 실해오디는 것을 상정하므로 끝에 세미콜론을 쓴다.
        */
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;
        } while (num <= 10);
        System.out.println("1~10까지의 합은"+sum+"입니다.");
    }
}
