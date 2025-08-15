package test;

public class CafeTest {
    public static void main(String[] args) {
        Store store = new Store("콜롬비아", 5000);

        // 카페 메뉴와 가격
        String[] menuNames = {"아메리카노", "라떼", "카푸치노"};
        int[] menuPrices = {3000, 4000, 4500};

        // 카페 객체 생성
        Cafe cafe = new Cafe("별다방", menuNames, menuPrices, "철수", "08:00~22:00", store);

        // 손님 객체 생성
        Customer customer = new Customer("지우");

        // 주문 예시
        customer.buy(cafe, "아메리카노", true); // 포인트 적립 O
        customer.buy(cafe, "프라페", false); // 포인트 적립 X
    }
}
