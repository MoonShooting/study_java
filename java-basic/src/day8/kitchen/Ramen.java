package day8.kitchen;

public class Ramen {
    //필드(=변수)
    private static int srialNum = 1;
    int ramenNum;
    public String noodleType;
    String soupType;
    private boolean isCooked;

    //생성자? 클래스 이름과 같은 이름을 가진 메서드
    //객체가 생성될 때 호출되어 객체의 초기 상태를 설정하는 특수한 메서드
    //new 키워드와 함께 호출하며 새 객체를 생성하기 위한 메서드

    public Ramen() {
        //기본 생성자(디폴트 생성자) : 생성자를 직접 만들지 않으면 자동으로 만들어준다.
        //기본 생성자를 통해 만들어진 객체의 인스턴스변수에는 각 타입의 기본값이 들어간다.
    }

    //상태 조회를 위해 get설정


    //생성자 오버로드: 생성자는 같은 이름으로 여러개 만들 수 있다.
    public Ramen(String noodleType, String rSoupType) {
        this.noodleType = noodleType; //this? 생성된 인스턴스 스스로를 가리키는 예약어. 이름이 같을 때 사용
//        noodleType = rNoodleType; //매운라면 대입하여 선언(필드에 인자값 선언)
        soupType = rSoupType;//가루스프
        isCooked = false;
        srialNum++;
        ramenNum = srialNum;
    }

    //메서드
    //출력문만을 호출하여 별도의 타입이 필요없는 상태입니다.
    //따라서 void만 사용합니다.
    void boilWater() {
        System.out.println("물을 끓입니다...");
    }

    void addNoodles() {
        System.out.println(noodleType + " 면을 넣습니다.");
    }

    void addSoup() {
        if (soupType == "가루스프") {
            System.out.println("스프를 넣습니다..잘풀어서 넣어야 맛있쥐");
        } else {
            System.out.println("액상스프를 스프넣기");
        }
    }

    public void cook() {
        boilWater();
        addNoodles();
        addSoup();
        isCooked = true;
        System.out.println("라면이 완성되었습니다!");
    }

    public boolean getIsCooked() {
        return isCooked;
    }

    public static int getSrialNum() {
        return srialNum;
    }
}
