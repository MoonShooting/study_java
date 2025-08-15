package TypeTest01;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        System.out.print("주민등록번호 입력 (990101-11111111 형식): ");
        id = sc.nextLine();

        //주민등록번호를 통해 잘못되었는지 체크하기
        //14글자가 아니면 에러 출력 & 프로그램 출력
        //제대로 입력했다면 xx년생이라고 출력
        //14 자리가 아니면 에러 발생(=길이를 통해 자리수 확인)
        if (id.length() != 14) {
            System.out.println("14자로 입력하세요.");
        }
        //-의 위치를 확인하기
        // 값에 -가 있는가로도 풀 수 있다.
        if (id.charAt(6) != '-') {
            System.out.println("형식이 잘못되었습니다.");
        }
        //indexOf로 사용할 경우에는 없을 때 -1을 반환한다는 점~
        if(id.indexOf("-") != -1) {
            System.out.println("형식이 잘못되었습니다.");
        }
        //아니면 간단하게 이걸로 쓰거나
        //특정 문자열이 포함여부 체크용
        if(id.contains("-")) {
            System.out.println("형식이 잘못되었습니다.");
        }

        //성별 오류 (뒷자리 1,2,3,4 중 하나)
        //- 빼고 나머지는 다 숫자여야 함
        //한번 밖에 선언하고 쓰자 귀찮게 여러번 쓰지 말고!(수정함)
        char ch = id.charAt(7); //아래에서 또 사용함
        if (ch == '1' || ch == '2' || ch == '3' || ch == '4') {
            System.out.println("성별이 정확합니다잉");
        } else {
            System.out.println("에헤이 다시!");
            return;
        }

        int scYear = id.charAt(1);//입력받은 년도 1자리(9,0)체크

        int year = Integer.parseInt(id.substring(1, 3));//입력받은 년 2자리->정수 저장
        int scMonth = Integer.parseInt(id.substring(3, 5));//입력받은 월 2자리->정수 저장
        int scDay = Integer.parseInt(id.substring(4, 6));//입력받은 일 2자리-> 정수 저장

        int numbers1 = Integer.parseInt(id.substring(0, 6));//- 기준 앞자리
        int numbers2 = Integer.parseInt(id.substring(7, 14));//- 기준 뒷자리
        //String->int(정수)로 변환하는 방법(중요!)
//        String s = "01";
//        int n = Integer.parseInt(s);
//        if (n > 0) {
//            //숫자로 비교 가능해져서 해당 조건문 에러 발생하지 않음
//        }

//        char ch = '0';
        //숫자인지를 물을 때
//        if (ch >= '0' && ch <= '9') {
//        }
        //또는 각 char를 모아서 String으로 형변환이 잘 된다면 ㄱㅊ, 아니라면 문제 있는거니까 그런 방법도 있다~
        //나이
        if (ch == '1' || ch == '2') {
            year += 1900;
        } else if (ch == '3' || ch == '4') {
            year += 2000;
        } else System.out.println("잘못 입력 하셨습니다.");


        //날짜 시간 정보 확인
//        Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);
//        System.out.println(month); //7
        //캘린더 사용예제(선생님풀이 참조)
        Calendar cal = Calendar.getInstance();
        int age   = cal.get(Calendar.YEAR) - year;

        //년도 올해를 넘는가?
        if (!(scMonth < 2025)) {
            System.out.println("정확한 년도를 입력하세요.");
            return;
        }else System.out.println("범위 내의 년도로, 올바릅니다.");
        //월이 1~12 범위여야 함

        //3~4번째 값이랑 월을 비교하였을 때 월이 올바른가?
        if (scMonth < 1 || scMonth > 12) { //1보다 작거나 12보다 크거나
            System.out.println("월을 제대로 입력하지 않았습니다.");
            return;
        } else System.out.println("올바른 월입니다.");
        //일이 1~31 범위여야 함
        //5~6번째 값이랑 일을 비교하였을 때 일이 올바른가?
        if (scDay < 1 || scDay > 31) { //1보다 작거나 31일을 넘거나
            System.out.println("일을 제대로 입력하지 않았습니다.");
            return;
        } else System.out.println("올바른 일입니다.");

        //90년대생, 20년생 계산해보기

        //+)윤년이랑 달별로 계산하기(조건)
        //연도가 4의 배수이고
        //연도가 100의 배수가 아니거나
        //연도가 400의 배수인 경우
        if (scYear == 9) {
            int yearCheck = Integer.parseInt(id.substring(7, 9)) + 1900;
            if (yearCheck % 4 == 0 && yearCheck % 100 != 0 || yearCheck % 400 == 0) {
                System.out.println("윤년입니다.");
            } else System.out.println("ㅇㅇ윤년 아님");
        } else if (scYear == 0) {
            int yearCheck = Integer.parseInt(id.substring(7, 9)) + 2000;
            if (yearCheck % 4 == 0 && yearCheck % 100 != 0 || yearCheck % 400 == 0) {
                System.out.println("윤년입니다.");
            } else System.out.println("ㅇㅇ윤년 아님");
        }

        //제대로 입력헀으면 xx년생은 yy살이고, 성별은 aa입니다. 라고 출력
        int nowAge;
        int birth = Integer.parseInt(id.substring(0, 2));
        birth = birth + 1900;
//        System.out.println(birth + "날짜 확인");
        nowAge = 2025 - birth;

        String sex;
        if (id.charAt(8) == 1 || id.charAt(8) == 3) {
            sex = "남성";
        } else {
            sex = "여성";
        }
        System.out.println(id.substring(0, 2) + "년생은 " + nowAge + "살이고, 성별은 " + sex + "입니다.");

    }
}
