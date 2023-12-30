package com.example.enocachallenge.dto;

public class EmployeeDto {
    private Long id;
    private String name;
    private Long companyId;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, Long companyId) {
        this.id = id;
        this.name = name;
    }
    public EmployeeDto(String name, Long companyId) {
        this.name = name;
        this.companyId=companyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
