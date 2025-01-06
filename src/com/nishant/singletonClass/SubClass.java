package com.nishant.singletonClass;

import com.nishant.access.A;

public class SubClass extends A {

    public SubClass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        A obj = new A(7,"nishant",new int[22]);
//        int num = obj.num; // the data member "int num" is protected in pkg com.nishant.access.A
        // that's why we are not able to use num here

    }
}
