package edu.java.file01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;

/*
 * Input / Output Stream : 프로그램이 값(데이터)을 입력/ 출력되는 통로.
 * 입력장치(키보드, 마우스, 터치스크린, 파일 ...) => InputSteram => 프로그램
 * 프로그램 => OutputStream => 출력장치 (모니터, 프린터, 스크린, 파일 ...)
 *
 * 파일 == > FileInputStream ==> 프로그램
 * 프로그램 ==> FileOutputStream ==> 파일
 * 
 * 
 */

public class FileMain01 {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // data 폴더에 있는 test.txt 파일을 읽기 위한 스트림 객체 생성.
            in = new FileInputStream("data/test.txt");

            // data 폴더에 test_copy.txt 파일을 쓰기위한 스트림 객체 생성.
            out = new FileOutputStream("data/test_copy.txt");

            long startTime = System.currentTimeMillis();
            while (true) {
                int read = in.read(); // 읽기 - 파일에서 1 바이트씩 읽음
                System.out.println(read + ":" + (char) read);

                if (read == -1) {
                    break;
                }

                out.write(read); // 쓰기 - 파일에서 1 바이트씩 출력

            }
            long endTime = System.currentTimeMillis();

            long copyTime = startTime - endTime;
            System.out.println(copyTime + " ms");
        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                in.close(); // FIS 객체 close
                out.close();// FOS 객체 close
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
