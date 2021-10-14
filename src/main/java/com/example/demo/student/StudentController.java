package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping("/student")
    public String greeting1() {
        return "You have student access";
    }

    @GetMapping("/admin")
    public String greeting2() {
        return "You have admin access";
    }
}
