package edu.java.file08;

import java.io.Serializable;

public class Student extends Score implements Serializable  {
    
    // field
    private int id;
    private String name;
    private Score score;

    // 생성자: (1) 기본 생성자, (2) argument가 3개인 생성자

    public Student() {
        
    }

    public Student(int id, String name, Score score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Score getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", score=" + score + "]";
    }
    
    
    // getters/setters

    // toString

}