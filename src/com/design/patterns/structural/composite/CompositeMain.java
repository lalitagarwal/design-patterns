package com.design.patterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); //square
        group1.add(new Shape()); //square

        var group2 = new Group();
        group2.add(new Shape()); //circle
        group2.add(new Shape()); //circle

        var group = new Group();
        group.add(group1); //square group
        group.add(group2); //circle group
        group.render();
        group.move();
    }
}
