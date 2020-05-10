package com.design.patterns.behavioral.command.undoCommand;

public class HTMLDocument {
    String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
