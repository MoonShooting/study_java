package TypeTest01;

import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            sub(); //여기서 책임을 져야 한다.
        } catch (IOException e) {
            System.out.println("에러 발생");
            e.printStackTrace();
        }
    }

    //던진다~호출한 상위로 책임 미뤄~
    public static void sub() throws IOException {
        int i = System.in.read();
        System.out.println((char) i);
    }
}
