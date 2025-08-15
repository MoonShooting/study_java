package day6;

public class StarPractice {
    public static void main(String[] args) {
        //별찍기~~~~와~~~~~~재밌겠다~~~~~~
        //*****
        //*****
        //*****
        //*****
        //*****

        char star = '*';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(star);
            }
            System.out.println(star);
        }
        System.out.println();
        System.out.println("-----------");

        //*****
        //*****
        //*****
        //*****
        //*****
        //행렬로 뽑아보기
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.print("(" + i + "," + j + ")");
//            }
//            System.out.println();
//        }

        //*
        //**
        //***
        //****
        //*****

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------");
        //*****
        //****
        //***
        //**
        //*

        for (int m = 5; m >= 1; m--) {
            for (int n = 1; n <= m; n++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------");

        //    *     1
        //   ***    3
        //  *****   5
        // *******  7
        //********* 9
        for (int i = 1; i <= 5; i++) {
            //공백 출력
            for (int j = 1; j <= 5 - i; j++) { //5-i부터니까 4부터 순서대로 공백을 줄이면서 찍힘
                System.out.print(" ");
            }
            //별 출력
            //2*i-1 => 2*1-1 => 1, 2*2-1 =>3 ... 홀수가 됨.
            for (int o = 1; o <= 2 * i - 1; o++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
