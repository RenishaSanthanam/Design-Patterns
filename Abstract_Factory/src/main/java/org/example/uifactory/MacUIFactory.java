package org.example.uifactory;

import org.example.Button;
import org.example.CheckBox;
import org.example.OS.mac.macButton;
import org.example.OS.mac.macCheckBox;

public class MacUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new macButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new macCheckBox();
    }
}
