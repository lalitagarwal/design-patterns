package com.design.patterns.behavioral.command.compositeCommand;

public class CompositeCommandMain {

    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
