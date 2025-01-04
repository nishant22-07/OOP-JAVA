package com.nishant.properties.Inheritance;

public class Box {
    double length;
    double width;
    double height;
//    double weight;

    Box(){
        super();
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    //CUBE
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;

    }

    Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    Box(Box old){
        this.length = old.length ;
        this.height = old.height ;
        this.width = old.width ;
    }

    public void information() {
        System.out.println("Length: " + this.length + " Width: " + this.width + " Height: " + this.height);}
    }
