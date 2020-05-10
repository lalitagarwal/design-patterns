package com.design.patterns.behavioral.strategy;

public class JPEGCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing JPEG");
    }
}
