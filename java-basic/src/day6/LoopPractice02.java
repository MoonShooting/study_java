package day6;

import java.util.Scanner;

public class LoopPractice02 {
    public static void main(String[] args) {
        //정수 두 개를 입력받아 시작값과 끝값으로서 "start~end의 합계는 sum 이다"를 출력하세요.
        /*
        끝 값이 시작 값보다 작게 입력하면.......
        작은 수부터 큰 수까지의 합계는~으로 출력되게 하세요!
        */
        //문제 의도 : 앞의 값과 뒤의 값이 순서대로 들어온다는 보장이 있는가? 앞의 값이 무조건 전보다 작을 수는 x
        //따라서 위치에 상관 없이 해당 순서를 바꾸어 누산 할 수 있도록 하는 방법
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 2개 입력하세요.(하나 입력 시마다 엔터를 꼭 눌러주세요.)");
        int startNum = input.nextInt();
        int endNum = input.nextInt();
        int sum = 0;
        if (startNum < endNum) {
            int i = startNum;
            while (i < endNum) {
                sum += i;
                i++;
            }
            System.out.printf("%d~%d의 합계는 %d 이다.", startNum, endNum, sum);
        } else if (startNum == endNum) {
            System.out.printf("동일한 값이라 누산할 수 없습니다. 선택한 값은 %d 입니다.", startNum, endNum, startNum);
        } else {
            int i = endNum;
            while (i < startNum) {
                sum += i;
                i++;
            }
            System.out.printf("%d~%d의 합계는 %d 이다.", startNum, endNum, sum);
        }


        /*
        정수 두 개를 입력받아 입력받은 두 수 사이의 값의 누산을 구하세요.
        */
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 2개 입력하세요.(하나 입력 시마다 엔터를 꼭 눌러주세요.)");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum2 = 0;
        int j;
        if (num1 > num2) {
            j = num1;
            num1 = num2;
            num2 = j;
        }
        for (int i = num1; i < num2; i++) {
            sum2 += i;
        }
        System.out.printf("start~end의 합계는 %d 이다.", sum2);


        //더 간단한 방법(Math.min, Math.max사용, 최소값 최대값을 통해 작은쪽, 큰쪽 구분할 수 있다.)
//        int start = Math.min(num1, num2);
//        int total = 0;
//
//        for (int i = start; i <= Math.max(num1, num2); i++) {
//            total += i;
//        }
//        System.out.println("start~end의 합계는 " + total);
    }
}
