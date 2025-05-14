package org.example.uifactory;

import org.example.Button;
import org.example.CheckBox;
import org.example.OS.win.winButton;
import org.example.OS.win.winCheckBox;

public class winUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new winButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new winCheckBox();
    }
}
