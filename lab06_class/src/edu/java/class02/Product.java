package edu.java.class02;

// 클래스의 멤버들 : 
// 1. 필드(Field) : 클래스의 객체들이 가질 속성들(데이터). 클래스에서 선언되는 변수 (멤버변수)
// 2. 생성자(Constructor) : 객체를 생성하고 초기화.
// 3. 메서드(Method) : 클래스의 객체들이 갖는 기능(함수)

public class Product {
    // field
    int productId; // 상품 목록을 관리하기 위한 용도
    String productName; // 상품 이름을 저장하기 위한 용도
    int price; // 상품 가격을 정하기 위한 용도

    //constructor : field의 항목들을 저장할 수 있는 메모리를 확보하고, 각각의 변수를 초기화
    
    public Product (int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price; // argument 변수의 이름과 field 변수의 이름이 같기 때문에 this. 를 붙여야함
    }
    
    // Method
    // 이름이 소문자로 시작(관습적)
    // 이름 앞에 return 타입이 있음
    public void setPrice() {
        this.price = price - (int)(price * 0.3) ;
 
    }
    
    
    
}
