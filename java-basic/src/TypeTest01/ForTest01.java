package TypeTest01;

import java.util.Scanner;

public class ForTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("정수입력 : ");
        n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) { //여기에서 바로 입력하거나
            System.out.print(i + " ");
//            i = i + 1; //위에는 그대로 i++로 두고 여기서 작성하거니
        }
        System.out.println();

        int num = 0;
        for (int j = 0; j <= n; j += 2) {
            num += j;
        }
        System.out.println(num);

    }
}
