package org.example;

public abstract class video {

    protected videoProcessor videoProcessor;

    public video(videoProcessor videoProcessor){
        this.videoProcessor = videoProcessor;
    }

    public abstract void play(String videoFile);

}
