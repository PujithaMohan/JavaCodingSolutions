package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonThreadSafeList extends Thread implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        List<String> stringList= Collections.synchronizedList(new ArrayList<>());
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");

        synchronized(stringList) {
            Thread t1 = new Thread() {
                public void run() {
                    if (!stringList.isEmpty()) {
                        stringList.add("i");
                        System.out.println(stringList);
                    }
                }
            };
            Runnable t2 = () -> {
                if (!stringList.isEmpty()) {
                    stringList.add("u");
                    System.out.println(stringList);
                }
            };
            t1.start();
            Thread.sleep(100);
            t2.run();
        }
    }
}