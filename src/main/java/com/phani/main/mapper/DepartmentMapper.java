package com.phani.main.mapper;

import com.phani.main.dto.DepartmentDto;
import com.phani.main.model.Department;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DepartmentMapper {

    ModelMapper mapper = new ModelMapper();

    public DepartmentDto mapToDto(Department department) {
        return mapper.map(department, DepartmentDto.class);
    }

    public Department mapToDepartment(DepartmentDto departmentDto) {
        return mapper.map(departmentDto, Department.class);
    }

    public List<DepartmentDto> mapToDTOs(List<Department> departmentList) {
        return departmentList.stream().map( d -> mapToDto(d)).collect(Collectors.toList());
    }
}
