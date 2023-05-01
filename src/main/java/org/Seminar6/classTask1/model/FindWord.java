package org.Seminar6.classTask1.model;

public class FindWord {
    public Word findWord(Text text, Word word) {
        String[] textArr = text.getText().split(" ");
        for (String el : textArr) {
            if (el.equals(word)) {
                return word;
            }
        }
        return null;
    }
}
