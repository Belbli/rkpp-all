package com.github.belbli.laba4.command;

public abstract class Command {
    private Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    abstract void execute();

    protected Editor getEditor() {
        return editor;
    }
}
