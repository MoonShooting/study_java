package day5;

public class ContinueExample {
    public static void main(String[] args) {
        /*
        Continue를 사용하여 짝수만 누산(=홀수면 건너뛰기) 해봅시다.
        */
        int i;
        int sum = 0;
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println("건너 뛰었을 때 값" + i);
                continue; //i가 홀수 일 때 동작(멈추고 다시 반복문 돌리러 올라감)
            }
            System.out.println("누산한 i값" + i);
            sum += i;
        }
        System.out.println("반복문을 나온 시점에 i의 값은 " + i + "이고, sum은 " + sum + "입니다.");
    }
}
