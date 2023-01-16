package edu.java.modifier04;

import java.util.Scanner;

public class ModifierMain04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디와 비밀번호를 입력하세요.");

        Member jongyu = new Member(sc.next(), sc.next());

        Member guest = new Member("guest","0000");
        
        System.out.println(guest.getId());
        System.out.println(guest.getPw());
        
        System.out.println(jongyu.getId());
        System.out.println(jongyu.getPw());

        System.out.println("변경할 비밀번호를 입력하세요\n변경할 비밀번호: ");
        jongyu.setPw(sc.next());
        guest.setPw("007빵");
        
        System.out.println(guest.getId());
        System.out.println(guest.getPw());
        
        System.out.println(jongyu.getId());
        System.out.println(jongyu.getPw());

    }

}
