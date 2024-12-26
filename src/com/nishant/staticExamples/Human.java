package com.nishant.staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void greetings(){
        System.out.println("Hello world!!");
//        System.out.println(this.name); //you can not use this keyword in static functin
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name ;
        this.salary = salary ;
        this.married = married ;
        Human.population  += 1;

    }

}
