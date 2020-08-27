package com.phani.main.service;

import com.phani.main.dao.EmployeeRepository;
import com.phani.main.dto.EmployeeDto;
import com.phani.main.mapper.EmployeeMapper;
import com.phani.main.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        return employeeRepository.save(employeeRepository.save(employeeMapper.mapToEmployee(employeeDto)));
    }

    @Override
    public Employee getEmployee(Long id) {
         Optional<Employee> result = employeeRepository.findById(id);
         if(result.isPresent()) {
             return result.get();
         }
         return null;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }
}
