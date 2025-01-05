package com.nishant.properties.Polymorphism;

public class overloading {
    public double sum(double a, int b) {
        return a + b;
    }
    public double sum(double a, double b , double c) {
        return a + b + c;
    }
    public float sum(float a, float b,int c,int d) {
        return a + b;
    }
    public char sum(char a, char b) {
        return (char) (a + b);
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
//        obj.sum(1,6);
        System.out.println(obj.sum(1,6));

//        obj.sum(3.9,2.3,9);
        System.out.println(obj.sum(3.9,2.3,9));

//        obj.sum('9','8');
        System.out.println(obj.sum('9','8'));

    }

}
