package edu.java.condition04;

import java.util.Random;

public class conditionMain05 {
    public static void main(String[] args) {
        Random random = new Random();
        // Random 타입 변수를 선언하고, 초기화
        // Java, SQL, JSP 과목의 점수를 0이상 100 이하의 난수를 만들어서 저장.
        // 세 과목의 평균을 계산
        // 모든 과목의 점수가 40점 이상이고, 평균이 60점 이상이면 "합격", 그렇지 않으면 "불합격"

        int java = random.nextInt(101);
        int sql = random.nextInt(101);
        int jsp = random.nextInt(101);

        System.out.println(java);
        System.out.println(sql);
        System.out.println(jsp);

        int sum = (java + sql + jsp);
        int avg = (sum / 3);
        
            
        if (java >40 && sql > 40 && jsp > 40 && avg > 60 ) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }

    
        
        String a = (java >40 && sql > 40 && jsp > 40 && avg > 60) ? ("합격입니다.") : ("불합격입니다.");
        System.out.println(a);
    }
}
