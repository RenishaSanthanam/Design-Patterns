package org.example;

public class Main {
    public static void main(String[] args) {
        video youtubeVideo = new youtubeVideo(new HDProcessor());
        youtubeVideo.play("file.mp4");
        video netflixVideo = new netflixVideo(new HD4Kprocessor());
        netflixVideo.play("file.mp3");
    }
}