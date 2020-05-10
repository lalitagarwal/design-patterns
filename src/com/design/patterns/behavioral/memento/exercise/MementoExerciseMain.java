package com.design.patterns.behavioral.memento.exercise;

public class MementoExerciseMain {

    public static void main(String[] args) {
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();

        document.setContent("A");
        history.push(document.createState());

        document.setContent("B");
        history.push(document.createState());

        document.setContent("C");
        history.push(document.createState());

        document.recoverState(history.pop());
        System.out.println(document.getContent());
        document.recoverState(history.pop());
        System.out.println(document.getContent());
        document.recoverState(history.pop());
        System.out.println(document.getContent());
    }
}
