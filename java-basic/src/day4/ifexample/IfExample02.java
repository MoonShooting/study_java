package day4.ifexample;

public class IfExample02 {
    public static void main(String[] args) {
        /*
        기본 구조
        if(조건식) {
            조건식이 참을 반환할 때 실행할 수행문;
        }else if (또 다른 조건식){
            또 다른 조건식이 참을 반환할 때 실행할 수행문;
        }else {
            위의 조건식이 거짓을 반환할 때 실행되는 수행문;
        }
        */
        int age = 7;
        int charge = 1000;

        if (age < 14 && age > 16) {
            charge = 2500;
            System.out.println("중학생이고, 입장료는 " + charge + "원 입니다.");
        }

        if (age < 8) {
            System.out.println("미취학 아동입니다.");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중,고등학생입니다.");
        } else {
            charge = 3000;
            System.out.println("초등학생입니다.");
        }
        System.out.println("입장료는 " + charge + "원 입니다.");

        int a = 10;
        int b = 5;
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);
        max = (a > b) ? a : b;
        System.out.println(max);

    }

}
