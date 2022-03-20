package com.example.springboottestproject.controller;

import com.example.springboottestproject.entity.Employees;
import com.example.springboottestproject.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeesService employeesService ;

    @GetMapping("/employees")
    public List<Employees> showAllEmployees(){
        List<Employees> allEmployees = employeesService.getAllEmployees();
        return allEmployees;
    }
}
