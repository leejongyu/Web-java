package edu.java.list01;

import java.util.ArrayList;
import java.util.Iterator;
/* 
Collection<E> // E? - element : 원소.
|__ List<E> (인터페이스)
    |__ ArrayList<E>, LinkedList<E>, .....


List의 특징 (ArrayList<E>와 LinkedList<E>의 공통점):
 1) 값을 저장하는 순서가 중요. - index를 가지고 있음.
 2) 값들을 저장 할 때마다 index는 자동으로 증가. - 저장 용량이 자동으로 증가 (배열과 다른점)
 3) 리스트 중간에 있는 값을 삭제하면 인덱스는 자동으로 재배열.
 4) 같은 값을 여러번 저장할 수 있음. (Set<E>는 같은 값을 여러번 저장할 수 없음.
 5) List<E>에서 <E>는 리스트가 저장하는 원소(elemant)의 데이터 타입 (반드시 클래스 이름만 가능.)
 

ArrayList<E>의 특징 :
 1) 배열(Array)를 사용하는 리스트
 2) 데이터 저장(add)과 삭제(remove) 속도가 느림.
 3) 데이터 검색(get) 속도 빠름

ArrayList<Integer> list1 = new ArrayList<Intesger>();
ArrayList<String> list2 = new ArrayList<String>();
ArrayList<Student> list3 = new ArrayList<Student>();


LinkedList<E>의 특징 :
 1) Linked list 알고리즘을 사용하는 리스트.
 2) 데이터 저장/ 삭제 속도가 빠름
 3) 데이터 검색 속도 느림
 
*/

public class ListMain01 {

    public static void main(String[] args) {

        // 문자열들을 저장하는 ArrayList를 선언/생성
        ArrayList<String> program = new ArrayList<>();
        System.out.println(program); // toString() 메서드가 override 되어 있음

        // ArrayList의 크기(원소의 개수)
        System.out.println("size = " + program.size());

        System.out.println("============= add(무한도전) =================");
        // .add(E element) : 리스트에 새로운 원소를 추가
        program.add("무한도전");
        System.out.println(program);
        System.out.println("size = " + program.size());

        System.out.println("============= add(1박 2일) =================");
        // .add(E element) : 리스트에 새로운 원소를 추가2
        program.add("1박 2일");
        System.out.println(program);
        System.out.println("size = " + program.size());

        System.out.println("============= add ==========================");
        program.add("런닝맨");
        program.add("상상플러스");
        program.add("코미디빅리그");
        program.add("빅마우스");

        System.out.println(program);
        System.out.println("size = " + program.size());

        // .get(int index) : 리스트에서 인덱스 위치의 원소를 리턴.

        System.out.println("============= get(0) =================");
        System.out.println(program.get(0));
        System.out.println("============= get(1) =================");
        System.out.println(program.get(1));

        // .remove(E element) : 리스트에서 처음 등장하는 element 1개를 삭제
        System.out.println("======== add(1박 2일) + 1 ============");
        program.add("1박 2일");
        System.out.println(program);

        System.out.println("======== remove(E element) ===========");
        program.remove("1박 2일");
        System.out.println(program);

        
        // .remove(int index) : 리스트에서 index 위치에 있는 원소를 삭제
        System.out.println("===== remove(int 2) - 상상플러스 =====");
        program.remove(2);
        System.out.println(program);
        
        
        // 반복문을 사용한 List 원소 출력 1) index 사용
        System.out.println("===== 반복문을 사용한 원소 출력 ======");
        for (int i = 0; i < program.size() ; i++) {
            System.out.println(program.get(i));
        }
        
        // 반복문을 사용한 List 원소 출력 2) for- each 사용

        System.out.println("== for - each을 사용한 원소 출력 ======");
        for (String a : program) {
            System.out.println(a);
        }
        
        // 반복문을 사용한 List 원소 출력 3) Iterator<E> 사용 (반복자)
        System.out.println("==== Iterator를 사용한 원소 출력 ======");
        Iterator<String> itr = program.iterator(); // 리스트 원소를 순회(Iterate)하는 도구를 생성
        while (itr.hasNext()) { // .hasNext() -> 리스트에서 다음 원소가 존재하면 반복
            System.out.println(itr.next()); // .next() -> 현재 위치를 리턴하고 다음 위치로 이동
        }
        
    }

}
