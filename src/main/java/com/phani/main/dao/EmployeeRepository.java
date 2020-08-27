package com.phani.main.dao;

import com.phani.main.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Override
    List<Employee> findAll();

    @Override
    Optional<Employee> findById(Long id);
}
