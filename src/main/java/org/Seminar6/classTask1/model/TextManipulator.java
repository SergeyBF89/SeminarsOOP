package org.Seminar6.classTask1.model;

public class TextManipulator {
    private String text;

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }


    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        } return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        } return text;
    }

    public void printText() {
        System.out.println(getText());
    }
}