package com.github.belbli.laba4.command;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        Editor editor = getEditor();
        editor.appendBuffer(editor.getClipboard());
    }
}
