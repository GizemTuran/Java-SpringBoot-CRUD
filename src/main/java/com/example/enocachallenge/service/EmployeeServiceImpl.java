package com.example.enocachallenge.service;

import com.example.enocachallenge.dto.EmployeeDto;
import com.example.enocachallenge.entity.Employee;
import com.example.enocachallenge.exception.ResourceNotFound;
import com.example.enocachallenge.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper){

        this.employeeRepository=employeeRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        if(employeeRepository.findById(id).isPresent()){
            return employeeRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {

        Employee employee = modelMapper.map(employeeDto,Employee.class);
        Employee savedEmployee = employeeRepository.save(employee);

        return modelMapper.map(savedEmployee,EmployeeDto.class);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id) throws ResourceNotFound {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("There is no such resource."));

        employee.setName(employeeDto.getName());
        employee.setId(id);

        Employee updatedEmployee = employeeRepository.save(employee);

        return modelMapper.map(updatedEmployee,EmployeeDto.class);
    }
    @Override
    public String removeEmployee(long id) throws ResourceNotFound {
        Employee employee =employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("There is no such resource."));

        employeeRepository.delete(employee);
        return "Deleted successfully.";
    }
}
