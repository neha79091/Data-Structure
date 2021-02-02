package com.nnbb.Mosh;

public class Main
{
    public static void main(String[] args)
    {
        Array obj1=new Array(1);
        int[] arr2={1,2,20,100,220};
//        obj1.print();
        obj1.insert(100000);
        obj1.insert(20);
//        obj1.insert(30);
//        obj1.print();
        obj1.insert(100);
        obj1.insert(220);
//        for(int i=0;i<obj1.intersect(arr2).length;i++)
//        {
//            System.out.println(obj1.intersect(arr2)[i]);
//            System.out.println("---");
//        }
//        for(int i=0;i<obj1.reverse().length;i++)
//        {
//            System.out.println(obj1.reverse()[i]);
//            System.out.println("---");
//        }
        obj1.insertAt(1200000,1);


        obj1.print();
        System.out.println(obj1.indexOf(0));
        System.out.println(obj1.max());
//        obj1.insert(900);

    }
}
