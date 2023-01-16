package edu.java.file06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileMain06 {

    public static void main(String[] args) {

        Product p = new Product(159024, "바나나 1", 1800);

        System.out.println(p);

        String filename = "data/product.dat";

        try (FileOutputStream out = new FileOutputStream(filename);
                ObjectOutputStream oout = new ObjectOutputStream(out);) {
            oout.writeObject(p);

        } catch (Exception e) {

        }

        try (FileInputStream in = new FileInputStream(filename); 
                ObjectInputStream oin = new ObjectInputStream(in);) {

            Object obj = oin.readObject();
            if (obj instanceof Product) {
                Product p2 = (Product) obj;
                System.out.println("="+p2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    } // end main

}
