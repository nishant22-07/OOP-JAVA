package com.nishant.properties.Inheritance;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
//        //parent class
//        System.out.println("Parent class");
//        Box box = new Box();
//        System.out.println(box.length + " " + box.width + " " + box.height  );
//
//        Box box1 = new Box(4);
//        System.out.println(box1.length + " " + box1.width + " " + box1.height  );
//
//        Box box2 = new Box(2.2,0.7,20.04);
//        System.out.println(box2.length + " " + box2.width + " " + box2.height  );
//
//
//        // child class
//        System.out.println("\nChild class: BoxWeight");
//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.length + " " + box4.width + " " + box4.height);
//
//        BoxWeight box5 = new BoxWeight(2,4,5,7);
//        System.out.println(box5.length + " " + box5.width + " " + box5.height);
//
//        BoxWeight box6 = new BoxWeight(2.2,0.7,20.04,10.5);
//        System.out.println(box6.length + " " + box6.width + " " + box6.height);
//
//
        Box box7 = new BoxWeight(1,2,4,5);
        System.out.println(box7);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the const
        // this is why error
//        BoxWeight box = new Box(1:2, h: 3, w: 4) i
//        System.out.println(box6);

        //Child class : BoxPrice
        System.out.println("\nChild class: BoxPrice");
        BoxPrice Box8 = new BoxPrice(8,9,9);
        System.out.println(+ Box8.weight + " " + Box8.cost+" "+Box8.side);



    }

}
