package edu.java.loop09;

import java.util.Random;

public class LoopMain09 {

    
        public static void main(String[] args) {
            Random random = new Random();
            int x = random.nextInt(1, 6);
            
            double r = Math.random(); // <- double 타입의 난수를 만들어줌. 0.0 <= r < 1.0
            System.out.println(r);
            
            r = 6 * r + 1;
            System.out.println(r);
            
            int z = (int) r;
            System.out.println(z);
            
            }
        }

