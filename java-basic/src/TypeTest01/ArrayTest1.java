package TypeTest01;

public class ArrayTest1 {
    public static void main(String[] args) {
        int ar[] = new int[5];
        int ar2[];
        ar2 = new int[5];
        int ar3[] = {10, 20, 30, 40, 50};

        System.out.println(ar3);
        System.out.println(ar3.length);
        System.out.println(ar3[0]);
        ar3[0]++;
        System.out.println(ar3[0]);
        //System.out.println(ar3[55]);
        //error:
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 55 out of bounds for length 5
        //	at TypeTest01.ArrayTest1.main(ArrayTest1.java:15)

        for (int i = 0; i < ar3.length; i++) {
            System.out.print(ar3[i]+" ");
        }

    }
}
