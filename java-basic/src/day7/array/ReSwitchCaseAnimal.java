package day7.array;

import java.util.Scanner;

public class ReSwitchCaseAnimal {
    public static void main(String[] args) {
        // (year-1984)%12 == 0 쥐띠
        // 1. 소
        // 2. 호랑이
        // 3. 토끼
        // 4. 용
        // 5. 뱀
        // 6. 말
        // 7. 양
        // 8. 원숭이 
        // 9. 닭
        // 10. 개
        // 11. 돼지

        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하면 띠를 알려드릴게요: ");
        int year = sc.nextInt();
        int value = (year - 1984) % 12;

        //그냥 switch-case문으로 작성한 경우
//        switch (value) {
//            case 0:
//                System.out.println("쥐띠시네요~");
//                break;
//            case 1:
//                System.out.println("소띠시네요~");
//                break;
//            case 2:
//                System.out.println("호랑이띠시네요~");
//                break;
//            case 3:
//                System.out.println("토끼띠시네요~");
//                break;
//            case 4:
//                System.out.println("용띠시네요~");
//                break;
//            case 5:
//                System.out.println("뱀띠시네요~");
//                break;
//            case 6:
//                System.out.println("말띠시네요~");
//                break;
//            case 7:
//                System.out.println("양띠시네요~");
//                break;
//            case 8:
//                System.out.println("원숭이띠시네요~");
//                break;
//            case 9:
//                System.out.println("닭띠시네요~");
//                break;
//            case 10:
//                System.out.println("개띠시네요~");
//                break;
//            case 11:
//                System.out.println("돼지띠시네요~");
//                break;
//        }

        //배열로 작성한 경우

        String[] animal = {"쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};
        System.out.println(animal[value]);

    }
}
