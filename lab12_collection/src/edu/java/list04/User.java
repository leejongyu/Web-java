package edu.java.list04;

public class User {
    private String id;
    private String pw;

    public User() {

    }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }
    public String getPw() {
        return pw;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    
    @Override
    public String toString() {
        return String.format("회원 id = %s , 회원 번호 = %s",id, pw);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return this.id.equals(user.id);
        }
        return false;
    }
    
    
    @Override
    public int hashCode() {
     
        return id.hashCode();
    }
    
}
