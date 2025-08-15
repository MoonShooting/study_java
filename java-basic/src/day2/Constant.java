package day2;

public class Constant {
    public static void main(String[] args) {
        // 상수 : 변하지 않는 값을 저장
        final int MAX_NUM = 100;
        final int MIN_NUM;

        System.out.println(MAX_NUM);
        MIN_NUM = 0; // 해당 값을 초기화하지 않고 바로 print하면 값이 없기 때문에 컴퓨터는 ???로 에러남
        System.out.println(MIN_NUM);

       // MIN_NUM = -99; //최초 한번의 대입만 가능함(final로 인해) 변경 불가


    }
}
