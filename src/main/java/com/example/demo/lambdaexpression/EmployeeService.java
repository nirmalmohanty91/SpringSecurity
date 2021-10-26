package com.example.demo.lambdaexpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
    public List<Employee> employees;
    int b = 7;
    static int c = 7;

    public static void main(String[] args) {
        EmployeeService e = new EmployeeService();
        List<Employee> employees = e.buildEmployee();
        Collections.shuffle(employees);
        System.out.println(employees);
        e.filterEmployee(employees);
        System.out.println("###########################################");
        System.out.println(employees);
    }

    public List<Employee> buildEmployee() {
        return IntStream.range(0, 5)
                .mapToObj(i -> Employee.builder()
                        .id(i)
                        .name((char) (i + 65) + "irmal")
                        .salary(Math.floor(Math.random() * 10000))
                        .build()).collect(Collectors.toList());
    }

    public List<Employee> filterEmployee(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getId).thenComparing(Employee::getName).reversed());
        return employees;
    }
}
