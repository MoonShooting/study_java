package day2;

public class Practice {
    public static void main(String[] args) {
        /*
        1. '희'라는 한글 글자의 유니코드 값을 찾아서 적절한 변수에 저장 후 변수를 출력하여 확인하기
        2. 본인 이름을 적절한 자료형으로 변수에 담아 출력해보세요.
        3. 출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화하세요.
        4. 바이트타입의 변수 두 개에 10과 20을 저장하고 바이트 타입의 새 변수에 저장하고 출력해보세요.
        5. 태블릿소지여부를 변수에 저장하고 출력해보세요.
        */


        //1
        char uniVal = '\uD76C';
        System.out.println(uniVal);
        int uniVal2 = '희';
        System.out.println((int)uniVal2);
//        int uniValFin = (int)uniVal2;
//        System.out.println(uniValFin);

        //2
        String name = "김지우";
        System.out.println(name);

        //3
        int year = 1997;
        System.out.println("출생년도는 "+year+"년 입니다.");

        //4
        byte b1 = 10;
        byte b2 = 20; //-128 ~ 127
        byte test1 = (byte) (b1 + b2); // int 타입의 결과를 반환하는 연산 => 형변환 필요
        System.out.println(test1);

        //5
        boolean isTab = true;
        System.out.println(isTab);


    }
}
