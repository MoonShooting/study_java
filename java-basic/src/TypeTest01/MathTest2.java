package TypeTest01;

public class MathTest2 {
    public static void main(String[] args) {
        //번호 6개 담을 배열 생성
//        int[] value = new int[6];
//
//        //1 ~ 45중에 랜덤한 숫자가 6개 나오도록 구현해봅시다.
//        for (int i = 0; i < 6; i++) {
//            //추가 조건: 값 중복 여부 확인하기
//            //원하는 max값까지 곱하기 + 1(0.~~에서 x45 + 1)
//            value[i] = (int) (Math.random() * 45 + 1);
//
//            //지금 만든 번호를 써도 되는지 i번 반복확인
//            //현재 값의 직전위치의 값이 같은 값이 있다면 다시 생성하기
//            for (int j = 0; j < 6; j++) {
//                //첫 랜덤 값은 통과
//                if (i > 0 && value[i - 1] == value[i]) {
//                    System.out.println("중복된 값입니다. 다시 뽑겠습니다.");
//                    i--;
//                    continue;
//                }
//            }
//            //같은 번호가 없으면 배열에 저장하고 출력하기
//            System.out.print(value[i] + " ");
//        }
//        System.out.println();

        //전체 중복 제거 구문 풀어보기
        int[] arrRandom = new int[6];
        int newVal;

        for (int i = 0; i < 6; i++) {
            boolean isDiffer;

            do {
                isDiffer = false;

                newVal = (int) (Math.random() * 45 + 1); //44.999...라서 +1을 통해 45의 정수값까지 받기 위함
                for (int j = 0; j < i; j++) {
                    //중복이 있는 경우
                    if (arrRandom[j] == newVal) {
                        System.out.println("값이 중복되어 다시 뽑겠습니다.");
                        isDiffer = true; //중복 true로 설정
                        break;//break시 do-while 다시 반복(가장 가까운 for문이 종료)
                    }
                }
            } while (isDiffer); //while(변수)는 해당 변수의 값이 true인 동안 반복하겠다는 뜻이므로, while(isDiffer)는 isDiffer가 true일 때 계속 반복
            arrRandom[i] = newVal;
            System.out.print(arrRandom[i] + " ");
        }

    }
}
