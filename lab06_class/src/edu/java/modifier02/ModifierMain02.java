package edu.java.modifier02;

import edu.java.modifier01.AccessTest; 
// 같은 패키지에 있는 클래스들은 import문장 없이 변수 선언에서 클래스 이름을 사용할 수 있음.
// java.lang 패키지에 포함된 클래스들은 import 문장 없이 클래스 이름을 사용할 수 있음 (String, Math, System 등)

// 다른 패키지에 있는 클래스 이름으로 변수를 선언 할 때에는
// 1) import 문장을 작성하고 클래스 이름을 사용
// 2) 패키지를 포함한 클래스 전체 이름(full name)을 사용 (package.class 변수이름 = new package.class)
// 3) 서로 다른 패키지에서 같은 이름의 클래스를 사용하는 경우에는 (package.class 변수이름 = new package.class)를 사용


public class ModifierMain02 {

    public static void main(String[] args) {
        
        String a = "";

        AccessTest test2 = new AccessTest(1, 2, 3, 4);   
     
        // test2.a = 2; // a= private 멤버. 다른 클래스, 다른 패키지에서 보이지 않음. 직접 접근 안됨!
        // test2.b = 3; // b= package 멤버. 다른 패키지에서 보이지 않음. 직접 접근 안됨!
        // test2.c = 4; // c= protected 멤버. 다른 패키지, 상속받지 않은 클래스에서 보이지 않음. 직접 접근 안됨!
        
        test2.printMembers(); // public method를 통해서 간접 접근 가능
        
    }

}
