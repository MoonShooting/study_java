package day6;

public class LoopPractice {
    public static void main(String[] args) {
        /*
        1 2 3 4 5 6 7 8 9 10
        0 2 4 6 8 10
        1 3 5 7 9
        10 9 8 7 6 5 4 3 2 1
        10 20 30 40 50
        2 4 8 16 32
        1 10 100 1000 10000
        */

        //1 2 3 4 5 6 7 8 9 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }

        System.out.println();
        // System.out.println("------");
        // 0 2 4 6 8 10
        int j = 0;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 2;
        }

        System.out.println();
        //System.out.println("---2---");
        //1 3 5 7 9
        int k = 1;
        while (k < 10) {
            System.out.print(k + " ");
            k += 2;
        }

        // 10 9 8 7 6 5 4 3 2 1
        System.out.println();
        //System.out.println("---3---");
        int l = 10;
        while (l >= 1) {
            System.out.print(l + " ");
            l -= 1;
        }

        // 10 20 30 40 50
        System.out.println();
        int n = 10;
        while (n <= 50) {
            System.out.print(n + " ");
            n += 10;
        }

        // 2 4 8 16 32
        System.out.println();
        int m = 1;
        while (m <= 32) {
            System.out.print(m + " ");
            m *= 2;
        }

        // 1 10 100 1000 10000
        System.out.println();
        int o = 1;
        do {
            System.out.print(o + " ");
            o *= 10;
        } while (o <= 10000);


    }
}
