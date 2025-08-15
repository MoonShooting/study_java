package day7.array;

public class ArrayPractice {
    public static void main(String[] args) {
        //day4.ifexample.IfPractice01에서는 Scanner를 사용하여 작업했는데, 이번에는 배열로 작성해서 해보기
        /* 합격입니다/불합격입니다. (80점 기준)
        90점 이상 A
        80점 이상 B
        70점 이상 C
        60점 이상 D
        60점 미만 F */
        int[] scores = {55, 60, 71, 84, 62};
        char[] grades = new char[5];
        //scores 배열을 순서대로 함수에 담아보냄
        for (int i = 0; i < scores.length; i++) {
            grades[i] = (whatGrade(scores[i])); //함수에서의 결과값이 grades에 각각 담긴다.
        }
        //향상된 for문으로 위에서 담은 결과값을 출력한다.
        for(char g : grades) {
            System.out.print(g+ " ");
        }
        System.out.println();
        System.out.println("-------------");
        System.out.println(scores); //주소값을 출력함
        //배열 자체의 이름만 불러도 출력이 됩니다.(ln을 썼지만 배열이라 옆으로 출력됩니다.)
        System.out.println(grades);

    }

    /**
     * 점수를 받아 등급을 출력해주는 메서드 whatGrade()
     *
     * @param scores int[]값
     * @return 문자형 grade 결과값
     */
    public static char whatGrade(int scores) {
        if (scores >= 90) {
            return 'A';
        } else if (scores > 80) {
            return 'B';
        } else if (scores > 70) {
            return 'C';
        } else if (scores > 60) {
            return 'D';
        } else {
            return 'F';
        }

    }

}
