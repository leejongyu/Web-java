package edu.java.class01;

// 클래스 : 데이터 + 기능 + 생성자 ==> 데이터 타입 
//          클래스의 이름은 관습적으로 대문자로 시작            
public class User {
    // 객체가 가지는 속성들(Data)
    // 필드
    // 멤버변수
    // 속성(프로퍼티)
    String userID;
    String password;
    int age;

    // 생성자(Constructor)
    // 생성자는 메모리에 생성하고 초기화(값을 저장)하는 기능을 담당.
    // 모든 클래스는 생성자가 적어도 하나 이상은 있어야 함.
    // 생성자의 이름은 클래스의 이름과 동일. 
    // 생성자는 return 타입이 없음(return 타입이 있으면 메서드임)

    // Default constructor. 기본 생성자. - argument를 갖지 않는 생성자
    // 생성자가 없는 경우 자동으로 생성됨
    // 모든 속성들 (userID, password, age 등)을 그 타입의 기본값으로 초기화함.
    // 기본값 : 0(byte, short, int, byte, char),
    //          0.0(fault, double),
    //          false(boolean),
    //          참조타임(null)
    public User() { // 1번 생성자
        // Do nothing
    }

    // argument를 갖는 생성자
    public User(String userID, String password, int age) { // 2번 생성자
        this.userID = userID; // argument에 제공된 정보를 변수에 값을 저장하는 용도로 사용
        this.password = password;
        this.age = age;
        // this = 객체가 생성 된 주소
    }

    public User(String userID, String password) { // 3번 생성자
//        this.userID = userID;
//        this.password = password;
//      =>
        this(userID, password, 0); // 오버로딩된 다른 생성자(2번 생성자)를 사용할 때 사용
        // this = 오버로딩 된 다른 생성자 호출
        
        // 이 경우 age = 초기값 0;
    }

    public User(String userID) { // 4번 생성자
//        this(userID, null, 0); // 2번 생성자 사용
        this(userID, null); // 3번 생성자 사용
    }
    // 생성자 오버로딩 : 파라미터가 다른 생성자를 여러개 정의하는 것.

    // this의 의미 :
    // 1) 생성된 객체의 주소 : (예) this.userID, this.password, ....
    // 클래서 스스로가 생성된 주소
    // 2) 생성자 : 오버로딩된 다른 생성자를 사용할 때

}
