package edu.java.set01;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Collection<E>
 * |__ List<E> , Set<E>, ......
 *     |__ ....   |__ HashSet<E> , TreeSet<E>, .....
 * 
 * Set<E>의 특징 : 
 * 1. 중복된 값을 저장하지 않음. (예) = {1,2} = {1,2,1,2}
 * 2. 저장하는 순서가 중요하지 않음 index가 없음 (for문을 사용할 수 없음) (예) {1,2,3} = {3,1,2}
 *                                                   > for-each문이나 Iterator는 사용 가능
 * 
 * HashSet<E> : Hash 알고리즘(검색을 빠르게 하는 알고리즘)을 사용한 Set
 * TreeSet<E> : Tree 알고리즘(정렬을 빠르게 하는 알고리즘)을 사용한 Set
 * 
 */

public class SetMain01 {

    public static void main(String[] args) {
        // String을 원소로 갖는 TreeSet
        TreeSet<String> tree = new TreeSet<>();

        System.out.println(tree);
        System.out.println(tree.size());
        
        // Set은 .add(Object o), .remove(Object o) 메서드만 가지고 있음.
        // Set은 index를 이용하지 않기 때문에 인덱스를 이용한 검색/ 추가/ 삭제 메서드는 제공하지 않음.
        
        tree.add("사과나무");
        System.out.println(tree);
        tree.add("사과나무"); // 이미 같은 값이 있기 때문에 추가되지 않음
        System.out.println(tree);
        
        tree.add("레몬나무"); // 레몬나무가 늦게 추가되었지만 자동정렬으로 인하여 먼저 나오게 됨
        System.out.println(tree);
        
        tree.add("감나무");
        tree.add("도토리나무");
        tree.add("포도나무");
        System.out.println(tree);
        
        // Set은 for 문장을 사용할 수 없지만, for-each 문장과 Iterator<E>를 사용할 수 있음
        
        for (String a : tree) {
            System.out.println(a);
        }
        
        tree.remove("도토리나무");
        
        // treeSet.iterator = 오름차순
        Iterator<String> itr = tree.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + ",");
        } System.out.println();
        
        // treeSet.descendingIterator = 내림차순
        Iterator<String> descendingItr = tree.descendingIterator();
        while(descendingItr.hasNext()) {
            System.out.print(descendingItr.next() + ",");
        }
        
    }

}
