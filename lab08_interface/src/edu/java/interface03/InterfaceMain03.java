package edu.java.interface03;

// 자바는 다중 상속을 지원하지 않음. 단일 상속만 지원함.
class A {
}

class B {
}

class C extends A {
}

class D extends C {
}
// class D extends A,C {} (오류 발생)

// 자바의 클래스가 구현하는 인터페이스의 개수는 제한이 없음.
interface E {
}

interface F {
}

class G implements E, F {
}

// 인터페이스는 다른 인터페이스를 상속(extends) 할 수 있음. (인터페이스만 상속 가능)\
// 인터페이스는 클래스를 상속할 수 없음
// interface I extends A {} (오류 발생)

// ※ 인터페이스는 2개 이상의 다른 인터페이스를 상속(다중 상속)할 수 있음.
interface H extends E, F {
}

interface Buyer {
    void buy();

    default void register() {
        System.out.println("구매자 등록");
    }
}

interface Seller {
    void sell();

    default void register() {
        System.out.println("판매자 등록");
    }
}

class User implements Buyer, Seller {

    @Override
    public void buy() {
        System.out.println("계좌이체 되죠?");

    }

    @Override
    public void sell() {
        System.out.println("아뇨 제가 계좌가 없어서 ㅎㅎ;;");

    }

    @Override
    public void register() { // 2개의 인터페이스의 메서드가 같은 signature를 가진 경우 오류 발생.
        Buyer.super.register(); // 이런 경우 반드시 override 해야함.
        Seller.super.register();
    }

}

public class InterfaceMain03 {

    public static void main(String[] args) {

        User user = new User();

        user.buy();
        user.sell();
        user.register();

        // 다형성(polymorphism)
        Buyer user2 = new User();
        Seller user3 = new User();

        user2.buy(); // User 타입이지만 buyer로 만들어져서 seller의 메서드는 보이지 않음
        user2.register();
        user3.sell();
        user3.register();
        // 타입 강제변환을 통해서 User 타입의 user2는 seller의 메서드를 사용할 수 있음
        if (user2 instanceof User) {
            ((User) user2).sell();
        }

    }

}
