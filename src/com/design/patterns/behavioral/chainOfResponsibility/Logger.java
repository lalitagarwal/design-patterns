package com.design.patterns.behavioral.chainOfResponsibility;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest httpRequest) {
        System.out.println("Log");
        return false;
    }
}
