package org.example.OS.win;

import org.example.CheckBox;

public class winCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Window's CheckBox");
    }
}
