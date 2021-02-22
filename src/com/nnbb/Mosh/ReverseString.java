package com.nnbb.Mosh;
import java.util.Stack;
public class ReverseString {
    Stack<Character> st=new Stack<>();
    public String reversedString(String str)
    {
        for (char c:str.toCharArray()) {
            st.push(c);
        }
        StringBuffer reverse = new StringBuffer();

        while(!st.isEmpty()) {
            reverse.append(st.pop());
//            System.out.println(c);


        }
        return reverse.toString();}
}
