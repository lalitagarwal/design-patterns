package com.design.patterns.behavioral.command.compositeCommand;

import com.design.patterns.behavioral.command.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
