package com.design.patterns.behavioral.command.undoCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<CommandUndoable> undoableList = new ArrayDeque<>();

    public void push(CommandUndoable command) {
        undoableList.add(command);
    }

    public CommandUndoable pop() {
        return undoableList.pop();
    }

    public int size() {
        return undoableList.size();
    }
}
