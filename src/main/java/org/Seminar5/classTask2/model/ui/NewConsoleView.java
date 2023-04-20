package org.Seminar5.classTask2.model.ui;

public class NewConsoleView extends ConsoleView {
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }
}
