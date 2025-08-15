package TypeTest01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //상속 받은걸 재사용하면 편리하다.
        Test t = new Test();
        t.num = 1;
        t.name = "김";
        t.output();
        t.setTitle("창 제목");
        //새 창의 사이즈 설정
        t.setBounds(100,100,300,300);
        //화면을 띄워서 보여줌
        t.setVisible(true);

//        JFrame a = new JFrame();//애초에 바로 Test를 부르면 된다.
//        JFrame b = new String(); //무슨 상관이여? 부모를 자식에 넣을 수 없다.
//        Object c = new String(); //이건 가능함(더 하위 타입에 넣을 수는 있다.)

        //상위 타입 하나 부르면 하위 2개 따로따로 받을 필요가 없다.
        //어떤걸 부르는게 더 좋으냐는 구조에 따라 달라지기 때문에 효율성을 먼저 고려해야한다.
        //여러번 강조하지만 그래서 요구사항 명세가 중요하다.



    }
}
