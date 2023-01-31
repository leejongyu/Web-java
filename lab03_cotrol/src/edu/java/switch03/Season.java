package edu.java.switch03;

// 열거형 타입 (enumeration type) : 한정된 값(상수)들만을 갖는 Date type
// ex) 계절 (봄 여름 가을 겨울) , 식사 시간 (아침, 점심, 저녁), 요일 (일, 월, 화, 수, 목, 금, 토)

public enum Season { // enum의 이름이 데이터타입 
    SPRING, SUMMER, FALL, WINTER; // 한정된 값을 열거. 관습적으로 전체를 대문자로 사용
                                // 내부적으로 데이터 값은 순서대로 0, 1, 2, 3 으로 저장
                                // 변수를 숫자로 시작할 수 없기에 숫자 사용은 안됨
                                // s.ordinal(0) - 봄
                                // s.ordinal(1) - 여름
                                // s.ordinal(2) - 가을
                                // s.ordinal(3) - 겨울 ...
} 
