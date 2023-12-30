package com.example.enocachallenge.service;

import com.example.enocachallenge.dto.CompanyDto;
import com.example.enocachallenge.entity.Company;
import com.example.enocachallenge.exception.ResourceNotFound;

import java.util.List;

public interface CompanyService {

    List<Company> findAll();
    Company findById(long id);
    CompanyDto addCompany(CompanyDto companyDto);
    CompanyDto updateCompany(CompanyDto companyDto, long id) throws ResourceNotFound;
    void removeCompany(long id) throws ResourceNotFound;
}
