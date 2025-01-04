package com.nishant.singletonClass;

public class main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3 = SingletonClass.getInstance();

        //all three ref variable are pointing to just one object
    }
}
