package edu.java.mvc.controller;

import edu.java.mvc.model.Member;

// Controller. DAO(Data Access Object)
// 인터페이스를 구현하는 클래스
public class MemberDaoImpl implements MemberDao {

    // Member 객체를 저장할 배열의 최대 크기
    public static final int MAX_LENGTH = 3;

    // Member 객체들을 저장할 배열
    private Member[] memberList = new Member[MAX_LENGTH];

    // 배열에 저장된 Member 객체의 개수. 멤버 객체가 배열에 저장 될 때마다 1씩 증가
    private int count = 0;

    // Controller 클래스는 Singleton으로 설계

    // 1) private static 변수 선언 (타입 = 클래스이름)
    private static MemberDaoImpl instance = null;

    // 2) private 생성자
    private MemberDaoImpl() {
    }

    // 3) 자기 자신 타입을 리턴하는 public static 메서드 정의.
    public static MemberDaoImpl getInstance() {
        if (instance == null) {
            instance = new MemberDaoImpl();
        }
        return instance;
    }

    @Override
    public int create(Member m) { // Member 타입의 객체를 배열의 인덱스에 저장
        if (count >= MAX_LENGTH) {
            return 0;
        } else {
            memberList[count] = m;
            count++;
            return 1;
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public Member[] read() {
        // 멤버 리스트를 그대로 리턴하지 말고
        // 실제 저장된 Member 개수(= count)만큼만 배열을 새로 생성해서 리턴
        Member[] members = new Member[count]; // 원본 배열에서 복사 할 배열을 생성

        for (int i = 0; i < count; i++) {
            members[i] = memberList[i];
        }

        return members;

    }

    @Override
    public Member read(int index) {

        if (index >= 0 && index < MAX_LENGTH) {
            return memberList[index];
        } else {
            return null;
        }
    }

    @Override
    public int update(int index, String pw) {
        // FIXME : NullPointException

        if (index >= 0 && index < count) {
            memberList[index].setMemberpw(pw);
            return 1;
        } else {
            return 0;
        }
    }

}
