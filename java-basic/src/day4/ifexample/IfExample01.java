package day4.ifexample;

public class IfExample01 {
    public static void main(String[] args) {
        //조건문
        /*
        if(조건식){
            조건식이 참을 반환할 때 실행할 수행문;
        }
        조건은 노리값을 반환하여야 한다.
            -> 자바에서 조건식은 반드시 논리형의 데이터를 반환하는 식이어야 한다.
            (자바는 타입에 엄격한 언어이기 때문에 '참으로 평가되는 값'이라는 개념이 없다.)

        */
        String name = "철수";
        int age = 9;
        if (age >= 8) {
            System.out.println(name+"는 학교에 다닙니다.");
        }
    }
}
