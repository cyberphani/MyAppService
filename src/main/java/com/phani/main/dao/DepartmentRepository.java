package com.phani.main.dao;

import com.phani.main.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
    @Override
    List<Department> findAll();

    @Override
    Optional<Department> findById(Long id);
}
