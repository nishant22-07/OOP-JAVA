package com.nishant.staticExamples;

public class Main {
    public static void main(String[] args) {
        // Create Human objects
        Human Nishant = new Human(20, "Nishant", 10000, false);
        Human Anish = new Human(22, "Anish", 15000, true);
        Human Aditya = new Human(25, "Aditya", 20000, false);

        // Print the shared static variable population
        System.out.println("Total population: " + Human.population); // Output: 3

        // Demonstrate static vs non-static methods
        Main funn = new Main();
        funn.fun2();
    }

    // Static method: Does not depend on objects
    static void fun() {
        // Print a message instead of calling a non-static method to avoid recursion
        System.out.println("This is a static method.");
    }

    // Non-static method
    void fun2() {
        // Can directly call another non-static method
        greetings();
    }

    // Non-static method
    void greetings() {
        // Call the static method without recursion
        fun(); // Static method can be called directly without creating recursion
        System.out.println("hello, how are you");
    }
}
