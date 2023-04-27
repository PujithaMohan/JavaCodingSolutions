package com.practice.LearningJava;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        double max=10.0,min=5.0;
        double r=Math.random()*(max-min)+min;
        System.out.println(r);
        Random random=new Random();
        int i=random.nextInt(10,15);
        System.out.println(i);
        int ma=2,mi=1;
        random.ints(9,50,90).forEach(System.out::println);
    }
}
