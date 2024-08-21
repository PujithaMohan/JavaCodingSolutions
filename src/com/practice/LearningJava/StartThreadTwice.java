package com.practice.LearningJava;

public class StartThreadTwice extends Thread{
    public static void main(String[] args) throws InterruptedException{
        StartThreadTwice t1=new StartThreadTwice();
        t1.setName("Test");
        t1.start();
       // t1.start();
        /* if start() called twice
        Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:800)
	at com.practice.LearningJava.StartThreadTwice.main(StartThreadTwice.java:8)
ThreadTest
        * */
    }
    @Override
    public void run() {
        System.out.println("Thread"+Thread.currentThread().getName());
    }
}
