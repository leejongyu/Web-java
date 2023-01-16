package edu.java.class01;

import java.util.Scanner;

public class ClassMain01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User 클래스 타입으로 변수 선언(user1)
        // 객체 생성(new User();)
        // 초기화

        User user1 = new User(); // 생성자 호출 => 객체 생성 => 변수 저장

        System.out.println(user1); // 주소 호출
        System.out.println(user1.userID); // = null
        System.out.println(user1.password); // = null
        System.out.println(user1.age); // = 0

        user1.userID = "admin"; // user1에 저장된 userId에 admin 부여( null => admin )
        user1.password = "qwer"; // user1에 저장된 userPassword에 qwer 부여 (null => admin)
        user1.age = 25; // user1에 저장된 age에 25 부여 (0 => 25)

        System.out.println(user1.userID); // = admin
        System.out.println(user1.password); // = qwer
        System.out.println(user1.age); // = 25

        User user2 = new User("guest", "guest", 0);
        System.out.println(user2.userID); // guest
        System.out.println(user2.password); // guest
        System.out.println(user2.age); // 0
        
        System.out.print(" 이름, 생일, 나이를 입력하세요 : ");
        User user3 = new User((sc.next()), sc.next(), sc.nextInt());
        
        System.out.println(user3.userID);
        System.out.println(user3.password);
        System.out.println(user3.age);
    }

}
