package com.github.belbli.laba4.bridge;

public class Device {
    private Boolean isTurnedOn = false;
    private Integer volume = 50;
    private Integer channel = 1;

    public Boolean getTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(Boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public Integer getVolume() {
        return volume;
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }
}
