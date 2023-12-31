package com.example.enocachallenge.controller;

import com.example.enocachallenge.dto.EmployeeDto;
import com.example.enocachallenge.entity.Company;
import com.example.enocachallenge.entity.Employee;
import com.example.enocachallenge.exception.ResourceNotFound;
import com.example.enocachallenge.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/find/all")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/find/{id}")
    public Employee findById(@PathVariable("id")int id){
        return employeeService.findById(id);
    }
    @PostMapping("/add")
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }
    @PutMapping("/update/{id}")
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable("id") Long id) throws ResourceNotFound {
        return employeeService.updateEmployee(employeeDto,id);
    }
    @DeleteMapping("/delete/{id}")
    public String removeEmployee(@PathVariable("id")int id) throws ResourceNotFound {
        return employeeService.removeEmployee(id);
    }

}
