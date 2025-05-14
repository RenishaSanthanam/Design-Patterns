package org.example;

import org.example.uifactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void features(){
        button.click();
        checkBox.check();
    }
}
