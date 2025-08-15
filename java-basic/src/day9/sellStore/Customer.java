package day9.sellStore;

public class Customer {
    private static int serialNum = 1;
    int customerID; //굳이?응 해~
    String name;
    String order;
    boolean isTakeout = false;

    public Customer(String name, String order, boolean isTakeout) {
        this.name = name;
        this.order = order;
        this.isTakeout = isTakeout;
        serialNum++;
        this.customerID  = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
