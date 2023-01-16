package edu.java.mvc.view;

import java.util.Scanner;

import edu.java.mvc.controller.MemberDaoImpl;
import edu.java.mvc.model.Member;

import static edu.java.mvc.controller.MemberDaoImpl.MAX_LENGTH;

// MVC (Model - view - controller) 아키텍쳐를 사용한 회원 관리 프로그램
// 1) Model : 애플리케이션의 데이터를 설계한 클래스. Member
//            VO(Value Object) , DTO (Data Transfer Object)

// 2) View : 애플리케이션의 UI(User Interface)를 담당하는 클래스. MemberMain.

// 3) Controller : 애플리케이션의 특정 로직, 기능을 담당하는 클래스. MemverDao.
//                 DAO(Data Access Object)
//                 - MemberDao 인터페이스.
//                 - MemberDaoImpl 클래스. : singleton design.

// View
public class MemberMain {

    private Scanner sc = new Scanner(System.in);
    private MemberDaoImpl dao = MemberDaoImpl.getInstance(); // singleton 객체 생성

    public static void main(String[] args) {

        MemberMain app = new MemberMain(); // -> non static 멤버들을 사용하기 위하여 객체를 생성.

        System.out.println("================== 회원 관리 프로그램 ===================");

        boolean run = true;

        while (run) {

            int n = app.chooseMenu(); // 메뉴 보여주기
            Menu menu = Menu.getValue(n); // 메뉴 숫자를 enum Menu 타입으로 변환.

            switch (menu) {
            case QUIT:
                
                run = false;
                
                break;
            case CREATE:

                app.createNewMember();

                break;
            case SELECT_ALL:

                app.select();

                break;
            case SELECT_BY_INDEX:
                
                app.selectByIndex();
                
                break;
            case UPDATE:
                
                app.updateMemberInfo();
                
                break;
            case UNKNOWN:
                System.out.println("잘못된 메뉴 선택 - 메뉴를 다시 선택하세요.");
                break;
            }
        }

        System.out.println("================= 프로그램을 종료합니다 =================");
    }

    // 메뉴 선택 메서드
    private int chooseMenu() {
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("[0]종료 [1]회원가입 [2]전체검색 [3]인덱스검색 [4]업데이트");
        System.out.println("=========================================================");
        System.out.print("선택 : ");

        int n = Integer.parseInt(sc.nextLine());

        return n;
    }

    
    // 회원가입 메서드
    private void createNewMember() {
        System.out.println("회원가입 창 입니다. ");
        if (dao.getCount() == MAX_LENGTH) {
            System.out.println(" 회원정보를 저장할 메모리가 부족합니다. ");
            return;
        }
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = sc.nextLine();

        Member m = new Member(id, pw);
        // Member 타입 객체를 배열 저장 -> controller 객체를 이용
        int result = dao.create(m);
        if (result == 1) {
            System.out.println("회원 정보 생성/ 저장 성공");
        } else {
            System.out.println("회원 정보 생성/ 저장 실패");
        }

    }

    // 정보 검색 메서드
    private void select() {
        Member[] members = dao.read();
        System.out.println("=======================회원 리스트=======================");
        for (Member m : members) {
            System.out.println(m);

        }
        System.out.println("=========================================================");
    }

    // 선택 정보 검색 메서드
    private void selectByIndex() {
        System.out.println("=======================인덱스 검색=======================");
        System.out.print("검색할 인덱스를 입력하세요 : ");
        int index = Integer.parseInt(sc.nextLine());

        Member m = dao.read(index); // view에서 controller 기능을 이용
        System.out.println(m); 

    }
    
    // 업데이트 메서드 
    private void updateMemberInfo() {
        System.out.println("====================회원정보 업데이트====================");
        System.out.print("업데이트 할 인덱스를 입력하세요 : ");
        int index = Integer.parseInt(sc.nextLine());
        System.out.print("업데이트 할 비밀번호를 입력하세요 : ");
        String pw = sc.nextLine();

        int result = dao.update(index, pw);
        
        if (result == 1 ) {
            System.out.println("회원 정보 업데이트 성공");
        } else {
            System.out.println("회원 정보 업데이트 실패");
        }
        
    }

}
