package edu.java.datetime;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class DateTimeMain {

    public static void main(String[] args) {

        // Java 8 버전에서 새로 생긴 날짜/시간 관련 클래스(java.time 패키지)
        LocalDate today = LocalDate.now(); // 현재 날짜
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth()); // Month enum을 리턴
        System.out.println(today.getMonthValue()); // Month int를 리턴
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.plusDays(1));
        System.out.println(today.minusDays(1));

        LocalDate date = LocalDate.of(2022, 02, 27);
        System.out.println(date);
        System.out.println(date.plusDays(777));

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        
        // Timestamp : 1970-01-01 00:00:00 을 기준으로 1/1000 (1 milli-second)마다 1씩 증가하는 정수(long 타입)를 기반으로 날짜/시간 정보를 저장하는 클래스.
        
        // 1. LocalDateTime --> Timestamp 변환
        Timestamp ts = Timestamp.valueOf(now);
        System.out.println(ts);
        
        // 2. Timestamp --> LocalDateTime 변환
        LocalDateTime dt = ts.toLocalDateTime();
        System.out.println(dt);
    }
}