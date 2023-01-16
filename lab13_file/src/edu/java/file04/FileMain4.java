package edu.java.file04;

import java.io.FileReader;
import java.io.FileWriter;

public class FileMain4 {

    public static void main(String[] args) {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("data/fish.jpg");
            out = new FileWriter("data/doctorfish2.dat");

            while (true) {
                int result = in.read();
                if (result == -1) {
                    break;
                    
                }
                out.write(result);
            }
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
