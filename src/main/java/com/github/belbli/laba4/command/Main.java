package com.github.belbli.laba4.command;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor("");
        Command copy = new CopyCommand(editor);
        Command paste = new PasteCommand(editor);

        editor.appendBuffer("buffer text");
        copy.execute();
        paste.execute();
    }
}
