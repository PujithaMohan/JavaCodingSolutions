package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/getStudent")
    public Student getStudent(){
        return new Student(1,"Puji");
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(2,"Sai"));
        list.add(new Student(3,"Kiran"));
        list.add(new Student(4,"Juhi"));
        list.add(new Student(5,"Usha"));
        list.add(new Student(6,"Mohan"));
        return list;
    }

    @GetMapping("/getStudentByPathVariable/{rollNo}/{name}")
    public Student getStudentByPathVariable(@PathVariable("rollNo") int rollNo,@PathVariable("name") String name){
        return new Student(rollNo,name);
    }

    @GetMapping("/getStudentsByRequestParam")
    public Student getStudentsByRequestParam(@RequestParam(name="id") int id,@RequestParam(name="name") String name){
        return new Student(id,name);
    }

}
