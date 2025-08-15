package day3;

public class StrFormatting {
    public static void main(String[] args) {
        //문자열 포맷팅
        //System.out.printf(); 를 사용함.
        /*  %d 정수
            %f 실수
            %s 문자열
            %n 줄바꿈
            %x / %X 16진수
         */
        double d = 123.45678;
        int n = 1234;
        String name = "홍길동";
        System.out.printf("이름은 %s입니다. %n",name);
        System.out.printf("이름은 %5s입니다. %n",name);
        System.out.printf("이름은 %-5s입니다. %n",name);

        //정수
        System.out.printf("기본 출력 %d: %n",n);
        System.out.printf("오른쪽 정렬 출력 %10d:%n",n);
        System.out.printf("왼쪽 정렬 출력 %-10d:%n",n);
        //System.out.printf("왼쪽 정렬 출력 %-010d:%n",n);//n으로 채워라를 왼쪽에서는 못쓴다.
        System.out.printf("빈 칸 0채워 출력 %010d:%n",n);

        //실수
        System.out.printf("실수값 포맷팅 %f %n", d);
        System.out.printf("실수값 포맷팅 %.2f %n", d);
        System.out.printf("실수값 포맷팅 %10.2f %n", d); //소숫점 포함해서 총 10자리수 출력
        System.out.printf("실수값 포맷팅 %010.2f %n", d); //빈 자리 0으로 채워서 10자리수 출력

        int age = 20;
        String myName = "박뚜벅";
        System.out.printf("이름 : %s, 나이 : %d",myName, age);

    }
}
