package test;

public class Customer {
    String name;//고객명
    int totalPrice;//주문 총가격
    int points;//포인트 적립
    static final double POINT_RATE = 0.1; // 모든 고객 공통 10% 적립

    public Customer(String name) {
        this.name = name;
        this.totalPrice = 0;
        this.points = 0;
    }

    //손님의 구매신청
    public void buy(Cafe cafe, String menuName, boolean savePoint) {
        int price = cafe.order(menuName);
        totalPrice += price;

        System.out.println(name + "님이 " + menuName + "을(를) 주문하셨습니다. 가격: " + price + "원");

        if (savePoint) { //포인트 적립
            int earned = (int) (price * POINT_RATE); //포인트 적립: 구매한 가격의 10%
            points += earned; //기존 포인트에 적립
            System.out.println("포인트" + earned + "점 적립. 현재 포인트: " + points);
        }

    }

}
