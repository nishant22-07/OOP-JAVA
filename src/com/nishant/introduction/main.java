package com.nishant.introduction;
public class main {
    public static void main(String[] args) {
        //store 5 roll no
        int[] roll_no = new int[5];

        // store 5 names
        String[] name = new String[5];

        // data of five students : {roll no , name, marks}
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] Students = new Student[5];

        // just declaring
//        Student kunal;
//        kunal = new Student();
        Student kunal = new Student();
        Student rahul = new Student();


//      System.out.println(Arrays.toString(Students));  //give null
//        kunal.rno = 13;
//        kunal.names = "Kunal Kushwaha";
//        kunal.marks = 88.5f;

        kunal.change_name("shoe lover");
//        kunal.greetings();


        System.out.println(kunal.rno);
        System.out.println(kunal.names);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.names);

        Student random2 = new Student();
        System.out.println(random2.names);

        Student one = new Student();
        Student two = one ;
        one.names = "something Something";
        System.out.println(two.names);



    }
}
//create a class for every single student
class Student {
    int rno;
    String names;
    float marks = 90;

    //we need a way to add the values of the above
    //properties object by object

    //we need one word to access every object


    void  greetings(){
        System.out.println("Hello my name is " + this.names);
    }

    void change_name(String newName){
        this.names= newName;

    }

//    Student(){
//        this.rno = 13;
//        this.names = "Kunal Kushwaha";
//        this.marks = 88.5f;
//
//    }

    Student(){
        //this is how can a constructor from another constructor
        //internally : Student(13 , "default person" , 100.0f);
        this(13 , "default person" , 100.0f);
    }

    Student(Student other){
        this.rno = other.rno;
        this.names = other.names;
        this.marks = other.marks;
    }

    //Student arpit  = new student(17 ,"arpit", 98.9f);
    //here this will be replaced with arpit
    Student(int roll,String name , float marks){
        this.rno = roll;
        this.names = name;
        this.marks = marks;

    }
}
