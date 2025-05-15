package org.example;

public class HDProcessor implements videoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(videoFile + " playing in HD");
    }
}
