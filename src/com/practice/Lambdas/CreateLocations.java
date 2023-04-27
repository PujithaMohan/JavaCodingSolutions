package com.practice.Lambdas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateLocations {
    public static void main(String[] args) {
        List<String> locations= Arrays.asList("India","United Kingdom","Germany","America");
        Stream<Integer> s=Stream.of(100,45,93,2,67,1);
        //to uppercase
        locations.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::print);
        //sort
        System.out.println();
        locations.stream().sorted().forEach(System.out::print);
        System.out.println();
        locations.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();
        locations.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
        System.out.println();
        locations.stream().sorted((e1,e2)->e1.compareTo(e2)).forEach(System.out::print);
        System.out.println();
        s.sorted((e1,e2)->e1.compareTo(e2)).forEach(System.out::print);
        Stream<Integer> s1=Stream.of(44,100,45,93,2,67,1);
        System.out.println(s1.findAny());
        Stream<Integer> s2=Stream.of(0,45,93,2,67,1);
        System.out.println(s2.findFirst());
        Stream<Integer> s3=Stream.of(100,45,93,2,67,1);
        System.out.println(s3.count());
        Stream<Integer> s4=Stream.of(100,45,93,2,67,1);
        System.out.println(s4.min(Comparator.comparing(Integer::valueOf)));
        Stream<Integer> s5=Stream.of(100,45,93,2,67,1);
        System.out.println(s5.max(Comparator.comparing(Integer::valueOf)));
    }
}
