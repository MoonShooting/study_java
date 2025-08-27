package TypeTest01;

import java.util.Arrays;

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
                newVal = (int) (Math.random() * 100 + 1); //44.999...라서 +1을 통해 45의 정수값까지 받기 위함
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

        //선생님 풀이
//        int n;
//        int number[] = new int[6];
//        out: //for문에 이름을 붙일 수 있다.
//        for (int i = 0; i < 6; i++) {
//            n = (int) (Math.random() * 45 + 1); //0.~에서 상수나오도록
//            for (int j = 0; j < i; j++) { //같은 번호 있는지 확인
//                if (number[j] == n) { //기본적으로 break 시 가장 가까운 for문 종료함.
//                    i--;
//                    continue out; //이름이 붙은 for문인 int i있는 for문으로 올라간다.
//                    //break;
//                }
//            }
//            //같은 번호가 없으면 배열에 저장하고 출력
//            number[i] =n;
//            System.out.print(n + " ");
//        }
//        System.out.println();

        System.out.println();
        //card 100장 중 1~100까지 순서대로 정렬하기
        //효율적이진 않지만 정석?적인 방법: 교환 정렬
        //1. 1~100 배열 랜덤 담은 값 사용
        //2. 1루프 1+1값 비교
        //3. 높으면 위치 변경 / 안높으면
        //4. 위치 변경 후 다음 반복 1루프 1+2값 비교
        //다 돌리면 2루프 2+1값 비교

//        int biggerVal = 0;
//        for (int i = 0; i <= arrRandom.length - 1; i++) { //-1
//            for (int j = i + 1; j < arrRandom.length; j++) {
//                if (arrRandom[i] > arrRandom[j]) {
//                    //Math.min()써서 대입 가능
//                    newVal = arrRandom[i];
//                    arrRandom[i] = arrRandom[j];
//                    arrRandom[j] = newVal;
//                }
//            }
//        }
//        for (int j : arrRandom) {
//            System.out.print(j + " ");
//        }

        //선생님 풀이
//        boolean check; //한번에 정렬된 경우 굳이 다 안돌려도 되니까 체크용
//        for (int i = arrRandom.length - 1; i > 0; i--) {
//            check = true;
//            for (int j = 0; j < i; j++) {
//                if (arrRandom[j] > arrRandom[j+1]) {
//                    newVal = arrRandom[j];
//                    arrRandom[j] = arrRandom[j+1];
//                    arrRandom[j+1] = newVal;
//                    check = false;
//                }
//            }
//            if (check) break;
//        }
//        for (int i : arrRandom) {
//            System.out.print(i + " ");
//        }

        //실제 정렬 방법
        Arrays.sort(arrRandom);
        for (int i : arrRandom) {
            System.out.print(i + " ");
        }
    }
}
