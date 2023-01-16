package lab07_inheritance02;

public class ChildClass extends SuperClass {

    
    
    public ChildClass() {
        super(0);
    }
    
    
    public ChildClass(int a) {
        super(a);
        // superclass가 기본 생성자를 갖고 있지 않기 때문에,
        // 명시적으로(explicitly) superclass의 argument를 갖는 생성자를 호출해야만함
    }

    
    
    
}
