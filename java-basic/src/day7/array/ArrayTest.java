package day7.array;

public class ArrayTest {
    public static void main(String[] args) {

        //배열: 같은 자료형을 가진 자료 여러개를 묶어서 관리
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums = {1, 2, 3}; //배열 선언 및 초기화
        int[] nums2 = new int[3]; //배열 생성과 초기화(3개의 자리를 차지하고 있는 int묶음이라고 선언한 것이 된다.

//        int[] numsErr;
//        numsErr = {1, 3, 5, 7, 9}; //해당 방식은 불가능하다.
//        numErr[0] = 1; //이것도 안됨
//        int[] numsErr2 = new int[3] {1,2,3,4}; //칸 수랑 값 지정이 안맞을 경우가 있어서 이것도 에러 발생

        int[] numsOK;
        numsOK = new int[3]; //배열은 생성될 때 무조건 칸의 수를 지정해야함
        numsOK[0] = 1;
        numsOK[1] = 2;
        numsOK[2] = 3;
        System.out.println(numsOK[0]);
        System.out.println(numsOK[1]);
        System.out.println("============");
        System.out.println("배열의 길이"+numsOK.length);

//        for (int i = 0; i < 4; i++) { //index 3은 length에서 안나와~라는 에러가 발생함
//            System.out.println(numsOK[i]);
//        }
        for (int i = 0; i < numsOK.length; i++) { //length 배열의 길이만큼이라는 의미입니다.
            System.out.println(numsOK[i]);
        }
    }
}
