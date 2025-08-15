package TypeTest01;

import java.util.Calendar;

public class StringTest3 {
    public static void main(String[] args) throws Exception {
        Calendar c = null;

//        for (int i = 0; i < 10; i++) {
//            c = Calendar.getInstance(); //년도, 몇 시, 몇 분 등이 모두 들어 있다.
//            int year;
//            int month;
//            int day;
//            int time;
////            String checkAm = "";
//            int hour;
//            int min;
//            int second;
//            //2025년 8월 14일 10시 19분 23초
//            year = c.get(Calendar.YEAR);
//            month = c.get(Calendar.MONTH) + 1;
//            day = c.get(Calendar.DAY_OF_MONTH);
////            time = c.get(Calendar.AM_PM);//0:오전, 1: 오후
//            hour = c.get(Calendar.HOUR);
//            min = c.get(Calendar.MINUTE);
//            second = c.get(Calendar.SECOND);
//
////            if (time == 0) {
////                checkAm = "오전";
////            } else if (time == 1) {
////                checkAm = "오후";
////            }
////            int amCheck = c.get(Calendar.AM);
////            System.out.println("getTimeZone() 뭐임: "+c.getTimeZone());
////            System.out.println("getTime() 췤: "+c.getTime()); //출력형식: Thu Aug 14 10:32:24 KST 2025
//
//
//            System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초 %n", year, month, day, hour, min, second);
//
//
//            Thread.sleep(1000); //throws Exception 처리
//        }

        String filename = "이력서_홍길동.250814.docx";
        //확장자는 docx입니다.
        //확장자는 hwp입니다.
        //확장자가 없습니다.에 대한 조건식 구현하기

        //선생님 풀이
        int pos = 0;
        String ext = null;

        pos = filename.lastIndexOf('.');
        if (pos == -1) {
            System.out.println("확장자가 없습니다.");
        } else {
            ext = filename.substring(pos + 1);
            System.out.println("확장자는 " + ext + "입니다.");
        }


        //한번에 처리하기
        //1. 첫번째 . 자리 자르기 or 숫자 자리 뒤로 자르기(자리수가 항상 일정한가?)
        //    -> 귀찮아서 패스
        if (filename.lastIndexOf(".") != -1) {
            System.out.println("확장자가 있습니다.");
            if (filename.endsWith(".docx")) {
                System.out.println("확장자가 docx 입니다.");
            } else if (filename.endsWith(".hwp")) {
                System.out.println("확장자가 hwp 입니다.");
            }
        } else System.out.println("확장자가 없습니다.");

        String phone = "010-1111-2222";
        //-기준으로 나누어 배열에 각각 저장 [010] [1111] [2222]
        String phone1 = phone.substring(1,3);
        String phone2 = phone.substring(5,8);
        String phone3 = phone.substring(9,12);
        String[] phoneNum = {phone.substring(1, 3), phone.substring(5, 8), phone.substring(9, 12)};
        //전화번호의 -를 전부 .로 바꾸기
        if(phone.contains("-")) {
            System.out.printf("%s . %s . %s",phone1,phone2, phone3);
        }
        //또는 -만 .로 변경






    }
}
