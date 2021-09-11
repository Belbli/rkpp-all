package com.github.belbli.laba4.command;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        Editor editor = getEditor();
        editor.setClipboard(editor.getBuffer().toString());
    }
}
