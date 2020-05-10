package com.design.patterns.behavioral.command.undoCommand;

public class BoldCommand implements CommandUndoable {
    private String prevcontent;
    private HTMLDocument document;
    private History history;

    public BoldCommand(HTMLDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevcontent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevcontent);
    }
}
