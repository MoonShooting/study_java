package TypeTest01;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest1 {
    public static void main(String[] args) {
        double[] ar = {1.5, 3, 10.2, 33.1, 2.345};
        double n;

        //교환 정렬하기
//        for (int i = 0; i < ar.length - 1; i++) {
//            for (int j = i + 1; j < ar.length; j++) {
//                if (ar[i] > ar[j]) {
//                    n = ar[i];
//                    ar[i] = ar[j];
//                    ar[j] = n;
//                }
//            }
//        }
//        for (double j : ar) {
//            System.out.print(j + " ");
//        }

        //버블정렬
        for (int i = ar.length - 1; i > 0; i--) { //맨뒤에서부터 정렬
            //0~6 중 6
            for (int j = 0; j < i; j++) { //0<6
                if (ar[j] > ar[j+1]) { //33.1랑 2.345이랑 비교
                    //자리바꿀 때 1 2 중 1을 n에 넣고, 2를 1에 옮기고 2는 처음 1값
                    n = ar[j]; //33.1
                    ar[j] = ar[j + 1]; //2.345
                    ar[j + 1] = n; //33.1을 다음 위치로 옮김
                }
            }
        }

        for (double j : ar) {
            System.out.print(j + " ");
        }

    }
}
