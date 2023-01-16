package edu.java.modifier07;

public class ModifierMain07 {

    // 객체(object) : 프로그램에서 만들 대상.
    // 클래스(Class) : 객체를 생성하기 위한 설계도. 데이터 타입.
    // 인스턴스(instance) : 메모리에 생성된 객체.

    // 인스턴스 멤버 : (변수/ 필드, 메서드)
    // - static 수식어가 사용되지 않은 멤버.
    // 객체를 생성 한 후에, 참조 변수를 이용해서 사용.
    // Java Runtime이 사용하는 메모리 공간 중 Heap 영역에 생성됨.

    // static 멤버 : (변수/ 필드, 메서드)
    // - static 수식어가 사용된 멤버.
    // 객체를 사용하지 않아도 사용할 수 있는 멤버.
    // 클래스 이름을 이용해서 사용.
    // Java Runtime이 사용하는 메모리 공간 중 method/static 영역에 생성됨.
    // 프로그램 로딩 시점(main method 시작 전)에 메모리에 생겨남.
    // static 멤버들은 static 멤버들만 접근(사용)가능.
    // 지역변수 선언에는 static을 사용할 수 없음 (경고 : Illegal modifier for parameter (지역변수 이름); only final is permitted
    // 객체 선언 없이 실행되어야 하기 때문에 main method는 static이어야 함
    
    
    // final 수식어 : Class, 멤버(필드/변수 , 생성자, 메서드), 지역 변수에 사용됨
    // final 지역 변수 : 값이 한 번 저장되면 변경할 수 없는 변수.
    // final 멤버 변수 : 객체가 생성될 때 값이 초기화 되면 변경할 수 없는 멤버 변수.
     
    
    public static void main(String[] args) {

//       System.out.println(StaticTest.instanceVariable); // 객체 생성이 되지 않아서 시행이 불가능함
        
        // static 멤버(변수, 메서드)는 클래스 이름으로 참조해서 사용
        System.out.println(StaticTest.staticVariable);
        
        StaticTest.staticVariable = 100; // 객체생성 하지 않아도 변경 가능 
        StaticTest.printVariables2();
        
        System.out.println("");
        // 인스턴스 멤버(변수, 메서드)는 참조 변수를 이용해서 사용.
        StaticTest test2 = new StaticTest();  // 인스턴스 객체 test 생성
        // 선언한 변수 이름 변경 - alt + shift + t -> rename
        test2.printVariables();
        
        System.out.println("");
        System.out.println(StaticTest.staticVariable);
        System.out.println(test2.staticVariable); 
        // 참조변수를 이용해서 사용할 수는 있지만, 권장하지 않음 (경고 : static field 'StaticTest.staticVariable'은 정적 방법으로 액세스해야 합니다.)
        
        test2.instanceVariable = 10;
        
        test2.printVariables();
        
        StaticTest test3 = new StaticTest();
        test3.printVariables();
        
        
        System.out.println(Math.E);
    }

}
