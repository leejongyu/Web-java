package edu.java.file04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * HDD의 File => FileInoutStream => BufferedInputStream => 프로그램
 * FIS : HDD에 저장된 파일을 읽고 메모리(RAM)에 적재.
 * BIS : 메모리(RAM)에 있는 파일에서 데이터를 읽는 .read()메서드를 제공.
 * 
 * 프로그램 => BufferedOutputStream => FileOutputStream => HDD
 * FOS : HDD에 데이터를 출력.
 * BID : 메모리(RAM)에 데이터를 출력하는 .write()메서드를 제공.
 */

public class FileMain04 {

    public static void main(String[] args) {

     FileInputStream in = null; // HDD에서 데이터를 읽기 위한 통로
     BufferedInputStream bin = null; // 메모리 파일에서 데이터를 읽기 위한 통로
    
     FileOutputStream out = null; // HDD에 데이터를 출력하기 위한 통로
     BufferedOutputStream bout = null; // 메모리 파일에 데이터를 출력하기 위한 통로
        
     
     try {
        in = new FileInputStream("data/ratings.dat");
        bin = new BufferedInputStream(in); // file input 데이터를 input
        out = new FileOutputStream("data/ratings_copy3.dat");
        bout = new BufferedOutputStream(out);
        
        long stime = System.currentTimeMillis();
        
        while (true){
            byte[] buffer = new byte[4 * 1024];
            int result = bin.read(buffer);
            if (result == -1) {
                break;
            }
            
            bout.write(buffer, 0, buffer.length);
            
        }
        
        long etime = System.currentTimeMillis();
        
        
        System.out.println(etime - stime);
        
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } finally {
        try {
            // 가장 마지막에 생성된 InputStream과 OutputStream만 close 하면 
            // 다른 Stream 객체들은 자동으로 close가 됨.
            bin.close(); // bin을 close하면 bin이 사용하는 in은 자동으로 close
            bout.close(); // bout을 close하면 bout이 사용하는 out은 자동으로 close
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    }

}
