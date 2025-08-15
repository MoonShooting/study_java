package day2;

public class TypeConversion {
    public static void main(String[] args) {
        //묵시적 형변환: 형변환이 자동으로 일어나는 경우
        // 바이트 크기(차지하는 메모리)가 작은 자료형에서 크기가 큰 자료형으로 자동(묵시적)으로 이루어짐.
        //정밀하지 않은 자료형에서 더 정밀한 자료형으로 자동으로 이루어짐.

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(bNum);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);

        //명시적 형변환 : 형변환을 수동으로 해주어야 하는 경우
        // 묵시적 형 변환과 반대의 경우
        // 형 변환시 데이터의 손실이 발생할 수 있다.
        int num1 = 1000;
        byte num2 = (byte) num1; //명시적 형변환을 시키면 가능
        System.out.println(num2); //크기가 큰 자료형-> 작은 자료형으로 대입하여 데이터 손실이 발생함(오버플로우).
        
        //형변환 하고 계산 결과 vs 계산 후 형변환한 결과
        System.out.println("계산결과 차이 확인:");

        double dNumPI = 3.94;
        int iNum1 = (int)dNumPI; //3.14가 되던, 3.94가 되던 값은 3으로
        System.out.println(iNum1); //소숫점 아래 무조건 버림

        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int inum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
        int inum4 = (int)(dNum1+fNum2); // 두 실쉬의 합이 먼저 계산되고 형 변환됨
        System.out.println(inum3);
        System.out.println(inum4);
    }
}
