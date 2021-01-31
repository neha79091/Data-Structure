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
        for(int i=0;i<=index;i++)
        {
            System.out.println(items[i]);
        }

    }


}
