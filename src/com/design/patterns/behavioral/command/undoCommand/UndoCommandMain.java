package com.design.patterns.behavioral.command.undoCommand;

public class UndoCommandMain {
    public static void main(String[] main) {
        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        // 1st Way
        // boldCommand.unexecute();
        // System.out.println(document.getContent());

        // 2nd Way
        var undoCommand = new CommandUndo(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
