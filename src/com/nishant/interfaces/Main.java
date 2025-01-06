package com.nishant.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        car.stop();
////        car.brake();
//        car.accelerate();
//
//        Media mediaCar = new Car();
//        mediaCar.start();
//        mediaCar.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.stop();
        car.StartMedia();
        car.StopMedia();

        System.out.println();

        //Change the engine
        car.UpgradeEngine();
        car.start();
        car.stop();



    }
}
