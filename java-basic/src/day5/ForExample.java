package day5;

public class ForExample {
    public static void main(String[] args) {
        //3. for문
        /*
        for(초기화식; 조건식; 증감식) {
            수행문;
        }
        //필요한 변수값을 처음에 초기화하여 선언합니다.
        //반복을 하기 위한 조건
        //증감식 (++, --)처럼 점점 증가하는지, 점점 줄어드는지 등을 부여
        */
//        int sum = 0; //선언 및 초기화를 해주어야 합니다. int니까 정수값을 초기화해주면 됩니다.
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//            System.out.println(i+"회차 반복");
//            System.out.println("-------------------");
//        }
//        System.out.println("1~10까지의 합은" + sum + "입니다.");

        // for문 괄호 안의 세 요소는 모두 생략 가능하다.
        /*
        - 초기화 식: 반복 전에 이미 초기화된 변수를 사용하는 경우 생략할 수 있다.
        - 조건식 : 반복을 중간에 멈추고자 할 때, 조건을 블록 내의 제어문을 추가하여 처리하면 조건식을 생략할 수 있다.
        - 증감식 : 증감식이 복잡하거나 다른 변수의 상태에 따라 다랄질 경우, 증감 처리를 블록 안에서 직접 수행할 수 있다.
        */
        int j = 0;
        int sum2 = 0; //선언 및 초기화를 해주어야 합니다. int니까 정수값을 초기화해주면 됩니다.
        for (; ; ) {
            sum2 += j;
            System.out.println(j+"회차 반복");
            System.out.println(sum2);
            j++;
            System.out.println("-------------------");
            System.out.println(j); //마지막에 10이 나왔는제 확인해보기
            if (j >= 11) { //멈추고 싶을 때 조건을 잘 넣기
                //break로 반복문 자체를 빠져나가게 함
                break;
            }
        }
        System.out.println("1부터 "+(j-1)+"까지의 합은 " + sum2 + "입니다.");
    }
}
