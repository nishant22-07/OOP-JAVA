package com.nishant.Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Nishant = new Student("Nishant", 22, 90.99f);
        Student Aditya = new Student("Aditya", 12, 89.00f);
        Student Yash = new Student("Yash", 20, 77.00f);
        Student Sudarshan = new Student("Sudarshan", 19, 84.00f);
        Student Om = new Student("Om", 21, 99.00f);
        Student Sarthak = new Student("Sarthak", 18, 86.00f);
        Student Ramesh = new Student("Ramesh", 23, 79.00f);

        Student[] list = {Nishant,Aditya,Yash,Sudarshan,Om,Sarthak,Ramesh};
        System.out.println(list);

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        // Extract names after sorting

        String[] sortedNames = Arrays.stream(list)
                .map(Student::getName)
                .toArray(String[]::new);
        System.out.println("Sorted names based on marks: " + Arrays.toString(sortedNames));

//        if(Nishant.compareTo(Aditya)<0){
//            System.out.println("Aditya has "+ -Nishant.compareTo(Aditya)+" more marks than Nishant");
//        }else {
//            System.out.println("Nishant has "+ Nishant.compareTo(Aditya)+" more marks than Aditya");
//        }

    }
}
