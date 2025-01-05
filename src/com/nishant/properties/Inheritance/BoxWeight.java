package com.nishant.properties.Inheritance;

public class BoxWeight extends Box {

    double weight;
    public BoxWeight() {
        double weight = 1.0;
//        super();
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    BoxWeight (BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight (double side , double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double width, double length, double height, double weight) {
        super(width, length, height);// what is this ? call the parent class constructor
        //use to intitialize values in parent class
//        System.out.println(super.weight);
        this.weight = weight;
    }
}
