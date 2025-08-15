package day8.kitchen;

public class BeanPasteStew {
    String stewType;
    String material;
    String cuttingSet;
    boolean isCooking;

    public BeanPasteStew(String nStewType, String nMaterial) {
        stewType = nStewType;
        material = nMaterial;
        isCooking = false;
    }

    void boilWater() {
        System.out.println("물을 450ml 넣고 끓입니다.\n" + stewType + "된장찌개를 끓이기 위해 " + stewType + "도 마지막에 함께 넣을 겁니다.");

    }

    void cutting() {
        if (material == "두부") {
            cuttingSet = "깍둑썰기";
        } else if (material == "애호박") {
            cuttingSet = "4등분으로 썰기";
        } else {
            cuttingSet = "적당히 썰기~";
        }
        System.out.println(material + "를 " + cuttingSet + "합니다.");
        System.out.println("모든 재료를 넣고 20분간 중불에 끓입니다.");
    }

    void cook() {
        boilWater();
        cutting();
        isCooking = true;
        System.out.println("보글보글 맛있겠다. 밥은 배고프니까 햇반돌려~~");
    }
}
