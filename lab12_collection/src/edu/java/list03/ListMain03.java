package edu.java.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMain03 {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "SQL", "HTML", "CSS", "JavaScript", "Servlet", "JSP", "Spring",
                "Python"); // List 생성과 동시에 값을 저장하는 방법

        System.out.println(languages);

        // 1. languages에서 5글자 이상인 물자열들만 저장하는 리스트를 생성, 출력
        List<String> five = new LinkedList<>();

        for (String s : languages) {
            if (s.length() >= 5) {
                five.add(s);
            }
        }
        System.out.println(five);
        
        // Iterate<E> 사용
        List<String> five2 = new ArrayList<>();
        Iterator<String> itr = languages.iterator();
        while(itr.hasNext()) {
            String s = itr.next();
           if (s.length() >= 5) {
               five2.add(s);
           }
        }
        System.out.println(five2);

        // 2. languages의 원소들의 글자수를 저장하는 리스트를 만들고 출력
        List<Integer> length = new ArrayList<>();

        for (String s : languages) {
            length.add(s.length());
        }
        System.out.println(length);

        // 3. 정수 (1,2)들을 저장하는 리스트를 만들고 초기화
        List<Integer> genderCodes = Arrays.asList(1, 1, 2, 2, 1, 2, 1);

        // 4. genderCodes의 원소가 1이면 "Male", 2이면 "Female"을 저장하는 리스트를 만들고 출력
        List<String> gender = new LinkedList<>();

        for (Integer i : genderCodes) {
            if (i == 1) {
                gender.add("Male");
            } else {
                gender.add("Female");
            }
        }
        System.out.println(gender);


    }

}
