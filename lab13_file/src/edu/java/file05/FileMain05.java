package edu.java.file05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain05 {

    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("data/test.txt");
                FileOutputStream out = new FileOutputStream("data/test03.txt");) {
            while (true) {
                int read = in.read();
                if (read == -1) {
                    break;
                }
                out.write(read);
            }

        } catch (Exception e) {

        }

    }

}
