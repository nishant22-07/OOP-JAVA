package com.nishant.interfaces.ExtendDemo;

public class Main implements B{
    @Override
    public void greet() {
        System.out.println("hi! how are you?");
    }

    @Override
    public void fun() {
        System.out.println("lets do some Fun");

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
        m.fun();
    }
}
