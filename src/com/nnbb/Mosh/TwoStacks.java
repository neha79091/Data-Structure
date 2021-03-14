package com.nnbb.Mosh;

public class TwoStacks
{
  private int[]twoStArr=new int[10];
  private int currSize1;
  private int currSize2;
  TwoStacks()
  {
     this.currSize1=0;
      this.currSize2=0;
  }
  public void push1(int i)
  {
    if(isEmpty1())
    {
        twoStArr[1]=i;
    }
    else if(!isFull1())
    {
        twoStArr[(currSize1*2)+1]=i;
    }
    return;
  }
    public void push2(int i)
    {
        if(isEmpty2())
        {
            twoStArr[0]=i;
        }
        else if(!isFull2())
        {
            twoStArr[currSize2*2]=i;
        }
        return;
    }

    public boolean isEmpty1()
    {
        if(currSize1==0)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty2()
    {
        if(currSize2==0)
        {
            return true;
        }
        return false;
    }
    public boolean isFull1()
    {
        if(((currSize1*2)+1)==twoStArr.length+1)
        {return true;}
        return false;
    }
    public boolean isFull2()
    {
        if((currSize2*2)==twoStArr.length)
        {return true;}
        return false;
    }
    public int pop1()
    {
      if(isEmpty1()) throw new IllegalStateException();
      else
        {
            return twoStArr[(currSize1*2)+1];
        }
    }
    public int pop2()
    {
        if(isEmpty2()) throw new IllegalStateException();
        else
        {
            return twoStArr[(currSize2*2)];
        }
    }

}
