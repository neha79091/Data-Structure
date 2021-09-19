//import java.util.Arrays;
//import java.util.List;
//import java.util.Stack;
////how I solved it---->>>>  as stack is LIFO and Queue is FIFO so we will push simply as usual and during pop there is a trick
//// we will use two queues q1 and q2 as follows:::
//class MyStack {
//
//    /** Initialize your data structure here. */
//    Queue <Integer> q1=new LinkedList<>();
//    Queue <Integer> q2=new LinkedList<>();
//    int qsize=0;
//    int qpop=0;
//    public MyStack() {
//
//    }
//
//    /** Push element x onto stack. */
//    public void push(int x)
//    {
//        q1.add(x);
//    }
//
//    /** Removes the element on top of the stack and returns that element. */
//    public int pop()
//    {
//        //queue size of q1
//        qsize=q1.size();
//        // transferring all the elements of q1 in q2 until one element is left
//        while(qsize!=1)
//        {
//            q2.add(q1.poll());
//            qsize--;
//        }
//        //we are storing that last element in qpop variable that we will return as result as
//        //queue will return the last entered at last and we have to pop that element only
//        qpop=q1.poll();
//        q1=q2;
//        return qpop;
//
//    }
//
//    /** Get the top element. */
//    public int top()
//    {
//        //same logic as pop is applied here
//        qsize=q1.size();
//        while(qsize!=1)
//        {
//            q2.add(q1.poll());
//            qsize--;
//        }
//        qpop=q1.peek();
//        q2.add(q1.poll());
//        q1=q2;
//        return qpop;
//    }
//
//    /** Returns whether the stack is empty. */
//    public boolean empty()
//    {
//        qsize=q1.size();
//        if(qsize==0) return true;
//        else return false;
//    }
//}
//
///**
// * Your MyStack object will be instantiated and called as such:
// * MyStack obj = new MyStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();
// * boolean param_4 = obj.empty();
// */