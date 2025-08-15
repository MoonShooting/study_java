package day9.encapsulation;

import java.lang.reflect.Member;

public class Customer {
    private String name;
    private double budget; //예산
    private String desiredModel;//고객이 원하는 모델명


    public Customer(String name, double budget, String desiredModel) {
        this.name = name;
        this.budget = budget;
        this.desiredModel = desiredModel;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public String getDesiredModel() {
        return desiredModel;
    }


    /**
     * 고객이 휴대폰 사는 동작
     * 대리점 객체가 휴대폰을 파는 메서드를 호출
     * TODO: 고객이 구입하려는 휴대폰기종과 대리점이 취급하는 기종의 일치여부를 확인
     *
     * @param store 대리점
     */

    //고객이 핸드폰 구매
    public void buyPhone(PhoneStore store) {
        //고객이 원하는 핸드폰 기종 및 예산
        Phone phone = store.sellPhone(desiredModel, 1000000);

        System.out.println(phone.getModel() + "현재 값");
        //고객의 수령 여부 확인(샀는데 못받았으면 우째)
        if (phone != null) {
            System.out.println("고객: 핸드폰 " + phone.getModel() + " 구입이 완료되었습니다.");
        } else {
            System.out.println("고객: 구매를 완료하지 못했습니다.");
        }
    }
}
