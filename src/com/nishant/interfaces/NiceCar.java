package com.nishant.interfaces;

public class NiceCar {
    private Engine engine;
    private Brakes brakes;
    private Media media = new Cdplayer();
    public NiceCar() {
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine, Brakes brakes, Media media) {
        this.engine = engine;
        this.brakes = brakes;
        this.media = media;
    }
    public void start() {
        engine.start();

    }
    public void stop() {
        engine.stop();
    }
    public void StartMedia() {
        media.start();
    }
    public void StopMedia() {
        media.stop();
    }

    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
