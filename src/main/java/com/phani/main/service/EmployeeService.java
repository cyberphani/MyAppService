package com.phani.main.service;

import com.phani.main.dto.EmployeeDto;
import com.phani.main.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(EmployeeDto employeeDto);

    public Employee getEmployee(Long id);

    public List<Employee> getEmployeeList();
}
