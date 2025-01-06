package com.nishant.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        // it will give error,you can not create object of abstract class
//        Parent parent = new Parent(50); //Cause Abstract classes are cannot be instatiated
        Parent.hello();


        Son son = new Son(20);
        son.career("Software Engineer");
        son.partner("?",20);

        Daughter daughter = new Daughter(20);
        daughter.career("Doctor");;
        daughter.partner("Nishant",20);
    }
}
