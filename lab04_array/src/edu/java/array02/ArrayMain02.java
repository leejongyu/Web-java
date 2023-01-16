package edu.java.array02;

public class ArrayMain02 {

    public static void main(String[] args) {
        // 문자열 3개를 저장할 수 있는 배열 선언
        String[] subjects = new String[3]; // subject라는 이름에 3개의 인덱스가 있는 String 타입의 배열

        // 배열에 문자열들을 저장
        subjects[0] = "Java";
        subjects[1] = "SQL";
        subjects[2] = "HTML";

        // 배열에 저장된 문자열들을 순서대로 출력
        // 1) for 문 사용
        for (int a = 0; a < subjects.length; a++) {
            System.out.print(subjects[a] + "\t");
        }
        System.out.println();
        System.out.println(
                "==============================================================================================================");

        // 2) for-each문 사용
        for (String i : subjects) { // 변수 타입 = 배열 데이터 타입. 변수 초기화 X.
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println(
                "==============================================================================================================");

        String[] names = { "lee", "kim", "park", "choi" };
        for (String n : names) {
            System.out.print(n + "  ");
        }
        System.out.println();
        System.out.println(
                "==============================================================================================================");
        // boolean 5개를 저장할 수 있는 배열을 선언
        boolean[] boolArray = new boolean[5];
//    = boolean[] boolArray = {false, false, false, false, false} ;
        // for문을 사용해서 짝수 인덱스에는 true, 홀수 인덱스에는 false를 저장.
        for (int a = 0; a < boolArray.length; a++) {
            if (a % 2 == 1) {
                boolArray[a] = false;
            } else {
                boolArray[a] = true;
            }
        }
        // for-each 문을 사용해서 배열의 내용을 출력
        for (boolean b : boolArray) { // boolean b = 해당 for문에서만 사용 가능한 지역변수 
            if (b == true) {
                System.out.println("참");
            } else {
                System.out.println("거짓");
            }
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");

        // for-each 구문은 배열의 원소를 변경할 수 없음. > 출력 용도로만 사용

        int[] array = {2, 4, 6, 8};
        for (int x : array) {
            x +=1; // 배열의 원소를 변경하는게 아니라, 변수 x의 값을 변경시킴
        }
        for (int x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
        System.out.println(
                "==============================================================================================================");

        // 배열의 원소를 변경하려면 for문을 사용해야 함.(index를 변경 해야 함)
        for (int i =0; i < array.length ; i++) {
            array[i] += 1; // array의 인덱스 i번째 원소의 값에 1을 더함.
        }
        for (int x : array) {
            System.out.println(x + " ");
        }
        
    }
}
