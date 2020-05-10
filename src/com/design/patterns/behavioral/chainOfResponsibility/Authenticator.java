package com.design.patterns.behavioral.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest httpRequest) {
        var isValid = (httpRequest.getUsername() == "" && httpRequest.getPassword() == "");
        System.out.println("Authentication");
        return !isValid;
    }
}
