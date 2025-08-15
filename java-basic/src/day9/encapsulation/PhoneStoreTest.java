package day9.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        //휴대폰 공장에서 생산
        Phone iphone = new Phone("iPhone",1000000);

        //판매점 객체 생성(단, 한 기종만 필 수 있는 대리점)
        PhoneStore store = new PhoneStore(iphone);

        //손님
        Customer customer = new Customer("김형근", 1000000, "iPhone");

        //손님이 구매를 한다.
        customer.buyPhone(store);

    }
}
