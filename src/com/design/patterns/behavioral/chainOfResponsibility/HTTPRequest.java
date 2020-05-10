package com.design.patterns.behavioral.chainOfResponsibility;

public class HTTPRequest {
    String username;
    String password;

    public HTTPRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
