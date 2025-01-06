package com.nishant.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // we will learn in deatail in hash map lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(57,8.56f);
        ObjectDemo obj2 = new ObjectDemo(57,8.56f);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        if(obj==obj2){
            System.out.println("obj is equal to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass());
    }


}
