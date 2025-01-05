package com.nishant.properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle  = new Circle();
        Shapes shapes = new Shapes();
        Square square = new Square();

        shapes.area();//i am in shapes

        circle.area();//Area is pi * radius * radius

        square.area();//Area is side * side
    }
}
