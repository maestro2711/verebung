package org.example;

public class Plane implements Noise {
    @Override
    public void makeNoise() {
        System.out.println("Loud Plane Sounds");
    }
}
