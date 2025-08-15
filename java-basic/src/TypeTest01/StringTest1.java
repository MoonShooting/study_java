package TypeTest01;

public class StringTest1 {
    public static void main(String[] args) {
        //문자열 다루는 함수 목록 여기서 조회~~
        String a;
        String b = null;
        //String pool에 같은 값이라면 하나만 만들어져 있다.
        //같은 장소를 가리키고 있다.
        //얕은 복사
        String c = "";
        String d = "abc";
        String e = "abc";
        String f = new String("abc");
        String g = new String("abc");

//        System.out.println(a); //없어서 안나옴
        System.out.println(b); //null
//        System.out.println(b.length()); //null에 길이값을 반환하려고 하기 때문에 에러
        System.out.println(c); //""는 0으로 출력
        System.out.println(c.length());
        System.out.println(d == e);
        System.out.println(f == g); //객체의 주소 비교
        System.out.println(f.equals(g));
        System.out.println(g.equalsIgnoreCase("ABc")); //대소문자 무시하고 비교
        System.out.println(g.startsWith("a")); //앞부분만 비교(한글자 아니여도 됨. ab처럼도 가능
        System.out.println(g.endsWith("c")); //뒷부분만 비교
        System.out.println("= = = 구분선 = = = ");
        //문자형
        g = "Java Programming";
        System.out.println(g.charAt(1)); //0번이 맨 앞이니까 1번쨰 글자 하나를 문자 타입으로 변환하여 리턴.
        System.out.println(g.indexOf('a')); //a가 몇번째에 있는가?
        System.out.println(g.indexOf('x')); //없을 때 위치를 조회

        System.out.println(g.lastIndexOf('a')); //띄어쓰기 빼고 a가 속한 것중 가장 마지막이 10번째 위치
        System.out.println(g.substring(5)); //자리수 5번째부터 출력
        System.out.println(g.substring(5,9)); //자리수 5~9까지 Prog
        System.out.println(g.concat("!!!!!")); //끝에 문자 붙이기
        System.out.println(g.toUpperCase()); //대문자로 바뀜
        System.out.println(g.toLowerCase()); //소문자로 바뀜
        System.out.println(g);

        //자동으로 메모리 정리 및 가비지 컬렉터에서 작업한다.
        String s = g.substring(5);
        g = g.substring(5);
        g = g + "???"; //concat을 이렇게 쓸 수도 있다.(대입을 도로하긴 해야 함.)

    }
}
