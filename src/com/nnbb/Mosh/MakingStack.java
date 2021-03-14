package com.nnbb.Mosh;

public class MakingStack {

    private int CurrSize;
    private int[] StArr=new int[10];
    MakingStack()
    {
        this.CurrSize=0;

     }
    public void push(int ele)
    {
        if(this.CurrSize==StArr.length) throw new StackOverflowError();
        else if(CurrSize==0)StArr[0]=ele;
        else StArr[this.NextToLastElement()]=ele;
        CurrSize++;
    }
    public void pop()
    {
        if(this.isEmpty())throw new IllegalStateException();
        StArr[this.NextToLastElement()-1]=0;
        CurrSize--;
    }
    public int peek()
    {
        if(this.isEmpty())throw new IllegalStateException();
       return StArr[this.NextToLastElement()-1];
    }
    public boolean isEmpty()
    {
        if((this.CurrSize)==0) return true;
        else return false;
    }

    private int NextToLastElement()
    {
        return CurrSize;
    }

}
