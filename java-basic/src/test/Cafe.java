package test;

public class Cafe {
    //필드
    private static int sirialNum = 1;
    int cafeID;
    String name;//가게명
    String[] menuNames;//메뉴 이름
    int[] menuPrices;//메뉴 가격
    String staff;//알바
    String openingHours;//운영시간
    Store store;

    public Cafe(String name, String[] menuNames, int[] menuPrices, String staff, String openingHours, Store store) {
        sirialNum++;
        this.cafeID = sirialNum;
        this.name = name;
        this.menuNames = menuNames;
        this.menuPrices = menuPrices;
        this.staff = staff;
        this.openingHours = openingHours;
        this.store = store;
    }

    //주문받기
    public int order(String choiceMenu) {
        for (int i = 0; i < menuNames.length; i++) {
            //메뉴판 안에 있는 메뉴를 고른 경우
            if (menuNames[i].equals(choiceMenu)) {
                return menuPrices[i];//가격 반환
            }
        }
        System.out.println("해당 메뉴는 저희 카페에서 판매하지 않는 제품입니다.");
        return 0;
//        throw new IllegalArgumentException("메뉴에 없습니다.");
    }


}
