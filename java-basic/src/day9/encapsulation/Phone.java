package day9.encapsulation;

public class Phone {
    //필드(변수)
    private String model;
    private double price;

    //new Phone을 통해 생성 시점에서 처음부터 2가지 값을 지정하여 생성하겠다.
    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    //기종 조회를 위한 get메서드
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
