package org.Seminar6.classTask1.model;

public class TextAppender {
    public Text appendText(Text currentText, Text newText) {
        return new Text(currentText.getText() + newText.getText());
    }
}
