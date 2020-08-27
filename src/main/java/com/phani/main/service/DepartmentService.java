package com.phani.main.service;

import com.phani.main.dto.DepartmentDto;
import com.phani.main.model.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(DepartmentDto departmentDto);

    public Department getDepartment(Long id);

    public List<Department> getDepartmentList();
}
