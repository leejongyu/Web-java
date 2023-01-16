package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain04 {

    public static void main(String[] args) {

        // data folder의 ratings.dat file을 읽고 ratings_copy.dat file에 복사
        // read() write()의 시간과
        // read(byte[] b), write((byte[] b, int off, int len)을 사용 했을때의 복사 시간을 비교

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("data/ratings.dat");
            out = new FileOutputStream("data/ratings_copy");

            long startTime01 = System.currentTimeMillis();

            while (true) {
                int x = in.read(); // 파일을 1바이트씩 읽기
                if (x == -1) {
                    break;
                }
                out.write(x); // 1바이트씩 저장
            }
            long endTime01 = System.currentTimeMillis();

            long firstTime = endTime01 - startTime01;

            System.out.println("배열 사용 x = " + (firstTime/1000) + "초");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            in = new FileInputStream("data/ratings.dat");
            out = new FileOutputStream("data/ratings_copy2.dat");

            long startTime02 = System.currentTimeMillis();
            
            while (true) {
                byte[] buffer = new byte[4*1024]; // 1024 byte = 1kb 배열 생성
                int y = in.read(buffer); // 파일에서 buffer만큼 읽기 (4kb)
                if (y == -1) {
                    break;
                }
                out.write(buffer, 0, buffer.length); // 4kb씩 저장
            }
            
            long EndTime02 = System.currentTimeMillis();
            
            long secondTime = EndTime02 - startTime02;
            System.out.println("배열 사용 : " + (double)secondTime/1000 + " 초");
        } catch (Exception e) {

            e.printStackTrace();
        }

    } // end main

} // end class
