package com.ironhack.helloworld.classes;

import com.ironhack.helloworld.interfaces.Playable;

public class ApplePlayer implements Playable {

    // EL MÄXIMO VOLUMEN = 1
    // Tener un currentVolume
    private final double MAX_VOLUME = 1;
    private final double MIN_VOLUME = 0;
    private double currentVolume;

    public ApplePlayer(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void play() {
        System.out.println("Playing in Apple");
    }

    public void pause() {
        System.out.println("Pausing in Apple");
    }

    public void increaseVolume(double volume) {
        // El volume que recibo por parámetro quiero que SOBREESCRIBA el valor de currentVolume
        // vigilando que no sea nunca mayor a MAXIMO VOLUMEN Ni que sea menor a cero
        if(volume <= MAX_VOLUME && volume >= MIN_VOLUME) {
            currentVolume = volume;
        }
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    }
}
