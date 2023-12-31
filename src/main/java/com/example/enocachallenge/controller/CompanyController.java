package com.example.enocachallenge.controller;

import com.example.enocachallenge.dto.CompanyDto;
import com.example.enocachallenge.entity.Company;
import com.example.enocachallenge.exception.ResourceNotFound;
import com.example.enocachallenge.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService=companyService;
    }

    @GetMapping("/find/all")
    public List<Company> findAll(){
        return companyService.findAll();
    }

    @GetMapping("/find/{id}")
    public Company findById(@PathVariable("id")int id){
        return companyService.findById(id);
    }

    @PostMapping("/add")
    public CompanyDto addCompany(@RequestBody CompanyDto companyDto){
        return companyService.addCompany(companyDto);
    }
    @PutMapping("/update/{id}")
    public CompanyDto updateCompany(@RequestBody CompanyDto companyDto, @PathVariable("id") Long id) throws ResourceNotFound {
        return companyService.updateCompany(companyDto,id);
    }
    @DeleteMapping("/delete/{id}")
    public String removeCompany(@PathVariable("id")int id) throws ResourceNotFound {
        return companyService.removeCompany(id);
    }
}
