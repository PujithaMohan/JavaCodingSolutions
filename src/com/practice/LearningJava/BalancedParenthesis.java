package com.practice.LearningJava;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String a="(()){[]";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(!stack.isEmpty()&&(ch=='}'&&stack.peek()=='{'||ch==')'&&stack.peek()=='('||ch==']'&&stack.peek()=='['))
                stack.pop();
            else if(ch=='{'||ch=='('||ch=='[')
                stack.push(ch);
            else
                stack.push(ch);
        }
        for (char c:stack)
            System.out.println(c);
        if(stack.isEmpty())
            System.out.println("Balanced Paranthesis");
        else
            System.out.println("Not Balanced Paranthesis");
    }
}
