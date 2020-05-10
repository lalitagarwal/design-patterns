package com.design.patterns.behavioral.strategy;

public class PNGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing PNG");

    }
}
