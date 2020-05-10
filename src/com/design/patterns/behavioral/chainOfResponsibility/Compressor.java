package com.design.patterns.behavioral.chainOfResponsibility;

public class Compressor extends Handler{
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest httpRequest) {
        System.out.println("Compressor");
        return false;
    }
}
