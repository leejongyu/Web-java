package edu.java.modifier04;


public class Member {

    // field : 아이디, 비밀번호
    
    private String id;
    private String pw;
    
    
    // constructor
    public Member(String id, String pw) {
        
        this.id = id;
        this.pw = pw;
    }
    
    // getter/ setter method
    public String getId() {
        return this.id;
    }
    
    public String getPw() {
        return this.pw;
    }
    
    public void setPw(String pw) {
        this.pw = pw;
    }
    
}
