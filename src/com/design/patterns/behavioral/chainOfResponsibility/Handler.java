package com.design.patterns.behavioral.chainOfResponsibility;

public abstract class Handler {
    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract boolean doHandle(HTTPRequest httpRequest);

    public void handle(HTTPRequest httpRequest) {
        if (doHandle(httpRequest)) {
            return;
        }

        if (next != null) {
            next.handle(httpRequest);
        }
    }
}
