package org.Seminar5.classTask1;

import org.Seminar5.classTask1.model.Presenter;
import org.Seminar5.classTask1.model.SumModel;
import org.Seminar5.classTask1.model.View;

public class Main {
    public static void main(String[] args) {

        Presenter presenter = new Presenter(new View(), new SumModel());
        presenter.buttonClick();
    }
}
