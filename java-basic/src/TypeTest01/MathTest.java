package TypeTest01;

public class MathTest {
    public static void main(String[] args) {
        double res = 1.;
        int a = 2;
        int b = 10;

        //2의 10승 : 1024
//        for (int i = 0; i < b; i++) {
//            res = res * a;
//        }
//        System.out.printf("%d의 %d승: %f",a,b,res);

        res = (int)Math.pow(a,b);
        System.out.printf("%d의 %d승: %f %n",a,b,res);

//        Math m = new Math();

        System.out.println("Math 활용법 = = = ");
        //루트2 구하기(제곱근 구하기)
        System.out.println(Math.sqrt(2));
        //로그
        System.out.println(Math.log(2));
        //절대값
        System.out.println(Math.abs(-3));
        //소수점 반올림(음수 양수 모두 가능)
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.5)); //-2로 내려버림ㅇㅇ
        //소수점 내림(버림)
        System.out.println(Math.floor(2.5));
        //소수점 올림
        System.out.println(Math.ceil(2.5));
        //랜덤 수 출력
        System.out.println((int) (Math.random() *10) +1);
    }
}
