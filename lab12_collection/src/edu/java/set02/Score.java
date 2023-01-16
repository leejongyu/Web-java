package edu.java.set02;

public class Score {
    private int java;
    private int web;

    public Score() {

    }

    public Score(int java, int web) {
        this.java = java;
        this.web = web;
    }

    public int getJava() {
        return java;
    }

    public int getWeb() {
        return web;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public void setWeb(int web) {
        this.web = web;
    }

    @Override
    public String toString() {

        return String.format("<Java 점수 : %d, Web 점수 : %d>", this.java, this.web);
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Score) {
            
            Score s = (Score) obj;
            
            return (this.java == s.java) && (this.web == s.web);
            
        }
        return false; 
    }


    @Override
    public int hashCode() {
        
        return Integer.valueOf(java).hashCode() + Integer.valueOf(web).hashCode();
    }
    

}
