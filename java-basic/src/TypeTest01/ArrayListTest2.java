package TypeTest01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //int형 저장할 수 있는 리스트 생성
        ArrayList<Integer> list = new ArrayList<>();
        //반복적으로 정수 입력받아 리스트에 저장
        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        try {
//            //개수가 정해지지 않아서 while로 고치는게 더 출제의도에 맞다~
//            for (int i = 0; i < 5; i++) {
//                int n = sc.nextInt();
//                list.add(i, n);
//                sum += n;
//                //sum += list.add(i, sc.nextInt()); //이건 틀렸당
//
//            }
//            //출력값 확인
//            System.out.println(list);
//            double avg = (double) sum / 5;
//            //전체 입력받은 숫자들의 평균보다 큰 값들만 출력
//            System.out.println("평균보다 큰 값: ");
//            for (Integer num : list) {
//                if (avg < num) System.out.print(num + " ");
//            }
//        } catch (InputMismatchException e) { //숫자가 아닌 값을 입력하면 반복 종료
//            System.out.println("정수를 입력해야 합니다.");
//        }

        //선생님 풀이
        int n;
        int total = 0;
        double average;
        //list에서는 딱히 기준으로 잡을게 없어보여서 걍 에러 포인트 생기면 바로 catch가고 중단 지정
        try {
            while (true) {
                System.out.println("정수 입력: ");
                n = sc.nextInt();
                list.add(n);
            }
        } catch (Exception e) { //나갈 길이 있어서 무한반복도 가능
            System.out.println("반복을 종료합니다.");
        }
        //전체 입력받은 숫자들의 평균을 구한다.
        for (int j : list) {
            total += j;
        }
        System.out.println("합계 " + total);
        average = (double) total / list.size();
        System.out.println("평균 " + average);
        for (int i : list) {
            if (average < i) System.out.print(i + " ");
        }
        //오름차순으로 정렬하여 전체 출력
        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int val = list.get(j);       // j번째 값 저장
                    list.set(j, list.get(i));    // j번째 위치에 i번째 값 넣기
                    list.set(i, val);            // i번째 위치에 저장해둔 값 넣기

                    //이렇게 쓰면 안돼ㅐㅐ
//                    int val = list.get(j);
//                    list.set(list.get(j), list.get(i));
//                    list.set(list.get(i), val);
//                    list.get(j) = list.get(i);
//                    list.get(i) = val;
                }
            }
        }
        System.out.println(list);

    }
}
