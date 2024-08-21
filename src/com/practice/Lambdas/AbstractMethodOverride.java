package com.practice.Lambdas;

public class AbstractMethodOverride implements AA,BB{
    public static void main(String[] args) {
        AbstractMethodOverride abstractMethodOverride=new AbstractMethodOverride();
        abstractMethodOverride.print();
    }
    //there is only one @Override necessary!!!. This is because AA.print() and BB.print() are "@Override-equivalent"
    //AbstractMethodOverride only has one implementation of print(), and it doesn't matter how you treat abstractMethodOverride,
    // whether as a AA or as a BB,there is only one method to invoke.
    @Override
    public void print() {
        System.out.println("Hello");
    }
}
interface AA{

    //This further reiterates that inheriting members from an interface must obey the general rule of member declarations.
    // Here we have AA and BB define print() with incompatible return types : boolean and void, results in a compilation error.
     //boolean print();
     void print();

}
interface BB{
    void print();
}