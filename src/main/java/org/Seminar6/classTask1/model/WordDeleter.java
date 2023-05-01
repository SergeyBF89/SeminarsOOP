package org.Seminar6.classTask1.model;

public class WordDeleter {
    public Text deleterWordInText(Text text, Word newWordToDelete) {
        String inputText = text.getText();
        if (inputText.contains(newWordToDelete.getWord())) {
            inputText = inputText.replace(newWordToDelete.getWord(), "");
        }
        return new Text(inputText);
    }
}
