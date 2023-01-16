package edu.java.map03;

import java.util.HashMap;
import java.util.TreeMap;

public class MapMain03 {

    public static void main(String[] args) {
        // 단어 개수 세기
        String sentence = "하늘 바다 땅 하늘 땅 사람 SKY SKY";

        // 문자열 sentence를 공백으로 구분해서 단어들로만 이루어진 배열을 생성
        String[] words = sentence.split(" ");

        // Map 생성
        TreeMap<String, Integer> wordCounts = new TreeMap<>();
        System.out.println(wordCounts);

        // 배열에 등장하는 단어들을 하나씩 반복하면서
        for (String s : words) {
            Integer number = wordCounts.get(s);
            if (number == null) { // 단어가 Map에 Key로 존재하지 않으면, "단어 = 1" 을 Map에 put

                wordCounts.put(s, 1);
            } else {// 단어가 Map에 Key로 존재하면, Value +1

                wordCounts.put(s, number + 1);
            }
            System.out.println(wordCounts);
        }

        System.out.println("=========================");
        
        HashMap<String, Integer> word2 = new HashMap<>();
        for (String w : words) {
            Integer count = word2.getOrDefault(w, 0);
        word2.put(w, count+1);
        System.out.println(word2);
        }

            System.out.println("=========================");
        HashMap<String, Integer> count = new HashMap();

        String[] array = sentence.split(" ");

        for (String a : array) {

            if (count.get(a) == null) {
                count.put(a, 1);
            } else {
                count.put(a, count.get(a) + 1);
            }

            System.out.println(count);
        }

    }

}
