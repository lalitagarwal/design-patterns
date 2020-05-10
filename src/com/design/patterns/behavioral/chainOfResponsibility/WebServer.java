package com.design.patterns.behavioral.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HTTPRequest httpRequest) {
        handler.handle(httpRequest);
    }
}
