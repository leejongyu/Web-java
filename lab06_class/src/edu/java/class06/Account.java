package edu.java.class06;

public class Account {

    int accountNo; // 계좌번호
    double balance; // 잔고

    // 매개변수 = 파라미터 = 생성자 괄호 안에서 선언하는 변수
    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }


    
    /**
     * 입금
     * 
     * @param a 입금할 금액
     * @return 입금 후 잔액을 리턴
     */
    public double deposit(double a) {
        balance += a;
        return balance;
    }
//
//    public void depositAfter(double a) {
//        balance = balance + a;
//        System.out.println("계좌번호 : "+ this.accountNo + "(입금 + " + a + ") = 거래 후 잔액 : " + balance);
//    }

    /**
     * 출금
     * 
     * @param a
     * @return
     */
    public double withdraw(double a) {
        balance -= a;
        return balance;
    }

//    public void withdrawAfter(double a) {
//        balance = balance - a;
//        System.out.println("계좌번호 : "+ this.accountNo + "(출금 - " + a + ") = 거래 후 잔액 : " + balance);
//    }
    
    /**
     * to 이체할 계좌 객체(Account type), 이체할 금액
     * 
     * @return 이체 성공(true)
     */
    public boolean transfer(Account accountNo, double a) {
        if (this.balance >= a) {
            this.balance -= a;
            accountNo.balance += a;
            System.out.println("---------------------\n" +a + "원 이체 성공\n---------------------");
            return true;
        } else {
            System.out.println("---------------------\n이체 실패 : 잔액부족\n---------------------");
            return false;
        }

    }

    public boolean transferAnswer(Account to, double a ) {
//        this.balance -= a;
//        to.balance += a;
        this.withdraw(a);
        to.deposit(a);
        return true;
    }
    
    /**
     * 계좌 정보 출력 (printAccountInfo). 계좌번호와 잔액을 출력
     */
    public void printAccountInfo() {
        System.out.println("----계좌 정보----\n계좌번호 : " + this.accountNo + "\n잔액 : " + this.balance);

    }

//    public void transferAfter(Account accountNo, double a) {
//        accountNo.balance = accountNo.balance + a;
//        this.balance = this.balance - a;
//
//        System.out.println(this.accountNo + "에서 " + accountNo.accountNo + "(으)로 [" + a + "]원을 이체하였습니다.");
//        System.out.println(this.accountNo + " 잔액 : " + this.balance + "원");
//        System.out.println(accountNo.accountNo + " 잔액 : " + accountNo.balance + "원");
//    }

}
