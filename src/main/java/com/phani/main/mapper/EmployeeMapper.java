package com.phani.main.mapper;

import com.phani.main.dto.EmployeeDto;
import com.phani.main.model.Department;
import com.phani.main.model.Employee;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    ModelMapper mapper = new ModelMapper();

    PropertyMap<Employee, EmployeeDto> employeeDtoPropertyMap = new PropertyMap<Employee, EmployeeDto>() {
        @Override
        protected void configure() {
            map().setDepartmentNo(source.getDepartment().getId());
        }
    };

    PropertyMap<EmployeeDto, Employee> employeePropertyMap = new PropertyMap<EmployeeDto, Employee>() {
        @Override
        protected void configure() {
            map().setDepartment(new Department(source.getDepartmentNo()));
        }
    };

    public EmployeeDto mapToDto(Employee employee) {
        mapper.addMappings(employeeDtoPropertyMap);
        return mapper.map(employee, EmployeeDto.class);
    }

    public Employee mapToEmployee(EmployeeDto employeeDto) {
        mapper.addMappings(employeePropertyMap);
        return mapper.map(employeeDto, Employee.class);
    }
}
