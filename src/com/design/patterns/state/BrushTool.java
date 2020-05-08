package com.design.patterns.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw line");
    }
}
