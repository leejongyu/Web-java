package edu.java.thread02;

public class ThreadMain02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//      (1) Runnable을 구현하는 클래스 생성

        class MySecondClass implements Runnable {

            private String name;

            public MySecondClass(String name) {
                this.name = name;
            }

//      (2) run 메서드 재정의 (Thread가 할 일을 재정의) 
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i + "번째 " + name);

                    try {
                        Thread.sleep(10/7);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }

        } // end Thread Class

//      (3) Runnable 타입 객체 생성  
        MySecondClass process1 = new MySecondClass("런타임");

//      (4) Thread 타입 객체 생성
        Thread th1 = new Thread(process1);

        Thread th2 = new Thread(new MySecondClass("쓰레드"));

//      (4-1) Runnable을 구현하는 익명클래스를 이용한 Thread 객체 생성
        Thread th3 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i + "번째 익명");

                    try {
                        Thread.sleep(10/8);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });

//      (4-2) Lambda를 이용한 객체 생성

        Thread lambda = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i + "번째 람다");
                try {
                    Thread.sleep(10/6);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                
            }
        }).start();
        
        
//      (5) Thread 실행
        th1.start();
        th2.start();
        th3.start();
        lambda.start();
        try {
            th1.join();
            th2.join();
            th3.join();
            lambda.join();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("둥");
        }

    } // end main

} // end class
