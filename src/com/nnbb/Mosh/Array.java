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
        //add the new item at the end
        if(index>=length-1){
            //create new array-->> twice the size
            //copy all the existing items
            //Set "items" to the new array
            int[] newArr=new int[2*(index+1)];
            for (int i=0;i<index+1;i++)
            {
                newArr[i]=items[i];
            }
                items=newArr;
//            System.out.println("overload!!!");

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
    public void removeAt(int ind)
    {
        //validate the index
        //shift the items to left to fill the hole

        if(ind<0 || ind>=index+1)
        {
            throw new IllegalArgumentException();
        }
        for(int i=ind;i<index+1;i++)
        {
            items[i]=items[i+1];
        }
        index--;
    }
    public int indexOf(int item)
    {
        //loop over, if we find item, return index
        //otherwise return -1
        for(int i=0;i<=index;i++)
        {
            if(items[i]==item)
            {
                return i;
            }
        }
        return -1;
    }
    public int max()
    {
        int maximum=-999999;
        for(int i=0;i<=index;i++)
        {
            if(items[i]>maximum)
            {
                maximum=items[i];
            }
        }

        return maximum;

    }
    public int[] intersect(int[] arr)
    {
        int[] resultArr=new int[arr.length];
        int count=0;
        for(int i=0;i<=index;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(items[i]==arr[j])
                {
                    resultArr[count]=arr[j];
                    count++;
                }
            }
        }
        return resultArr;
    }

    public int[] reverse()
    {
        int[] resArr=new int[index+1];
        for(int i=0;i<=index;i++)
        {
            resArr[index-i]=items[i];
        }
        return resArr;
    }
    public void insertAt(int item,int ind)
    {
        int[] resArr=new int[index+2];
        for(int i=0;i<ind;i++)
        {
            resArr[i]=items[i];
        }
        resArr[ind]=item;
        for(int j=ind;j<items.length;j++)
        {
            resArr[j+1]=items[j];
        }
        items=resArr;
    }


}
