package edu.java.array01;

public class ArrayMain01 {

    public static void main(String[] args) {
        // 배열(array)의 필요성
        int score1 = 100;
        int score2 = 29;
        int score3 = 67;
        int total = score1 + score2 + score3;
        double average = (double) total / 3;
        System.out.println("평균 = " + average);
        // => 변수값이 많아질수록 복잡해진다는 단점.

        // 배열(array) : 같은 타입의 데이터 여러개를 하나의 변수 이름으로 저장하기 위한 메모리 공간
        // 인덱스(index) : 배열에 데이터를 저장하거나, 저장된 값을 읽어올 때 사용하는 번호.
        // 배열의 인덱스는 0부터 시작하는 연속된 정수.
        // 배열의 마지막 인덱스는 (배열 원소 개수 - 1).

        // 배열 선언/사용 방법 1: 데이터타입[] 변수이름 = new 데이터타입[인덱스 개수]
        // 어떤 타입의 값들을 몇 개까지 저장하는 배열인지 선언
        int[] scores = new int[4]; // int 타입의 값들을 4개 까지 저장하는 scores 라는 이름의 배열
        scores[0] = 10; // 0번 인덱스에 숫자 10을 저장
        scores[1] = 5; // 1번 인덱스에 숫자 5를 저장
        scores[2] = 8; // 2번 인덱스에 숫자 8을 저장
        scores[3] = 3; // 3번 인덱스에 숫자 3을 저장

        System.out.println(scores[0]); // 배열이름[인덱스]
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        // =
        System.out.println(
                "==============================================================================================================");

        for (int i = 0; i < scores.length; i++) { // 배열이름.length : 배열이 갖고있는 Index의 수
            System.out.println(scores[i]);
        }
        System.out.println(
                "==============================================================================================================");

        // 배열 선언/사용 방법 2: 배열의 원소들을 나열하면서 배열을 초기화
        int[] numbers = { 1, 3, 5, 7, 9 }; // 데이터타입[] 변수이름 = new { 배열에 초기화 되는 원소들 나열 }

        for (int o = 0; o < numbers.length; o++) {
            System.out.println(numbers[o]);
        }
        System.out.println(
                "==============================================================================================================");

        // 역순으로 출력하기
        for (int o = numbers.length - 1; o >= 0; o--) {
            System.out.println(numbers[o]);
        }
        System.out.println(
                "==============================================================================================================");

        // 향상된 for 문 (enhanced for statemet). for-each 문장
        for (int n : numbers) { // (배열이 가진 데이터 타입과 같은 데이터 타입의 변수 선언 : 배열의 이름)
                                // 배열의 첫번째 원소(1)를 변수에 저장 > 실행문 실행
                                // 실행문 종료 후 원소의 두번째 원소(2)를 변수에 저장 > 실행문 실행
                                // .... 원소의 마지막 원소가 저장된 실행문이 실행하고 나면 종료
            System.out.println(n);
        }

    }

}
