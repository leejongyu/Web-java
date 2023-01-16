package edu.java.class02;

import java.util.Scanner;

public class call {

    public static void main(String[] args) {
        // product 타입의 객체를 생성.

        Product product1 = new Product(10097, "덜 예쁜 옷", 20000);
        System.out.println(product1.productName + ".  $ : " + product1.price);
        
        // 가격을 변경하는 메서드
        product1.setPrice();
        System.out.println(product1.productName + ".  $ : " + product1.price);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("물건의 등록번호, 이름, 가격을 입력하세요");
        Product product3 = new Product(sc.nextInt(), sc.next(), sc.nextInt());

        System.out.println(product3.productName + ".  $ : " + product3.price);
        

        
    }

}
