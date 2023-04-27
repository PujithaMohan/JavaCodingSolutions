package com.practice.DSA;

import java.util.Stack;

public class RemoveConsecutiveDuplicatesString {
    public static void main(String[] args) {
        String a="aabbbbbbccdef",res="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<a.length();i++){
            if(!stack.isEmpty()&&a.charAt(i)==stack.peek()){
                stack.pop();
            }else
            {
                stack.push(a.charAt(i));
            }
        }
        for(Character c:stack)
            System.out.print(c);
    }
}
