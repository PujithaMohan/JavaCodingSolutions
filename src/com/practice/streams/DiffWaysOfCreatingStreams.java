package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiffWaysOfCreatingStreams {
    public static void main(String[] args) {
        Stream<Integer> integerStream= Stream.of(1,2,3,4,5);
        System.out.println(integerStream.count());

        Stream<String> stringStream=Stream.empty();
        stringStream.forEach(System.out::print);

        Integer a[]={0,23,564,85,92};
        Stream<Integer> integerStream1= Arrays.stream(a);
        List<Integer> integerList=integerStream1.collect(Collectors.toList());
        integerList.forEach(System.out::println);

        Stream<String> stringStream1=Stream.of("Hello"," world"," !");
        Stream<String> stringStream2=Stream.of(" Welcome"," to"," the"," programming"," practice");
        Stream<String> stringStream3=Stream.concat(stringStream1,stringStream2);
        stringStream3.forEach(System.out::print);

        List<UUID> uuidList=Stream.generate(UUID::randomUUID).limit(5).collect(Collectors.toList());
        uuidList.forEach(System.out::println);

        List<Integer> integerList1=Stream.iterate(1,x->x+3).limit(10).collect(Collectors.toList());
        for(int i:integerList1)
            System.out.print(i+" ");

    }
}
