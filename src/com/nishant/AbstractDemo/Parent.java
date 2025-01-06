package com.nishant.AbstractDemo;

public abstract class Parent {
    int age;

    //you can not create abstract constructors


    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hello");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
}
