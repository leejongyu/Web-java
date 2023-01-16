package lab07_inheritance02;

public class InheritanceMain02 {

    public static void main(String[] args) {
        
        
        
        
        // 기본 생성자
        Person a = new Person();
        System.out.println(a.getName());
       
        System.out.println();
        
        // argument를 하나 갖는 생성자
        Person b = new Person("오쌤");
        System.out.println(b.getName());
        
        System.out.println();
        
        Student c = new Student();
        // subclass의 생성자를 호출하면 superclass의 생성자가 먼저 호출되고 난 후 subclass의 생성자가 호출됨.
        // => 부모타입 객체가 먼저 생성되어야 자식타입 객체도 생성될 수 있음
        // subclaas의 생성자에서 superclass의 생성자를 명시적으로 호출하는 코드가 없는 경우에는 superclass의 기본 생성자가 자동으로 호출됨.
        // superclass의 argument가 있는 생성자는 자동으로 호출될 수 없음.
        // superclass의 argument가 있는 생성자를 사용하려면 반드시 명시적으로 호출해야함
        // super(부모클래스의 생성자)를 호출하는 코드는 생성자에서 가장 먼저 작성되어야함
        // this의 의미 : [1] 생성된 객체(자기 자신)의 주소. this.field, this.method() 
        //               [2] Overloading된 다른 생성자.     this(), this(...)
        // super의 의미 : [1] superclass의 객체 주소(private로 생성된 필드는 X). super.field, super.method()
        //                [2] superclass의 생성자.                               super(). super(...)
        
        
        
        
        System.out.println();
        
        // Student 타입의 객체를 argument 1개를 갖는 생성자로 생성.
        Student d = new Student("ALOHA");
        
        System.out.println();
        
        // Student 타입의 객체를 argument 2개를 갖는 생성자로 생성.
        Student e = new Student("박밈미", "외래작업치료실");
        System.out.println(e.getName() + "," + e.getSchool() );
        
    }

}
