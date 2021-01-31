package com.nnbb.Mosh;

import java.sql.SQLOutput;

public class Array
{
    int[] items;
    int length;
    int index;
    public Array()
    {
        this(50);

    }
    public Array(int length)
    {
        this.index=-1;
        this.length=length;
        this.items=new int[length];

    }
    public void insert(int item)
    {
        //if array is full,resize it
        if(index>=length-1){
            System.out.println("overload!!!");
            return;
        }

        this.items[++index]=item;

    }
    public void print()
    {
        if(index==-1){
            System.out.println("Empty!!!");
        }
        //we are not using length of array in loop bcz it will print 0 if nothing is inserted,hence using index
        for(int i=0;i<=index;i++)
        {
            System.out.println(items[i]);
        }

    }


}
