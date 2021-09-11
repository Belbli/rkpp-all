package com.github.belbli.laba4.bridge;

public class BasicRemote implements Remote {
    private Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.setTurnedOn(true);
        System.out.println("Device is active");
    }

    @Override
    public void turnOff() {
        device.setTurnedOn(false);
        System.out.println("Device isn't active");
    }

    @Override
    public void changeChannel(int channel) {
        if (device.getTurnedOn()) {
            device.setChannel(channel);
            System.out.println("Channel changed to " + channel);
        }
    }

    @Override
    public void volumeUp() {
        if (device.getTurnedOn()) {
            device.volumeUp();
            System.out.println("Volume increased");
        }
    }

    @Override
    public void volumeDown() {
        if (device.getTurnedOn()) {
            device.volumeDown();
            System.out.println("Volume decreased");
        }
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
