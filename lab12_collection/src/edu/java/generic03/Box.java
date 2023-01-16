package edu.java.generic03;

// generic class = 타입 파라미터들을 갖는 클래스.
// class ClassName<A,B, ...> { ... } 
// 타입 파라미터 개수의 제한은 없음.
// 타입 파라미터는 필드 타입, 메서드 파라미터 타입, 메서드 리턴타입으로 사용 될 수 있음.
// 타입 파라미터는 기본 데이터 타입(boolean, int, double, char 등...)을 사용할 수 없음.
// 타입 파라미터는 반드시 클래스 타입만 사용 가능! => Wrapper class(Boolean, Integer, Double, Character 등..)를 사용함

public class Box<T> {

    private T content; 
    
    
    public void put(T content) {
        this.content = content;
    }
    
    public T get() {
        return content;
    }
}

