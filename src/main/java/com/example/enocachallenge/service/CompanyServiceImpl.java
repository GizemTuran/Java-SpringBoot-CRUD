package com.example.enocachallenge.service;

import com.example.enocachallenge.dto.CompanyDto;
import com.example.enocachallenge.entity.Company;
import com.example.enocachallenge.exception.ResourceNotFound;
import com.example.enocachallenge.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    private CompanyRepository companyRepository;
    private ModelMapper modelMapper;

    public CompanyServiceImpl(CompanyRepository companyRepository, ModelMapper modelMapper){
        this.companyRepository=companyRepository;
        this.modelMapper=modelMapper;
    }
    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findById(long id) {
        if(companyRepository.findById(id).isPresent()){
            return companyRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public CompanyDto addCompany(CompanyDto companyDto) {
        Company company = modelMapper.map(companyDto,Company.class);
        Company savedCompany = companyRepository.save(company);

        return modelMapper.map(savedCompany,CompanyDto.class);
    }

    @Override
    public CompanyDto updateCompany(CompanyDto companyDto, long id) throws ResourceNotFound {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("There is no such resourse."));
        company.setCompanyName(companyDto.getCompanyName());
        company.setId(id);

        Company updatedCompany = companyRepository.save(company);
        return modelMapper.map(updatedCompany,CompanyDto.class);
    }

    @Override
    public String removeCompany(long id) throws ResourceNotFound {
        Company company =companyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("There is no such resource."));

        companyRepository.delete(company);
        return "Deleted successfully.";
    }
}
