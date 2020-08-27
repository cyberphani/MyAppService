package com.phani.main.dto;

import java.math.BigDecimal;

public class EmployeeDto {

    private Long id;

    private String empFName;

    private String empLName;

    private String email;

    private Long departmentNo;

    private BigDecimal salary;

    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpFName() {
        return empFName;
    }

    public void setEmpFName(String empFName) {
        this.empFName = empFName;
    }

    public String getEmpLName() {
        return empLName;
    }

    public void setEmpLName(String empLName) {
        this.empLName = empLName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Long departmentNo) {
        this.departmentNo = departmentNo;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
