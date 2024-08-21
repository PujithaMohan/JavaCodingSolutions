package com.practice.InterviewCodeSnippets;

public class Exceptions {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
            throw new RuntimeException();
        } catch(Exception e){
            System.out.println("Catch");
            System.exit(1);
        } finally {
            System.out.println("Finally");
        }
    }
}
