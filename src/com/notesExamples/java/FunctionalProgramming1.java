package com.notesExamples.java;

import java.util.List;

public class FunctionalProgramming1 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,5,3,7,8,9,1);

        List<String> courses= List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF",
                                      "Azure", "Docker", "Kubernetes");
        //print all courses
        courses.stream().forEach(System.out::println);
        System.out.println("------------------");
        //print courses containing the word "Spring"
        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
        System.out.println("------------------");
        //print courses with atleast 4 letters
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
        System.out.println("------------------");
        //print cubes of each number
        numbers.stream().map(number->number*number*number).forEach(System.out::println);
        System.out.println("------------------");
        //add all the numbers in the list
        System.out.println(numbers.stream().reduce(0,(n1,n2)->n1+n2));
        System.out.println(numbers.stream().reduce(0,Integer::sum));
        System.out.println("------------------");
        //calculate min value
        System.out.println(numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y));
    }
}
