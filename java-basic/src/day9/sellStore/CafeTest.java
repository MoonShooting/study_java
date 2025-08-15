package day9.sellStore;

public class CafeTest {
    public static void main(String[] args) {
        Customer customer = new Customer("손님1", "콜드브루", true);
        Cafe cafe = new Cafe("텐퍼센트", "콜드브루");
        Store store = new Store(3000, cafe.getMenu());

        String cafeMenu = cafe.getMenu();
        if (cafe.isAvailable(customer.getOrder())) {
            System.out.println("콜드브루 한 잔 " + store.getPrice() + "원이고, 대기번호는 " + Customer.getSerialNum() + "번 입니다. 테이크아웃인가요?");

        } else {
            System.out.println("아 오늘 원두가 떨어져서 없어용 헤헤");
        }
        if (customer.isTakeout) {
            System.out.println("손님: 네 가져갈거예요.");
            System.out.println("감사합니다. " + Customer.getSerialNum() + "번 손님 커피 나왔습니다.");
        } else {
            System.out.println("손님: 아니요 먹고 갈거예요.");
            System.out.println("넵 감사합니다." + Customer.getSerialNum() + "번 손님 커피 나왔습니다.");
        }
    }
}
