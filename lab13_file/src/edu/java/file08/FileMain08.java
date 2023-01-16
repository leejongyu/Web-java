package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class FileMain08 {

    public static void main(String[] args) {
        String fileData = "data/student_file.dat";
        // Student를 저장하는 ArrayList를 선언, 생성.
        HashSet<Student> students = new HashSet<>();
        // ArrayList에 Student 객체 5개를 저장.
        Random rd = new Random();
        for (int a = 0; a < 5; a++) {
            Student student = new Student(rd.nextInt(12), "null"+ a,
                    new Score(rd.nextInt(100), rd.nextInt(100), rd.nextInt(100)));
   
            students.add(student);

        }
        // ArrayList를 파일에 write.
        try (FileOutputStream out = new FileOutputStream(fileData);
                BufferedOutputStream bout = new BufferedOutputStream(out);
                ObjectOutputStream oout = new ObjectOutputStream(bout);) {
 
            oout.writeObject(students);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 파일에서 ArrayList 객체를 read.

        try (FileInputStream in = new FileInputStream(fileData);
                BufferedInputStream bin = new BufferedInputStream(in);
                ObjectInputStream oin = new ObjectInputStream(bin);) {

            HashSet<Student> student2 = (HashSet<Student>) oin.readObject();

            Iterator<Student> itr = student2.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        } catch (Exception e) {

        }
        // ArrayList의 원소들을 한 줄씩 출력.

        for (Student st : students) {
            System.out.println(st);
        }
    }

}