package edu.java.file09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class FileMain09 {

    public static void main(String[] args) {

        String ansiFile = "data/ansi.txt";
        String utf8File = "data/utf8.txt";

        // 1. Java 8 버전에서의 문자스트림 사용 방법:

        try (FileInputStream in = new FileInputStream(ansiFile); // > FIS로 바이트로 인코딩
                InputStreamReader reader = new InputStreamReader(in, "EUC-KR"); // > 전환한 파일을 문자단위로 read. EUC-KR로 인코딩 설정
                BufferedReader buffer = new BufferedReader(reader); // BufferedReader 
        ) {

            while (true) {
                int read = buffer.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("===========");
        try (FileInputStream in = new FileInputStream(utf8File); // > FIS로 바이트로 인코딩
                InputStreamReader reader = new InputStreamReader(in, "UTF-8");) { // > 전환한 파일을 문자단위로 read. UTF-8로 인코딩 설정
            BufferedReader buffer = new BufferedReader(reader); // BufferedReader는 readLine()도 있다.
            while (true) {
                int read = buffer.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("===========");
        
     // 2. Java 11 버전부터 바뀐 FileReader 사용 방법:
        try (
                FileReader reader = new FileReader(ansiFile, Charset.forName("EUC-KR"));
                BufferedReader buffer = new BufferedReader(reader);
        ) {
            while (true) {
                String read = buffer.readLine();
                if ( read == null) {
                    break;
                }
                System.out.println(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        System.out.println();
        System.out.println("===========");
        
        try( FileReader reader = new FileReader(utf8File, Charset.forName("UTF-8"));
                BufferedReader buffer = new BufferedReader(reader);
                ) {
            while (true) {
                String read = buffer.readLine();
                if (read == null) {
                    break;
                }
                System.out.println(read);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
    } // end main

}
