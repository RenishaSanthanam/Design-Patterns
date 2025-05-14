package org.example.OS.win;

import org.example.Button;

public class winButton implements Button {
    @Override
    public void click() {
        System.out.println("Window's Button");
    }
}
