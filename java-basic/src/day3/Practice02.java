package day3;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.
        [출력 예제]
        초 단위를 입력하세요 : 3606
        1시간 0분 6초
        */
        Scanner input = new Scanner(System.in);
        System.out.print("초 단위를 입력하세요 : ");
        int timeStamp = input.nextInt();
        int h = timeStamp/3600; //시 나오기
        System.out.println(h);
        timeStamp = timeStamp%3600; //재할당
        int m = timeStamp/60; //분
        System.out.println(m);
        int s = timeStamp%60; //초
        System.out.println(s);
        System.out.printf("%d시%d분%d초",h,m,s);




    }
}
