package com.design.patterns.behavioral.command.undoCommand;

import com.design.patterns.behavioral.command.framework.Command;

public class CommandUndo implements Command {
    private History history;

    public CommandUndo(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() >= 1) {
            history.pop().unexecute();
        }
    }
}
