package org.example;

public class youtubeVideo extends video{

    public youtubeVideo(videoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }

}
