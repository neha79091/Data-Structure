package com.nnbb.Mosh;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    Stack<Character> st=new Stack<>();
    private final List<Character> leftBrackets = Arrays.asList('(','[','{','<');
    private final List<Character> rightBracket = Arrays.asList(')',']','}','>');

    public boolean isBalanced(String str)
    {
        if(str==null){throw new IllegalArgumentException();}
        char[] charArray=str.toCharArray();
        boolean result=true;
        for(char c:charArray)
        {
            if(isLeftBracket(c)) st.push(c);
            else if(isRight(c))   {
                if(st.isEmpty()) return false;
                var top=st.pop();
                if(!isMatch(top,c))return false;
            }

        }
        return st.isEmpty();
    }
    private boolean isLeftBracket(char ch)
    {
        return (leftBrackets.contains(ch));
    }
    private boolean isMatch(char left,char right)
    {

        return leftBrackets.indexOf(left)==rightBracket.indexOf(right);
    }
    private boolean isRight(char ch)
    {
        return (rightBracket.contains(ch));
    }
}
