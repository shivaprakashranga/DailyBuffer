package com.dailybuffer.springboot.dailybuffer.controller;

import com.dailybuffer.springboot.dailybuffer.model.Employee;
import com.dailybuffer.springboot.dailybuffer.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private  EmployeeInterface employeeInterface;

    public Employee save(@RequestBody Employee employee){
        //employee.add(employee);

        return employee;
    }

}
