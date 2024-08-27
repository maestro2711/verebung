package org.example;

import static org.example.MediaController.playMedia;

public class Main {
    public static void main(String[] args) {

       /* Guitar guitar = new Guitar();
      Jigsaw jigsaw = new Jigsaw();
        Plane plane = new Plane();

        recordNoise(guitar);
        recordNoise(jigsaw);
        recordNoise(plane);

        Noise[] noises = {guitar,jigsaw,plane};*/



        ///  Playable Interface Initialization

        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();


        playMedia(musicPlayer);
        playMedia(videoPlayer);


        Playable[] playables = {musicPlayer,videoPlayer};


        MediaController mediaController = new MediaController();
        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);


    }

   /* public static void recordNoise(Noise noise){
        System.out.println("Recording started");
        noise.makeNoise();
        System.out.println("Recording ended");
    }*/



}