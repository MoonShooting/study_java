package day9.sellStore;

public class Cafe {
    private String cafeName;
    private String menu;

    public Cafe(String cafeName, String menu) {
        this.cafeName = cafeName;
        this.menu = menu;
    }

    public boolean isAvailable(String order) {
        return this.menu.equals(order);
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
