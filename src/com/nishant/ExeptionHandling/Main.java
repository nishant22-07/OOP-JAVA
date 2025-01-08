package com.nishant.ExeptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        String str = null;


        try{
//            divide(a,b);//arithmetic exception

//            System.out.println(str.length()); // null pointer Exception

            //mimicing exception
//            throw new RuntimeException("just for fun");

            String name = "Nishant";
            if(name.equals("Nishant")){
                throw new MyException("this word is prohibited");
            }

        }catch (MyException m){
            System.out.println(m.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }catch (Exception e){
            System.out.println("normal Exeption");
        }finally {
            System.out.println("this block executed no matter what happens");
        }
    }

    static int divide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide bt zero");
        }
        return a/b;
    }

}
