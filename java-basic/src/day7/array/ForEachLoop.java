package day7.array;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] subject = {"java","DB", "FrontEnd"};
        //배열을 위한 향상된 loop
        /*
        for(자료형 각 요소를 가리킬 변수명 : 배열이름) {
            수행문; //중간에 멈출 수가 없다ㅏㅏㅏㅏ
        }
        */
       for (String s : subject) {//전체 출력 등을 할 경우 향상된 for문으로 간단하게 처리함
           System.out.println(s);
       }

        for (int i = 0; i < subject.length; i++) {
            if (i == 1) { //중간에 index로 무언가 처리하고 싶으면 if문
                System.out.println(subject[i]);
            }
        }





    }
}
