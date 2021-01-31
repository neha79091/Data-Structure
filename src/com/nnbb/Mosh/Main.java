package com.nnbb.Mosh;

public class Main
{
    public static void main(String[] args)
    {
        Array obj1=new Array(1);
        obj1.print();
        obj1.insert(100000);
        obj1.insert(20);
//        obj1.insert(30);
//        obj1.print();
        obj1.insert(100);
        obj1.insert(220);
        obj1.removeAt(0);
        obj1.print();
        System.out.println(obj1.indexOf(0));
        System.out.println(obj1.max());
//        obj1.insert(900);

    }
}
