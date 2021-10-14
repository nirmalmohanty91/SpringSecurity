package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Nirmal"),
            new Student(2,"Batman")
            );

    @GetMapping
    public List<Student> getAllStudents(){
        System.out.println("getAllStudents");
        return STUDENTS;
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("register student");
        System.out.println(student);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId,@RequestBody Student student){
        System.out.println("Update student");
        System.out.println(String.format("%s %s", studentId, student));
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("Delete student");
        System.out.println(studentId);
    }
}
