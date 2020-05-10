package com.design.patterns.behavioral.command;

import com.design.patterns.behavioral.command.framework.Button;

public class CommandMain {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
