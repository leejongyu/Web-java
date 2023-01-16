package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import edu.java.file06.Product;


public class FileMain07 {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
 
        String filename = "data/product_list.dat";

        // Product 타입의 객체를 백만개 생성. ArrayList에 저장.
        // ArrayList의 내용을 product_list.dat 파일에 write. = 시간 측정
        long start = System.currentTimeMillis();
        try (FileOutputStream out = new FileOutputStream(filename);
                BufferedOutputStream bout = new BufferedOutputStream(out);
                ObjectOutputStream oout = new ObjectOutputStream(bout);) {
            
            for (int i = 0; i < 1000000; i++) {
                products.add(new Product(i, "name" + i, i));
            }
            
            System.out.println(products.get(987548)); 
            oout.writeObject(products);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
 
        // product_list.dat 파일에서 데이터를 읽어서 ArrayList 타입으로 변환 - 시간 측정
        long starttime = System.currentTimeMillis();
        try (FileInputStream in = new FileInputStream(filename);
                BufferedInputStream bin = new BufferedInputStream(in);
                ObjectInputStream oin = new ObjectInputStream(bin);) {
            
            ArrayList<Product> list = (ArrayList<Product>) oin.readObject();
            
            
            System.out.println(list.get(987548)); 
            long end = System.currentTimeMillis();
            System.out.println(end - starttime);
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }

    }

}
