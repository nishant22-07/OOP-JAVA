package com.nishant.access;

public class SubClass extends A{

    public SubClass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        A obj = new A(7,"nishant",new int[22]);
        int num = obj.num;

        System.out.println(obj instanceof A);
    }
}
