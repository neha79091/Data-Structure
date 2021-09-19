package com.nnbb.Mosh;

public class MinStack {
    private int[] minArray=new int[10];
    private int currSize;
    private int min;
    MinStack()
    {
        this.currSize=0;

    }
    public void push(int i)
    {
        if(isEmpty())
        {
            minArray[0]=i;
            min=i;

        }
        if(min>i)min=i;

        minArray[currSize]=i;
        currSize++;
    }
    public boolean isEmpty()
    {
        if(currSize==0)
        {
            return true;
        }
        return false;
    }
    public void pop()
    {
        if(!isEmpty())
        {
             minArray[currSize-1]=0;
            currSize--;
            return;
        }
        throw new IllegalStateException();
    }
    public int min()
    {return min;}
}
