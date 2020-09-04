package com.phani.main.controller;

import com.phani.main.dto.DepartmentDto;
import com.phani.main.mapper.DepartmentMapper;
import com.phani.main.model.Department;
import com.phani.main.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentMapper departmentMapper;

    @PostMapping(value = "/department", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> addEmployee(@RequestBody DepartmentDto departmentDto) {
        return new ResponseEntity<>(departmentService.saveDepartment(departmentDto), HttpStatus.OK);
    }

    @GetMapping(value = "/department/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> getEmployee(@PathVariable Long id) {
        return new ResponseEntity<>(departmentService.getDepartment(id), HttpStatus.OK);
    }

    @GetMapping(value = "/department/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DepartmentDto>> getEmployee() {
        List<DepartmentDto> departmentDtos = departmentMapper.mapToDTOs(departmentService.getDepartmentList());
        return new ResponseEntity<>(departmentDtos, HttpStatus.OK);
    }

}
