package edu.java.string;

public class Ex01 {

    public static void main(String[] args) {
        // String class의 메서드들을 사용

        // ex -1. 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
        System.out.println("1번 문제 ");
        String ssn = "991231-1234567";

        char a = ssn.charAt(7);
        System.out.println(a);

        // ex -2. 아래의 문자열에서 "홍길동"의 인덱스를 출력. 만약에 "홍길동"이 없는 배열의 경우에는 -1을 출력.

        System.out.println("2번 문제");
        String[] names = { "오쌤", "John", "Jane", "홍길동" };
        
        int index = -1;
        for (int i = 0 ; i < names.length; i++) {
            if(names[i].equals("홍길동")) {
                index = i;
                break;
            }
        } System.out.println(index);
        

        // ex -3. 아래의 문자열 배열에서 5글자이상인 문자열들만 출력
        String[] languages = { "Java", "SQL", "JavaScript", "Python" };
        
        System.out.println("3번 문제");
        for (int i = 0; i < languages.length; i++) {
            String five = languages[i];
            if (five.length() >= 5) {
                System.out.println(five);
            }
        }
        
        System.out.println("33 diet");
        for (String s : languages) {
            if (s.length() >= 5) {
                System.out.println(s);
            }
        }

        // ex -4. 아래의 문자열 배열에서 대소문자 구별 없이 "est"를 포함하는 문자열들을 출력.
        String[] tests = { "TEST", "TEst", "teST", "test", "테스트" };
        System.out.println("4번 문제");
        for (int i = 0; i < tests.length; i++) {
            String est = tests[i];
            String estLower = est.toLowerCase();
            if (estLower.contains("est")) {
                System.out.println(est);
            }

        }
        
        System.out.println("44 diet");
        for (String s : tests) {
            if (s.toLowerCase().contains("est")) {
                System.out.println(s);
            }
        }

        // ex -5. 아래의 "YYYY-MM-DD" 형식의 날짜 문자열에서 년/월/일 정보를 int 타입 변수에 저장하고 출력
        
        String date = "2022-09-07";
        System.out.println("5번 문제");
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
    
        
        System.out.println(year +" " + month + " " + day);
        
    
        
        
        System.out.println("split");
        
        String[] array = date.split("-"); // - 를 앞뒤로 문자열을 나누어서 배열로 만듬
        System.out.println(array[0] + "," + array[1] + "," + array[2]);
        int ye = Integer.parseInt(array[0]);
        int mo = Integer.parseInt(array[1]);
        int da = Integer.parseInt(array[2]);
        
        System.out.println(ye +" " + mo + " " + da);
    }

}
