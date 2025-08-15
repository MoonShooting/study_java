package TypeTest01;

public class OpTest01 {
    public static void main(String[] args) {
        int a, b, c, d, f;
        a = 1;
        b = 2;
        f = 1;
        c = ++a + b; //++를 먼저 하고 +함 =>4
        d = f++ + b; // 우선 ++가 없다고 생각하고 계산 후에 ++가 붙는다(마지막 계산에서 적용된다.)
        System.out.println(a + "," + b + "," + c); //(++2) + 2 = 4
        System.out.println(f + "," + b + "," + d); //(1++는 계산 마지막에) +2 =3 <- 3을 먼저 출력 후 1이 증가함

        boolean res = a > 0 & b > 5; // & && 둘다 값은 같이 boolean으로 반환함
        System.out.println(res); //둘 다 true여야 ture가 반환함

        //이렇게 분리해서 쓰는게 가독성도 좋고, 의미에 맞게 코드가 돌아간다.
        boolean result = a < 0 && b < 0; //&&면 뒤에 굳이 더 알아보지 않음. &는 모두 계산 후 확인함
        a++;
        b++;
        System.out.println(a + "," + b + "," + result); //앞이 false라서 뒤에 증가하지 않음

        c = 10 / 3;
        System.out.println(c);

        double dosulte = 10 % 3;
        System.out.println(dosulte);

        double dd = (double) 10 / 3; //형변환이 우선순위가 가장 높다.
        System.out.println(dd);

        c = a + b + 1 + 2; //a,b값 확인 후 덧셈
        c = b = a = 1;//a=1인 것 이후 b에 대입, c에 대입 순서

        a = 3; // 0000 0011를
        c = a << 2; //2칸 밀어내기
        System.out.println("비트 <<연산 결과: "+c); //00001100 => 10진수로 변환하면 8 4 2 1에서 8+4 = 12가 출력
        a = 9; //0000 1001
        b = 3; //0000 0011
        c = a & b; //둘 다 끝자리가 1이면 1, 나머지는 0
        System.out.println("비트 &연산 결과: "+c); //0001이 출력

    }
}
