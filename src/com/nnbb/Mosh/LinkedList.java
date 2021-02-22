package com.nnbb.Mosh;

import java.util.NoSuchElementException;

class Node {
    int value;
    Node next;
    public Node(int value)
    {
        this.value=value;
    }
}
public class LinkedList {

    private Node first;
    private Node last;

    public void addFirst(int item)
    {
        var newNode=new Node(item);
        if(first==null)
        {
            first=last=newNode;
        }
        else
        {
            newNode.next=(first);
            first=newNode;
         }
//        last.next=null;
    }
    public void addLast(int item)
    {
        var newNode=new Node(item);
//        newNode.next=(first);
        if(first==null)
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
        last.next=null;

    }
    public int indexOf(int node)
    {
        int count=0;
        if(first==null)
        {
            return -1;
        }
        var temp=first;
        while(temp!=null)
        {
            if(temp.value==node)
            {
                return count;
            }
            temp=temp.next;
            count++;
        }
        return -1;

    }
    public boolean contains(int item)
    {
        var temp=first;
        boolean flag=false;
        while(temp!=null)
        {
            if(temp.value==item)
            {
                flag=true;
            }
            temp=temp.next;
        }
        return flag;
    }
    public void removeFirst()
    {
        if(first==null)throw new NoSuchElementException();
        if(first==last)
        {
            first=last=null;
            return;
        }
        var temp=first;
        first=first.next;
        temp.next=null;
        return;
    }
    public void removeLast()
    {
        if(first==null)throw new NoSuchElementException();
        if(first==last)
        {
            first=last=null;
            return;
        }
        var temp=first;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        last=temp;

    }
    public int size()
    {
         var temp=this.first;
         int count=0;
         while(temp!=null)
         {
             temp=temp.next;
             count++;
         }
         return count;
    }
    public LinkedList reverse()
    {
        if(this.size()==1||this.first==null)
            return this;
        var preHead=new Node(0);
        preHead.next=first;
        var initial=first;
        var headPtr=first;
        var movingPtr=first.next;
        while(movingPtr!=null)
        {
            preHead.next=movingPtr;
            movingPtr=movingPtr.next;
            initial.next=movingPtr;
            preHead.next.next=first;
            first=preHead.next;
            last=initial;

        }
        return this;

    }
    public int KthElement(int k)
    {
        var cur=first;
        var next=first;
        for(int i=0;i<k;i++)
        {
            next=next.next;
            if(next==null)
            {
                throw new IllegalArgumentException();
            }
        }
        while(next!=null)
        {
            next=next.next;
            cur=cur.next;
        }
        return cur.value;
    }
    public int[] middle()
    {
        var once=first;
        var twice=first;
        int[] result=new int[1];
        while(twice.next!=null && twice.next.next!=null)
        {
            once=once.next;
            twice=twice.next.next;
        }
        if(twice!=last)
        {
            int[] result1=new int[2];
            result1[0]=once.value;
            result1[1]=once.next.value;
         return result1;
        }
        result[0]=once.value;
        return result;
    }
    public boolean isCircular()
    {
        last.next=first;
        var once=first.next;
        var twice=first.next.next;
        boolean isCircle=false;
        while(once!=twice && twice!=null)
        {
            once=once.next;
            twice=twice.next.next;
        }
        if(once==twice){isCircle=true;}
        return isCircle;
    }
}
