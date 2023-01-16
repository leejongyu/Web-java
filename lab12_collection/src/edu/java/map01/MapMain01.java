package edu.java.map01;

import java.util.HashMap;
import java.util.Set;

public class MapMain01 {

    public static void main(String[] args) {

        // 정수를 Key, 문자열을 Value로 하는 HashMap을 선언, 생성
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println(map);

        // .put(K,V) : Map<K,V>에 key - value 쌍의 데이터를 저장
        map.put(1, "홍글동");
        System.out.println(map);

        map.put(11, "홍골통");
        System.out.println(map);

        map.put(3, "홍꼴통");
        System.out.println(map);

        // .get(K) : key를 입력하면 Value를 리턴. 만약 해당 Key가 존재하지 않으면 null을 리턴.
        System.out.println(map.get(3));
        System.out.println(map.get(2));

        // .getOrDefault(K,V) : 검색할 key(K)와 key가 존재하지 않을 때 리턴할 기본 값(V)을 argument로 전달.
        System.out.println(map.getOrDefault(3, "언논"));
        System.out.println(map.getOrDefault(2, "언논"));

        // .remove(K) : key를 입력하면 해당 key에 mapping된 Key - Value 원소를 삭제 후 삭제한 value를 리턴.
        map.remove(1);
        System.out.println(map);

        // .remove(K) : 해당 key가 존재하지 않으면 null을 리턴. (에러가 발생하지 않음)
        map.remove(2);
        System.out.println(map);

        
        // Map<K,V>과 반복문. -> Key로 이루어진 Set 생성. 
        // KeySet() : Set<K>를 리턴. Map에서 Key들로만 이루어진 Set을 리턴.
        Set<Integer> kset = map.keySet();
        System.out.println(kset);
        for (Integer k : kset) {
            String v = map.get(k);
            System.out.println(k + " = " + v);
        }

    }
}
