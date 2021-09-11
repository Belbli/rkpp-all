package com.github.belbli.laba4.bridge;

public interface Remote {
    void turnOn();

    void turnOff();

    void changeChannel(int channel);

    void volumeUp();

    void volumeDown();

    void setDevice(Device device);
}
