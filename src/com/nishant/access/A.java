package com.nishant.access;

public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A() {
        this.num = 0;
        this.name = "default";
        this.arr = new int[10];
    }

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
}
