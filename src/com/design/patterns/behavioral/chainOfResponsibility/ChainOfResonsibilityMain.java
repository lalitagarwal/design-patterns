package com.design.patterns.behavioral.chainOfResponsibility;

public class ChainOfResonsibilityMain {
    public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var httpRequest = new HTTPRequest("", "");

        var server = new WebServer(authenticator);
        server.handle(httpRequest);
    }
}
