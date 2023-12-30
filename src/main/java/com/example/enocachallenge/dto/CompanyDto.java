package com.example.enocachallenge.dto;

public class CompanyDto {
    private Long id;
    private String companyName;
    public CompanyDto() {
    }
    public CompanyDto(Long id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }
    public CompanyDto(String companyName) {
        this.companyName = companyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
