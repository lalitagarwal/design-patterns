package com.design.patterns.behavioral.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();
        browseHistory.push("A");
        browseHistory.push("B");
        browseHistory.push("C");

        var iterator = browseHistory.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
