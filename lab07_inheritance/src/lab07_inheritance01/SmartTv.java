package lab07_inheritance01;

// Smart TV is a TV
// BasicTv = super class
// SmartTv = sub class

//super class에서 private으로 해놓은 것들은 sub class에서 확인할 수 없음

public class SmartTv extends BasicTv{

    // field(속성)
    
    private String ip;

    
    
    
    // method
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
    

    
}
