package com.nishant.properties.Inheritance;

public class BoxColour  extends BoxWeight{
    char colour;

    public BoxColour(char colour) {
        super();
        this.colour = colour;
    }

    public BoxColour(BoxColour other){
        super(other);
        this.colour = other.colour;
    }

    public BoxColour(double width, double length, double height, double weight, char colour) {
        super(width, length, height, weight);
        this.colour = colour;
    }
}
