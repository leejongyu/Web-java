package edu.java.interface01;

// import static 문장은 static으로 선언된 필드 또는 메서드 이름을 import할 때 사용.

// 인터페이스(interface) : 
// 사용 목적 : 팀/ 회사 간의 분업/협업을 하기 위해서 메서드(기능)들의 프로토타입(prototype, signature)를 약속하기 위한 규약.
// 인터페이스가 가질 수 있는 멤버들 :
// 1) public static final 필드(멤버 변수). "public static final"은 보통 생략되어 있음
// 2) public abstract 메서드. "public abstract"는 보통 생략.
// 인터페이스 선언 : interface 키워드를 사용.
// > public interface a { ... }
// > 인터페이스는 객체를 생성할 수 없고, 인터페이스를 구현하는 클래스를 정의해서 객체를 생성함.
// - 구현 클래스 : class 클래스이름 implement 인터페이스 이름 {...}
// 클래스는 단일상속만 가능하지만, 인터페이스 구현은 개수 제한이 없음.


public class InterfaceMain01 {

    public static void main(String[] args) {
        System.out.println(DatabaseModule.DB_VERSION);   

        // OracleDatabaseModule 타입의 객체 생성

        OracleDataboaseModule o = new OracleDataboaseModule();
        
        o.create(900, "냠냠");
        
        o.read();
        
        
        // MariaDBModule 타입의 객체 생성
        
        MariaDbModule m = new MariaDbModule();
        
        m.create(100, "쩝쩝");
        
        m.read();
        
        
        // 다형성을 이용한 객체 생성
        // Supertype 변수 = new Subtype();
        
        DatabaseModule od = new OracleDataboaseModule();
        od.read();
        
        DatabaseModule md = new MariaDbModule();
        md.read();
    }
    

    
}
