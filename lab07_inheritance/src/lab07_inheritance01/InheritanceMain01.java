package lab07_inheritance01;

// 상속(inheritance)

// super class, parent class, base class
// sub class, child class, derived class
// class SubClass extends SuperClass {...}

public class InheritanceMain01 {

    public static void main(String[] args) {
        // TV 만들기

        BasicTv one = new BasicTv();

        one.powerOnOff();
        one.powerOnOff();

        
        System.out.println();

        
        SmartTv two = new SmartTv();
        
        two.powerOnOff();
        
        two.setIp("110.0.54");
        
        System.out.println(two.getIp());
        
        two.powerOnOff();
        
        
    }

}
