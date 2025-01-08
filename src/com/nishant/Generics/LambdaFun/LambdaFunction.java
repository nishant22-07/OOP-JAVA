package com.nishant.Generics.LambdaFun;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        System.out.println(arr);
        //lamda expression =>  (parameters) -> expression or { block of code }
//        OR
//
//        (parameters) -> {
//            // multiple statements
//            return result;
//        }



//        arr.forEach((item) -> System.out.println(item*2));
            //OR
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a+b;
        Operation sub = (a, b) -> a-b;
        Operation prod = (a, b) -> a*b;

        LambdaFunction  myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operate(3,5,sum));
        System.out.println(myCalculator.operate(3,5,prod));
        System.out.println(myCalculator.operate(3,5,sub));



    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }

}
interface Operation{
    int operation(int a,int b);
}