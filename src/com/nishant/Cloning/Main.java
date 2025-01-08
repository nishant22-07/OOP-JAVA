package com.nishant.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Nishant = new Human(20,"Nishant");
//        Human twin = new Human(Nishant);


        Human twin = (Human)Nishant.clone();
        System.out.println(twin.name + " " + twin.age);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100 ;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Nishant.arr));

    }

}
