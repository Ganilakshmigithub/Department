package com.gani.Department.Controllers;


import com.gani.Department.Services.DepartmentService;
import com.gani.Department.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/byid/{id}")
    public Department getDepartmentById(@PathVariable  Long id) {
        return departmentService.getDepartmentById(id);
    }

}
