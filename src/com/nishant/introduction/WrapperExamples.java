package com.nishant.introduction;

// Main class demonstrating wrapper classes, final keyword behavior, and proper cleanup with AutoCloseable
public class WrapperExamples {
    public static void main(String[] args) {
        // Wrapper class example
        Integer num = 45;
        Integer a = 10; // Using wrapper class Integer instead of primitive int
        Integer b = 20;

        // Attempt to swap values of a and b
        swap(a, b);
        System.out.println(a + " " + b); // Outputs 10 20 because Integer is immutable

        // Demonstration of the 'final' keyword with objects
        final A kunal = new A("kunal kushwaha"); // 'kunal' is a final reference
        kunal.name = "other name"; // Allowed: final only prevents reassigning the reference, not modifying the object
        // kunal = new A("new object"); // Uncommenting this will cause a compilation error

        // Demonstration of proper cleanup using AutoCloseable
        try (A obj = new A("jsdkfjhka")) {
            System.out.println(obj); // Prints the memory address (default toString() behavior)
        } // Automatically calls close() when exiting the try block
    }

    // Method attempting to swap two Integer objects
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

// Class A demonstrating the 'final' keyword and resource cleanup
class A implements AutoCloseable {
    final int num = 10; // Final field: cannot be reassigned
    String name; // Mutable field

    // Constructor to initialize the name
    public A(String name) {
        this.name = name;
    }

    // Override the close() method for cleanup (replaces deprecated finalize())
    @Override
    public void close() {
        System.out.println("Object is destroyed"); // Message when object is closed
    }
}
