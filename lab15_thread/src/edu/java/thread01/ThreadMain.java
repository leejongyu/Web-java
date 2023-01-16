package edu.java.thread01;

/*
 * Thread 사용 방법 1
    Thread 클래스를 상속하는 클래스를 정의
        => run() 메서드를 override (thread가 할 일)
            => Thread 클래스의 객체를 생성
              => 생성된 객체에서 start() 메서드를 호출 -> thread 시작.
                 => ※ 생성된 객체의 run() 메서드를 직접 호출하면 thread 실행이 되지 않음
                 
 * 
 */

public class ThreadMain {

    public static void main(String[] args) {

 //     Thread 클래스를 상속하는 클래스를 정의
        class MyThead extends Thread {

            private String name;

            public MyThead(String name) {
                this.name = name;
            }
            
//      => run() 메서드를 override (thread가 할 일)
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i + "번째 " + name);

                    try {
                        sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        } // end MyThread

        
//       => Thread 클래스의 객체를 생성
        long n1 = System.currentTimeMillis();
        MyThead th1 = new MyThead("룰루랄라");
        MyThead th2 = new MyThead("닐리리야");

        // 익명 클래스를 이용한 thread 생성
        Thread anonymousThread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i + "번째 익명클래스 on");

                    try {
                        sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        };

        th1.start();
        th2.start();
        anonymousThread.start();

        try {
            th1.join(); // th1 쓰레드가 끝날 때 까지 기다리겠다..
            th2.join();
            anonymousThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(" 프로그램 종료 ");
        long n2 = System.currentTimeMillis();

        long cooltime = n2 - n1;

        System.out.println(cooltime);

    } // end main

} // end this.class
