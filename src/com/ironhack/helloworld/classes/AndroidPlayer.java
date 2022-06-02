package com.ironhack.helloworld.classes;

import com.ironhack.helloworld.interfaces.CloudFeatures;
import com.ironhack.helloworld.interfaces.Playable;

public class AndroidPlayer implements Playable, CloudFeatures {

    // Cosntante de máximo volumen = 100
    // El Android Player va a tener una propiedad currentVolume
    private final double MAX_VOLUME = 100;
    private double currentVolume;

    public AndroidPlayer(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void play() {
        System.out.println("Playing in Android");
    }

    public void pause() {
        System.out.println("Pausing in Android");
    }

    public void increaseVolume(double volume) {
        // Vamos a sumarle al currentVolume el volumen que no está llegando por parámetro.
        // PERO tenenmos que aegurarnos que nunca se pase del volumen máximo
        if(currentVolume + volume < MAX_VOLUME) {
            currentVolume += volume;
//            currentVolume = currentVolume + volume;
        } else {
            currentVolume = MAX_VOLUME;
        }
    }

    public void doSomething() {
        System.out.println("Do something");
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void upload() {

    }
}
