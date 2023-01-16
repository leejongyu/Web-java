package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain02 {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("data/test.txt");
            out = new FileOutputStream("data/test_copy2.txt");

            long startTime = System.currentTimeMillis();

            while (true) {
//              .read(byte[] b) : 파일에서 읽은 데이터(바이트)를 byte 배열 b에 저장하고, 실제 읽은 바이트 수를 리턴
                byte[] buffer = new byte[20];
                int x = in.read(buffer); // 파일에서 읽은 데이터 개수(바이트 수)를 -1이 될 때 까지 리턴.
                if (x == -1) {
                    break;
                }
                
//              .write(byte[] b) : byte 배열 b의 내용을 그대로 파일에 write.
//              .write(byte[] b, int off, int len) : byte배열 b의 off index부터 len의 개수까지를 파일에 write.
                out.write(buffer);
                
            }
            long endTime = System.currentTimeMillis();

            long copyTime = endTime - startTime;
            
            System.out.println(copyTime+ " ms");

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

    }

}
