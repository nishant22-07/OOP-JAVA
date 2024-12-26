package com.nishant.staticExamples;

public class Main {
    public static void main(String[] args) {
//        Human Nishant = new Human(20 ,"Nishant" , 10000 ,false);
//        Human Anish = new Human(20 ,"Anish" , 10000 ,false);
//        Human Aditya = new Human(20 ,"Aditya" , 100000 ,false);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

 }
    //this is not depend on objects
    static void fun(){
        //greetings();//without obj. you cant use this because it requires object or instance
        //but the funtion we are using does not depends on instances


        //you can not access non static stuff without referencing their instance in
        // a static context

        //here i referencing it
        Main obj = new Main();
        obj.greetings();
    }
    void fun2(){
        greetings();
    }

    //we know that something which is not static belongs to object
    void greetings(){
        fun();
        System.out.println("hello,how are you");
    }
}

