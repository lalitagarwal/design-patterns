package com.design.patterns.behavioral.command;

import com.design.patterns.behavioral.command.framework.Command;

public class Button {
    private String label;

    public Button(Command command) {
        this.command = command;
    }

    private Command command;

    public void click() {
        command.execute();
    }
}
