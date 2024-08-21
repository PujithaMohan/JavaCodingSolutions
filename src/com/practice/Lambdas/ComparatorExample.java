package com.practice.Lambdas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> list= List.of(2, 3, 7, 23, 90, 45, 65, 87,1,22);
        Comparator<Integer> comparator=(e1,e2)->e1.compareTo(e2);
        System.out.println(list.stream().sorted(comparator).collect(Collectors.toList()));
        System.out.println(list.stream().max(comparator).get());
    }
}
