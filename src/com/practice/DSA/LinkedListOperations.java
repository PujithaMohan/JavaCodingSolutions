package com.practice.DSA;


public class LinkedListOperations {
    public static void main(String[] args) {
        Node n=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node head=n;
        n.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
        }
}
class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}