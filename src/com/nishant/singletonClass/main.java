package com.nishant.singletonClass;

import com.nishant.access.A;

public class main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3 = SingletonClass.getInstance();

        //all three ref variable are pointing to just one object

//        A a = new A(7,"nishant",new int[22]);
//        a.getNum();// if int num is private
//        int n = a.num;// if int num is public

    }
}
