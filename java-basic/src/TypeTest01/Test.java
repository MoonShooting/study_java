package TypeTest01;


import javax.swing.JFrame;

public class Test extends JFrame {
    //JFrame을 재산(여러 변수) 상속받았다. -> 부모에게 상속받았다.
    // 현재 Test는 하위(자식) 클래스가 되었다.
    int num;
    String name;
    static int num2; //밖에 빼두고 모두가 해당 값을 공유해서 쓴다.(static을 붙이면 객체 없이도 실행 가능하다.)
    public final int num3 = 1; //final은 변수, 메서드, 클래스에 붙일 수 있다.

    //캡슐화를 위해 접근제어자 또는 public 메서드를 사용한다.
    public void output() {
        System.out.println(
                "num "+num+", name: "+ name
        );
    }
}
