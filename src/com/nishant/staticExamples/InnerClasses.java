package com.nishant.staticExamples;

public class InnerClasses {
     static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a  = new Test("Nishant");
        Test b = new Test ("Aditya");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//we can not use "static" keyword outside the class
//static class A{
//
//}
