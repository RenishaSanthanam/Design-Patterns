package org.example;

public class netflixVideo extends video{
    public netflixVideo(videoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }
}
