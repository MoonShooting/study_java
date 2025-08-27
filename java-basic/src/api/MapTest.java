package api;

import api.Model.Student;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("aaa","laskejrflawkejf");
        map.put("bbb","lsafdaejiljdfsl");
        map.put("ccc","oerarejsfhzlzvmsofqpjddzx");

        System.out.println(map.get("bbb"));
        System.out.println(map.remove("bbb")); //remove는 없애면서 한번 읽음. => 없앨 값 한번 보여줌
        System.out.println(map); // {키=값,키=값}의 형태로 출력해줍니다.
        map.put("aaa","새 내용~");
        System.out.println(map);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("집가고 싶은 마음",200);
        map2.put("배고픔","매우");
        map2.put("student",new Student("김철수",100,80,60));
        map2.put("sb",new StringBuffer("abcdefg"));
        System.out.println(map2);


    }
}
