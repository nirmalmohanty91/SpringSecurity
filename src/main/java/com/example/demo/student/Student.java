package com.example.demo.student;


import lombok.*;


@Setter
@Getter
@ToString
public class Student{

    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
