package org.example;

public class MediaController {

    public static void playMedia(Playable playable){
        playable.play();
        System.out.println("Playing media");
    }
}
