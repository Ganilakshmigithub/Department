package com.gani.Department.Services;


import com.gani.Department.Repository.DepartmentRepository;
import com.gani.Department.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }
}
