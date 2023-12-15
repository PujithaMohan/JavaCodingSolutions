package com.practice.InterviewCodeSnippets;

class Employee {

    int rating = 100;
}

class Manager extends Employee {

    int rating = 200;
}
class Impl {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.rating);   //200

        Employee mgrEmployee = new Manager();
        System.out.println(mgrEmployee.rating);
    }

}
