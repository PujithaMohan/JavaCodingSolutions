package com.practice.streams;

import java.util.stream.Stream;

public class BuilderInStream {
    public static void main(String[] args) {
        Stream<Object> s=Stream.builder().add("Hello").add("world").build();
        s.forEach(System.out::println);

                Stream.Builder<String> builder = Stream.builder();

                builder.add("Tony Stark")
                        .add("Steve Rogers")
                        .add("Thor Odinson");

                Stream<String> stream = builder.build();

                stream.forEach(System.out::println);
            }
        }
