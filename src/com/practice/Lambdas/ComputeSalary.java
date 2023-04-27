package com.practice.Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComputeSalary {
    public static void main(String[] args) {
        //Given a List Of Employees, find the employees who has salary>50000&Department=HR and sort the
        //resulting List in ascending order of salaries , using JAVA8 , Stream Api features
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"HR",5000));
        employeeList.add(new Employee(2,"Technical",7000));
        employeeList.add(new Employee(3,"HR",2000));
        employeeList.add(new Employee(4,"HR",3000));
        //List<Employee> list=employeeList.stream().filter(e->e.getSalary()>2000).
         //       sorted((e1,e2)->e1.getSalary()- e2.getSalary()).collect(Collectors.toList());
        List<Employee> list1=employeeList.stream().filter(e->e.getDepartment()=="HR").sorted(Comparator.comparing(Employee::getDepartment)).collect(Collectors.toList());
        employeeList.stream().filter(e->e.getSalary()>2000).sorted().forEach(System.out::println);
        list1.stream().forEach(System.out::println);
    }
}
class Employee{
    int empid;
    String department;
    int salary;

    public int getEmpid() {
        return empid;
    }

    public Employee(int empid, String department,int salary) {
        this.empid = empid;
        this.department = department;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmpid(int empid){
        this.empid=empid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    }

