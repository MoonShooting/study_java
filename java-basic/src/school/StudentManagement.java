package school;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    [학생 성적 관리 시스템]
    1. 입력
    2. 수정
    3. 검색
    4. 전체 출력
    0. 종료
    선택> 9
    번호 오류. 다시 입력하세요.

    [학생 성적 관리 시스템]
    1. 입력
    2. 수정
    3. 검색
    4. 전체 출력
    0. 종료
    선택> 0
    프로그램을 종료합니다.

 */
public class StudentManagement {
    Scanner scanner = new Scanner(System.in);
    StudentService service = new StudentService();

    public static void main(String args[]) {
        StudentManagement management = new StudentManagement();
        while (true) {
            //메뉴 출력. 번호 입력받기. 오류처리
            management.menu();
            int num = management.choice();
            //선택한 메뉴 번호에 따라 분기 처리. 0입력하면 프로그램 종료
            switch (num) {
                case 1: management.input(); break;
                case 2: management.modify(); break;
                case 3: management.delete(); break;
                case 4: management.print(); break;
                case 5: management.search(); break;
                case 0: management.end(); break;
            }
        }
    }

    // 메인 메뉴 출력
    void menu() {
        System.out.println("\n[학생 성적 관리 시스템]");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("4. 전체 출력");
        System.out.println("5. 검색");
        System.out.println("0. 종료");
        System.out.print("선택> ");
    }

    // 번호 선택
    int choice() {
        int n = 0;
        while (true) {
            try {
                n = scanner.nextInt();
            }
            catch (Exception e) {
                System.out.print("입력 오류.\n선택> ");
                scanner.nextLine();
                continue;
            }
            if (n < 0 || n > 5) {
                System.out.print("선택 오류.\n선택> ");
                continue;
            }
            return n;
        }
    }

    // 입력
    void input() {
        String name;
        int k, e, m;

        System.out.println("\n[입력]");
        scanner.nextLine();
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("국어 : ");
        k = inputScore();
        System.out.print("영어 : ");
        e = inputScore();
        System.out.print("수학 : ");
        m = inputScore();

        service.add(new Student(name, k, e, m));
        System.out.println(name + " 성적이 저장되었습니다.");
    }

    // 수정
    void modify() {
        int num, k, e, m;
        String name;
        Student s;

        System.out.println("\n[수정]");
        System.out.print("수정할 번호 : ");
        num = inputNumber();
        s = service.getStudent(num);        //번호로 학생정보 찾기
        if (s == null) {
            System.out.println("해당되는 번호가 없습니다.");
            return;
        }

        System.out.println("===== " + num + "번 " + s.getName() + " 정보 =====");   //현재 상태 출력
        System.out.println("국어 : " + s.getKor());
        System.out.println("영어 : " + s.getEng());
        System.out.println("수학 : " + s.getMat());

        System.out.println("===== " + num + "번 수정할 정보 입력 =====");   //현재 상태 출력
        System.out.print("이름:");           //새로 값 입력받음
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("국어 : ");
        k = inputScore();
        System.out.print("영어 : ");
        e = inputScore();
        System.out.print("수학 : ");
        m = inputScore();

        //수정할 학생 번호와 새 값들 전달하여 수정
        boolean result = service.modify(new Student(num, name, k, e, m));
        if (result) {
            System.out.println("수정되었습니다.");
        }
        else {
            System.out.println("해당되는 번호가 없습니다. 수정 실패.");
        }
    }

    // 삭제
    void delete() {
        int num;
        System.out.println("[삭제]");
        System.out.print("삭제할 번호 : ");
        num = inputNumber();
        //번호로 학생정보 삭제
        if (service.delete(num)) {
            System.out.println("삭제되었습니다.");
        }
        else {
            System.out.println("해당되는 번호가 없습니다. 삭제 실패.");
        }
    }

    //전체 출력
    void print() {
        ArrayList<Student> list = service.getList();
        System.out.println("\n[학생 성적 출력]");
        System.out.println("번호 이름 국어 영어 수학 총점 평균");
        System.out.println("----------------------------------------------");
        for (Student s : list) {
            System.out.printf("%-3d%5s%5d%5d%5d%5d%7.1f%n",
                    s.getNum(), s.getName(), s.getKor(), s.getEng(), s.getMat(), s.getTotal(), s.getAverage());
        }
    }

    //검색
    void search() {
        String select = null;
        int num = 0;
        String name = null;

        System.out.println("\n[검색]");
        System.out.print("검색 기준 (1:번호 2:이름) : ");
        scanner.nextLine();
        select = scanner.nextLine();

        switch (select) {
            case "1":
                System.out.print("검색할 번호 : ");
                num = scanner.nextInt();
                Student st = service.getStudent(num);
                if (st == null) {
                    System.out.println("해당되는 번호가 없습니다.");
                } else {
                    System.out.println("번호 : " + st.getNum());
                    System.out.println("이름 : " + st.getName());
                    System.out.println("국어 : " + st.getKor());
                    System.out.println("영어 : " + st.getEng());
                    System.out.println("수학 : " + st.getMat());
                }
                break;
            case "2":
                System.out.print("검색할 이름 : ");
                name = scanner.nextLine();
                ArrayList<Student> list = service.searchByName(name);
                if (list == null || list.size() == 0) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    System.out.println("번호 이름 국어 영어 수학");
                    System.out.println("--------------------------------");
                    for (Student s : list) {
                        System.out.printf("%-3d%5s%5d%5d%5d%n",
                                s.getNum(), s.getName(), s.getKor(), s.getEng(), s.getMat(), s.getTotal(), s.getAverage());
                    }

                }
                break;
        }
    }

    //번호 입력
    int inputNumber() {
        int num = 0;
        while(true) {
            try {
                //정수가 아닌 것을 입력하면 InputMismatchException 예외
                num = scanner.nextInt();
                //정수인 경우에도 없는 번호를 입력하면 예외로 처리되도록 예외객체 생성
                if (service.getStudent(num) == null) throw new RuntimeException();
                //정상적으로 입력하면 리턴
                return num;
            }
            catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.print("정수로 다시 입력하세요 : ");
            }
            catch (RuntimeException e) {
                System.out.print("없는 번호입니다. 다시 입력하세요 : ");
            }
        }
    }

    //점수 입력
    int inputScore() {
        int score = 0;
        while(true) {
            try {
                //정수가 아닌 것을 입력하면 InputMismatchException 예외
                score = scanner.nextInt();
                //정수인 경우에도 범위를 벗어나면 예외로 처리되도록 예외객체 생성
                if (score < 0 || score > 100) throw new RuntimeException();
                //정상적으로 입력하면 리턴
                return score;
            }
            catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.print("정수로 다시 입력하세요 : ");
            }
            catch (RuntimeException e) {
                System.out.print("0~100 범위로 다시 입력하세요 : ");
            }
        }
    }

    //프로그램 종료
    void end() {
        service.save();
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
}