package com.design.patterns.behavioral.command.compositeCommand;

import com.design.patterns.behavioral.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black And White");
    }
}
