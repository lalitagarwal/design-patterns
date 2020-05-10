package com.design.patterns.behavioral.memento.exercise;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    public List<DocumentState> contents = new ArrayList<DocumentState>();

    public void push(DocumentState documentState) {
        contents.add(documentState);
    }

    public DocumentState pop() {
        var lastIndex = contents.size() - 1;
        var lastItem = contents.get(lastIndex);
        contents.remove(lastItem);
        return lastItem;
    }
}
