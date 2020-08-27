package com.phani.main.service;

import com.phani.main.dao.DepartmentRepository;
import com.phani.main.dto.DepartmentDto;
import com.phani.main.mapper.DepartmentMapper;
import com.phani.main.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department saveDepartment(DepartmentDto departmentDto) {
        return departmentRepository.save(departmentRepository.save(departmentMapper.mapToDepartment(departmentDto)));
    }

    @Override
    public Department getDepartment(Long id) {
        Optional<Department> result = departmentRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }
        return null;
    }

    @Override
    public List<Department> getDepartmentList() {
        return departmentRepository.findAll();
    }
}
