package edu.java.inner01;

public class Outer {

    // field

    private int x;
    private int y;
    
    
    // constructor
    
    public Outer (int x, int y) {
        this.x = x;
        this.y = y;
    }

 
    
    // method


    @Override
    public String toString() {
        
    
        return "Outer [x=" + x + ", y=" + y + "]";
    }
    
    
    // non-static(instance) member inner class
    public class Inner {
        private int x;
        private int z;
        
        public Inner(int z) {
            this.z = z;
        }
        
        public void printInfo() {
            System.out.println("--- Inner Class ---");
            // 내부 클래스에서는 외부 클래스의 멤버(변수, 메서드)를 사용할 수 있음(private 포함)!
            System.out.println("Inner x : " + x);
            // 내부 클래스의 멤버 이름과, 외부 클래스의 멤버 이름이 같은 경우에 내부클래스의 변수가 사용됨.
            // 내부클래스에서 외부클래스를 사용하는 방법 : 외부클래스이름.this.멤버이름 으로 호출하여 사용
            System.out.println(("Outer x : " + Outer.this.x));
            System.out.println("y : " + y);
            System.out.println("z : " + z);
        }
        
    }
    
    
    
} // end class
