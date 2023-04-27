package com.practice.InterviewCodeSnippets;

public class StaticVariables {
    static int a=20;
    static int b;// if static var is not initialised, java will auto assign default vals; b=0
    static final int c=3;//static final var must be initialized else compile time error: Variable 'c' might not have been initialized
    StaticVariables() {
        a = 200;
    }
    public static void main(String[] args) {
        System.out.println(a);// a=20, as obj not created, constructor not called for reassignment
        StaticVariables staticVariables=new StaticVariables();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
}
    }

