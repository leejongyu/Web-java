package lab07_inheritance01;

public class BasicTv {
    // field

    private boolean powerOn;
    private int channel;
    private int volume;

    // constructor

    // method

    public boolean isPowerOn() {
        return powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * TV의 전원을 켜거나 끄는 메서드. TV의 현재 전원이 OFF이면 ON으로, ON이면 OFF로 변경.
     * 
     * @return 전원 on이면 true, off이면 false를 리턴
     */
    public boolean powerOnOff() {
        if (powerOn) { // TV가 켜져 있으면
            powerOn = false;
            System.out.println("TV OFF .");
        } else { // TV가 꺼져 있으면
            powerOn = true;
            System.out.println("TV ON .");
        }
        return powerOn;
    }

}
