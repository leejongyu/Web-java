package edu.java.class06;

public class ClassMain06 {

    public static void main(String[] args) {

        Account acc1 = new Account(1004, 720000);
        System.out.println(acc1);
        acc1.printAccountInfo();
        
        acc1.deposit(10000);
        acc1.printAccountInfo();
        
        acc1.withdraw(7000);
        acc1.printAccountInfo();
        
        Account acc2 = new Account(1002, 7000);
        
        acc2.transfer(acc1, 7000);
        acc1.printAccountInfo();
        acc2.printAccountInfo();

    }

}
