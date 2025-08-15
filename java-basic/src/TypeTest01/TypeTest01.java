package TypeTest01;

public class TypeTest01 {
    public static void main(String[] args) {
        //자료형 테스트
        char ch = '\u0041';
        String s = "asdf\nz\"xz\"\tcv"; //힙메모리에 저장되어 있는 형태(모든 클래스도 마찬가지)
        //\n : 개행문자(줄바꿈)이 일어남, \t : 탭 문자로 띄워쓰기 들어감 \" : 큰따옴표 들어감
        String s2 = "c:\\backup\\test";
        //주소값을 그대로 출력하기 위해 \를 입력하고 싶으면 \\로 입력해야 출력한다.
        byte b = 127;
        b++;
        int i = 0xff;
        long lo = 10000000000L; //4바이트 안에 작성하려고 해서 8바이트로 수정하기 위해 뒤에 L을 붙여야 한다.


        //오버로딩(Overloading) : 같은 이름의 메서드를 매개변수(타입·개수)만 다르게 정의

        System.out.println(ch);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(b);
        System.out.println(i);
        System.out.println(lo);
    }
}
