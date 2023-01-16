package edu.java.map02;

import java.util.Set;
import java.util.TreeMap;

public class MapMain02 {

    public static void main(String[] args) {

        // Key는 문자열 타입, Value는 정수 타입인 TreeMap을 선언, 생성
        
        TreeMap<String, Integer> menu = new TreeMap<>();
        
        menu.put("짜장면", 7000);
        
        menu.put("짬뽕", 8000);
        
        menu.put("탕수육", 12000);
        
        menu.put("볶음밥", 8000);
        
        System.out.println(menu);

        System.out.println(menu.get("짜장면"));
        System.out.println(menu.get("랭면"));
        System.out.println(menu.getOrDefault("랭면", 0));


        Set<String> menuKey = menu.keySet(); // 오름차순 키 집합
        
        for (String a : menuKey) {
            Integer p = menu.get(a);
            System.out.println(a + " : " + p);
        }
        
        Set<String> descMenuKey = menu.descendingKeySet(); // 내림차순 키 집합
        
        for (String a : descMenuKey) {
            Integer p = menu.get(a);
            System.out.println(a + " : " + p);
        }
        
        
    }

}
