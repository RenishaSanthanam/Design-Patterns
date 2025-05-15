package org.example;

public class HD4Kprocessor implements videoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(videoFile + " playing in HD4K");
    }
}
