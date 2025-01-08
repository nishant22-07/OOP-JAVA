package com.nishant.Generics.Comparing;

public class Student implements Comparable<Student>{
    String name;
    int rollNo;
    float marks;

    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks) ;
        //if diff is == 0 : mean both are equal
        //if diff < 1 : o is bigger else o is smaller
        return diff;
    }

    public Student(String name,int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks +"";
    }
}
