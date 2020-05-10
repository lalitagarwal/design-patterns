package com.design.patterns.behavioral.command.undoCommand;

public interface CommandUndoable {
    void execute();
    void unexecute();
}
