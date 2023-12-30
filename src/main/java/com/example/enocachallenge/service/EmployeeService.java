package com.example.enocachallenge.service;

import com.example.enocachallenge.dto.EmployeeDto;
import com.example.enocachallenge.entity.Employee;
import com.example.enocachallenge.exception.ResourceNotFound;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(long id);
    EmployeeDto addEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id) throws ResourceNotFound;
    void removeEmployee(long id) throws ResourceNotFound;

}
