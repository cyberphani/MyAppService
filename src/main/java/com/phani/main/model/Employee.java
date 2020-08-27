package com.phani.main.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Employee")
public class Employee {

    public Employee(){}

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "FName")
    private String empFName;

    @Column(name = "LName")
    private String empLName;

    @Column(name = "Email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "Id", nullable = false)
    private Department department;

    @Column(name = "Salary")
    private BigDecimal salary;

    @Column(name = "Gender")
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
