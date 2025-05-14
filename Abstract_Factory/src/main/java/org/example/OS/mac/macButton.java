package org.example.OS.mac;

import org.example.Button;

public class macButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button");
    }
}
