package edu.java.mvc.model;

// Model, VO(Value Object) , DTO(Data Transfer Object)
public class Member {

    // field
    private String memberid;
    private String memberpw;

    // constructor

    public Member() {
    }

    public Member(String memberid, String memberpw) {
        this.memberid = memberid;
        this.memberpw = memberpw;
    }

    
    
    // getter
    public String getMemberid() {
        return memberid;
    }
    public String getMemberpw() {
        return memberpw;
    }

    
    // setter
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }
    public void setMemberpw(String memberpw) {
        this.memberpw = memberpw;
    }

    @Override
    public String toString() {
        return String.format("(아이디 : %s , 비밀번호 : %s)", memberid, memberpw);
    }
    
    
    
}
