package org.Seminar6.classTask1;

import org.Seminar6.classTask1.model.Text;
import org.Seminar6.classTask1.model.TextAppender;
import org.Seminar6.classTask1.model.TextPrinter;
import org.Seminar6.classTask1.model.Word;
import org.Seminar6.classTask1.model.WordDeleter;
import org.Seminar6.classTask1.model.WordReplacer;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Мама мыла раму");
        Word word = new Word("раму");
        Word word1 = new Word("руки");
        WordReplacer wordReplacer = new WordReplacer();
        WordDeleter wordDeleter = new WordDeleter();
        TextAppender textAppender = new TextAppender();
        TextPrinter textPrinter = new TextPrinter();

        textPrinter.printText(text);
        Text text1 = new Text(wordReplacer.replaceWordInText(text, word,word1).getText());
        textPrinter.printText(text1);
        Text text2 = new Text(wordDeleter.deleterWordInText(text1, word1).getText());
        textPrinter.printText(text2);
        Text text3 = new Text(textAppender.appendText(text2, new Text(word.getWord())).getText());
        textPrinter.printText(text3);
    }
}
