package com.practice.Lambdas;

interface Shape{
    void print();
}
public class ShapeImpl {
    public static void main(String[] args) {
        Shape rectangle=()-> System.out.println("Rectangle");
        rectangle.print();
        Shape circle=()-> System.out.println("Circle");
        circle.print();
        Shape square=()-> System.out.println("Square");
        square.print();
    }
}
