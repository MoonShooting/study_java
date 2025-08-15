package day8.kitchen;

public class Main {
    public static void main(String[] args) {
        //인스턴스 = 실제 요리 생성
        Ramen spicyRamen = new Ramen("매운라면", "가루스프"); //쏘스페셜~
//        spicyRamen.noodleType = "매운라면";
//        spicyRamen.soupType = "가루스프";
        Ramen mildRamen = new Ramen("안매운라면", "액상스프");
        spicyRamen = mildRamen;



        //조리 시작
        spicyRamen.cook();
        System.out.println(spicyRamen.getIsCooked());
        //System.out.println(spicyRamen);//주소값 출력
        System.out.println("= = = = = =");
        //라면이라는 추상적 개념-> 클래스
        //인스턴스는 그 실체인 라면봉지
        //클래스를 통해 생성된 실체를 인스턴스라고 부름
        //Java에서의 인스턴스는 코드 내 객체(instance of class)
        //SQL에서의 인스턴스는 운영 시스템 차원의 실행 중인 DB 환경
        
        /*
        클래스를 통해 생성된 실체를 인스턴스라고 부름
        인스턴스가 생성되면
        변수에 인스턴스를 담는다치고 변수이름은 스택에 저장됨
        그 실체(객체_인스턴스)는 힙 메모리에 저장됨
        변수에 담긴 값은 리모컨, 리모컨이 객체(인스턴스)를 가리켜 정보나 행동을 가져옴.
        */

        BeanPasteStew yumm = new BeanPasteStew("차돌", "두부");
        yumm.stewType= "차돌";
        yumm.material = "두부";

        yumm.cook();
        System.out.println();
    }
}
