package com.pranavbale.learningMahagementSystem.controller;

import com.pranavbale.learningMahagementSystem.entity.Department;
import com.pranavbale.learningMahagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Document;
import java.util.List;


@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/save")
    private Department save(@RequestBody Department dept) {
        return departmentService.save(dept);
    }

    @GetMapping("/getById/{id}")
    private Department getDepartmentById(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/getAll")
    private List<Department>  getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @PutMapping("/update/{id}")
    private Department updateDepartment(@RequestBody Department department, @PathVariable Long id){
        return departmentService.updateDepartment(department, id);
    }

    @DeleteMapping("/delete/{id}")
    private String depeteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        return "Department deleted Successfully";
    }
}
