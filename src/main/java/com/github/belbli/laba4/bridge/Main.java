package com.github.belbli.laba4.bridge;

public class Main {
    public static void main(String[] args) {
        Remote remote = new BasicRemote(new TV());
        remote.turnOn();
        remote.changeChannel(10);
        remote.volumeDown();
        remote.volumeUp();
        remote.turnOff();

        System.out.println("============================================");

        remote.setDevice(new Radio());
        remote.turnOn();
        remote.changeChannel(10);
        remote.volumeDown();
        remote.volumeUp();
        remote.turnOff();
    }
}
