package api;

import api.Controller.StudentService;
import api.Model.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentManagement {
    public static final Scanner sc = new Scanner(System.in);
    StudentService service = new StudentService();

    //todo: 파일이 있는지, 없는지 체크 -> 못찾는 에러가 발생 시 생성
    //todo: 마지막에 0 누르면 프로그램 종료 및 저장 기능 서비스를 통해 구현
    //service.save(); //통째로 저장, 파일의 Integer num 변수로 저장(어디까지 저장했는지 기록용 num)
    //프로그램 종료합니다.
    // System.exit(0);
    public static void main(String[] args) {
        /*
        출력 예시
        - 오류 기준: 없는 숫자, 문자인 경우 에러, 0인 경우 반복문 출력 종료
        [학생 성적 관리 시스템]
        1. 입력
        2. 수정
        3. 삭제
        4. 검색
        5. 전체 출력
        0. 종료
        선택> 9
        번호 오류. 다시 입력하세요.

         [학생 성적 관리 시스템]
        1. 입력
        2. 수정
        3. 삭제
        4. 검색
        5. 전체 출력
        0. 종료
        선택>

        -만약 실제 입력이 맞는 경우 : n번 입력메뉴 선택했습니다.

        -0 입력 시, 프로그램을 종료합니다.
        */
        StudentManagement manager = new StudentManagement();
        ArrayList<Student> studentList = new ArrayList<>();
        while (true) {
            int num = manager.Menu(); //메뉴 출력

            try {
                switch (num) {
                    case 1:
                        System.out.printf("%d번 입력 메뉴 선택했습니다.\n", num);
                        manager.input();
                        System.out.println("입력을 완료하였습니다.");
                        break;
                    case 2:
                        System.out.printf("%d번 수정 메뉴 선택했습니다.\n", num);
                        manager.insert();
                        break;
                    case 3:
                        System.out.printf("%d번 삭제 메뉴 선택했습니다.\n", num);
                        manager.delete();
                        break;
                    case 4:
                        System.out.printf("%d번 검색 메뉴 선택했습니다.\n", num);
                        manager.search();
                        break;
                    case 5:
                        System.out.printf("%d번 전체 출력 메뉴 선택했습니다.\n", num);
                        manager.outPut();
                        break;
                    case 0:
                        manager.end();
                        break;
                    default:
                        System.out.println("번호 오류. 다시 입력하세요.\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("숫자 외의 값은 입력할 수 없습니다.");
                sc.nextLine(); // 버퍼 비우기
                main(args); // 재귀 호출로 메뉴 다시 표시
            }
        }
    }

    private int Menu() {
        System.out.println("[학생 성적 관리 시스템]");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("4. 검색");
        System.out.println("5. 전체 출력");
        System.out.println("0. 종료");
        System.out.print("선택> ");
        return sc.nextInt();
    }

    //사실상 유틸리티 폴더에 넣어두고 뽑아 써야함.
    //공통 숫자 입력 유효성 검사
    private int inputInt(String msg) {
        int num = 0;
        try {
            System.out.print(msg);
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
        } catch (Exception e) {
            System.out.println("형식이 잘못되었습니다.");
        }
        return num;
    }

    // 공통 문자열 입력 유효성 검사
    private String inputString(String msg) {
        String input = "";
        try {
            sc.nextLine(); //학번으로 인한 버퍼 비우기
            System.out.print(msg);
            input = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("이름을 제대로 입력해주세요.");
        } catch (Exception e) {
            System.out.println("입력 형식이 잘못되었습니다.");
        }
        return input;
    }

    void input() {
        String name = inputString("학생명을 입력해주세요.\n> ");
        int kor = inputInt("국어 성적을 입력해주세요.\n> ");
        int eng = inputInt("영어 성적을 입력해주세요.\n> ");
        int mat = inputInt("수학 성적을 입력해주세요.\n> ");

        Student student = new Student(name, kor, eng, mat);

        if (service.add(student)) {
            System.out.println("학생 정보가 정상적으로 저장되었습니다.");
        } else {
            System.out.println("저장에 실패했습니다.");
        }
    }

    void insert() {
        int num, k, e, m;
        String name;
        Student s;
        num = inputInt("수정할 학번을 입력해주세요 \n> "); //inputInt 유효성 체크
        s = service.getStudent(num); //번호로 학생 정보 찾기
        System.out.print("현재 정보는 " + s + "입니다. 수정하고자 한다면 Enter를 눌려서 진행해주세요.");//현재 상태 출력
        name = inputString("학생명을 입력해주세요.\n> ");
        k = inputInt("수정할 국어 성적을 입력해주세요.\n> ");
        e = inputInt("수정할 영어 성적을 입력해주세요.\n> ");
        m = inputInt("수정할 수학 성적을 입력해주세요.\n> ");
        //국영수도 입력받음
        s = new Student(num, name, k, e, m);
        service.modify(s);
    }

    void search() {
        int num;
        String name;
        boolean isStudent = service.searchStudent();
        if (isStudent) {
            System.out.println("현재 학생 목록이 존재합니다.");
        } else {
            System.out.println("현재 학생 목록이 존재하지 않습니다. 검색할 수 없습니다.");
            System.exit(0);
        }
        System.out.println("학번과 이름 중 어느 것으로 검색하시곘습니까?");
        System.out.println("학번: 1, 이름: 2 중에서 선택해주세요. > ");
        int choice = sc.nextInt();
        if (choice == 1) {
            num = inputInt("학번을 입력해주세요 \n> ");
            Student s = service.getStudent(num);
            System.out.println(s + " \n");
        } else if (choice == 2) {
            name = inputString("이름을 입력해주세요 \n");
            service.searchName(name);
        } else {
            System.out.println("잘못 입력하셨습니다.");
            sc.close();
        }

    }

    private void delete() {
        String check;
        int num;
        num = inputInt("삭제할 학번을 입력해주세요 \n> ");
        sc.nextLine(); //버퍼비우기
        System.out.print("해당 학번을 정말로 삭제하시겠습니까? (Y/N)> ");
        check = sc.nextLine();
        try {
            if (check.equalsIgnoreCase("Y")) {
                Student s = service.delete(num);
                System.out.println(s);
            } else System.out.println("취소했습니다.");
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    void outPut() {
        ArrayList<Student> students = service.getList(); //원본을 수정하지 않도록 주의
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다. \n");
            return;
        }
        System.out.println("전체 학생 정보는 다음과 같습니다.");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void end() {
        service.save();
        System.out.println("프로그램을 종료합니다.");
        System.exit(0); //완전 종료
    }

}
