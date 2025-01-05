package com.nishant.properties.Inheritance;

public class BoxPrice extends BoxWeight {

    double cost;
    public BoxPrice() {
        double cost = 1.0;
    }

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
