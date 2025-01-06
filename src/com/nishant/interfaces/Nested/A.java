package com.nishant.interfaces.Nested;

public class A {
    // nested interface
    public interface NestedInterface {
        void fun();
    }
}


class B implements A.NestedInterface{
    @Override
    public void fun() {
        System.out.println("Nested interface fun");
    }

}