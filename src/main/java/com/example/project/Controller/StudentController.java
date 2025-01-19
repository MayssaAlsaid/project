package com.example.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class StudentController {


    List <Student> students = new ArrayList<>(List.of(
        new Student(1,"Omer","java"),
        new Student(2,"Ali","python")));
    
      @GetMapping("students")
      public List<Student> getStudents(){
         return students ;
}
    @PostMapping("students")
     public void addStudent(@RequestBody Student student){
        students.add(student);
     }


    }
