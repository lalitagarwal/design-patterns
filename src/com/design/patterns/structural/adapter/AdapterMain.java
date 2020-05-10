package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.avaFilters.Caramel;

public class AdapterMain {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

        //Or another way
        imageView.apply(new CaramelAdapter());
    }
}
