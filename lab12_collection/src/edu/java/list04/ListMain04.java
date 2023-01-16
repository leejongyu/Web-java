package edu.java.list04;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain04 {
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ListMain04 app = new ListMain04();

        User user1 = new User();
        user1.setId("오랑이");
        user1.setPw("바보");
        System.out.println(user1);

        User user2 = new User("침팬지", "바나나");
        System.out.println(user2);

        // User 타입을 저장할 수 있는 ArrayList를 선언, 생성
        ArrayList<User> users = new ArrayList<>();

        // for 문장을 사용 (3. Scanner. add)
//        for (int i = 0; i < 4; i++) {
//            String id = app.setId();
//            String pw = app.setPw();
//
//            users.add(new User(id, pw));
//        }

        // List 출력
        System.out.println(users);

        // Remove index
        users.remove("1");
        System.out.println(users);

//        Remove "guest"
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals("guest")) {
                users.remove(i);
                break;
            }

        }
        System.out.println(users);

        for (User u : users) {
            if (u.getId().equals("guest")) {
                users.remove(u);
            }
        }
        System.out.println(users);

        System.out.println("+++++++++++++++++++++++++++++++");
        ArrayList<User> userList = new ArrayList<>();
        
        
        for (int i = 0; i < 5 ; i ++) {
            userList.add(new User("Guset",String.format("%s",i)));
        }
        System.out.println(userList);
    
        users = userList;
        System.out.println(users);
        
        userList.removeAll(userList);
        System.out.println(userList);
        
        
    }

    private String setId() {
        System.out.print("ID를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.println("ID = " + id);
        return id;
    }

    private String setPw() {
        System.out.print("PW를 입력하세요 : ");
        String pw = sc.nextLine();
        System.out.println("PW = " + pw);
        return pw;
    }

}
