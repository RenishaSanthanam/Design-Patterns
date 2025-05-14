package org.example.uifactory;

import org.example.Button;
import org.example.CheckBox;

public interface UIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
