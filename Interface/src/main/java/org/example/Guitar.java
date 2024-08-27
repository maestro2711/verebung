package org.example;

public class Guitar implements Noise {
    @Override
    public void makeNoise() {
        System.out.println("Guitar Sounds");
    }
}
