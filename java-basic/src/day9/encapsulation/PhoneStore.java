package day9.encapsulation;

public class PhoneStore {
    private Phone phone;

    //대리점 생산
    public PhoneStore(Phone phone) {
        this.phone = phone;

    }

    /**
     * 대리점이 휴대폰을 파는 동작/메서드
     * - 요금제를 등록하고 registerPayment
     * - 할인을 적용한뒤 discountPromotion
     * - 휴대폰을 전달함 return
     * TODO: 모덷명과 예산을 파라메터로 받아서 구입가능여부를 확인 후 반환값을 전달
     *
     * @param model, budget
     * @return Phone 판매한 휴대폰 객체
     */


    //대리점이 휴대폰을 파는 동작/메서드
    //Phone 클래스의 sellPhone 메서드
    public Phone sellPhone(String model, double budget) {
        String phoneModel = phone.getModel();
//        System.out.println(phoneModel+" : phoneModel 뭔데?");
        if (model.equals(phoneModel) && budget >= 1000000) {
            System.out.println("구매완료!");
            return phone;
        } else {
            System.out.println("구매하지 못헀습니다.");
            return null;
        }

        //선생님 로직
//        if (model.equals(phoneModel) && budget >= phone.getPrice()) {
//            registerPayment();
//            discountPromotion();
//            System.out.println("대리점: 휴대폰 전달");
//            return phone;
//        } else {
//            System.out.println("원하시는 제품이 없습니다.");
//            return null;
//        }


//        if (model.equals(phoneModel) || budget >= 900000) {
//            registerPayment();
//            discountPromotion();
//            //대리점이 휴대폰을 판매할 때 일어나는 일.
//            System.out.println("대리점: 휴대폰 전달");
//            return phone; //구매 후 실제 핸드폰을 전달
//        } else
//            System.out.println("원하시는 제품이 없습니다.");
//        return null;

    }

    //대리점 내에서만 발생하는 동작이기 때문에 접근제한자로 제어
    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다. ");
    }

    //대리점 내에서만 발생하는 동작이기 때문에 접근제한자로 제어
    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }


}
