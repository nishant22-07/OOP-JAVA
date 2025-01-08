package com.nishant.enumExamples;

public class Basic  {
    enum Week implements A{
        Monday,Tuesday,Wednesday, Thursday, Friday, Saturday , Sunday;
        //these are enum constants
        //public static and final
        // since its final you can create child enums
        // type is week


        Week() {
            System.out.println("Constructor called  for "+this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you?");
        }
        // this is not public or protected ,only private or default
        //why? we dont want to create object

        //internally : public static final week Monday = new Week();


    }

    public static void main(String[] args) {
        Week week = Week.Monday;
        week.hello();
//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
//
//        System.out.println();
//        System.out.println(week);
//        System.out.println(week.ordinal());
    }
}
