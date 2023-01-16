package edu.java.set02;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain02 {

    public static void main(String[] args) {
    
        // Score 타입을 원소로 갖는 HashSet을 선언, 생성
        HashSet<Score> hash = new HashSet<>();
        System.out.println(hash);

        Score score1 = new Score();
        hash.add(score1);
        System.out.println(hash);
        
        Score score2 = new Score(100, 97);
        hash.add(score2);
        System.out.println(hash);
        
        Score score3 = new Score(100,97);
        hash.add(score3);
        System.out.println(hash);

        // for-each 사용
        for (Score s : hash) {
            System.out.print(s+" ");
        }
        
        // Iterator 사용
        Iterator<Score> itr = hash.iterator();
        
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        
    }

}
