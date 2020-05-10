package com.design.patterns.behavioral.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("A", new JPEGCompressor(), new BlackAndWhiteFilter());

        //Easy to change it now
        imageStorage.store("B", new PNGCompressor(), new BlackAndWhiteFilter());
    }
}
