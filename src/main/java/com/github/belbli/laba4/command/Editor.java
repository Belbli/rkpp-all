package com.github.belbli.laba4.command;

public class Editor {
    private StringBuilder buffer;
    private String clipboard;

    public Editor(String buffer) {
        this.buffer = new StringBuilder(buffer);
    }

    public StringBuilder getBuffer() {
        return buffer;
    }

    public void appendBuffer(String buffer) {
        this.buffer.append(buffer);
        System.out.println("Buffer : " + this.buffer);
    }

    public void eraseLastChar() {
        this.buffer.deleteCharAt(buffer.capacity());
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
