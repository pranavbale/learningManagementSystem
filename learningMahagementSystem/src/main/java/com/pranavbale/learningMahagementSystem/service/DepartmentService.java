package com.pranavbale.learningMahagementSystem.service;

import com.pranavbale.learningMahagementSystem.DAORepositry.DepartmentRepository;
import com.pranavbale.learningMahagementSystem.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department save(Department dept) {
        return departmentRepository.save(dept);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    public List<Department> getAllDepartment() {
        List<Department> departmentsList;
        departmentsList = (List<Department>) departmentRepository.findAll();
        return departmentsList;
    }

    public Department updateDepartment(Department department, Long id) {
        Department dept = departmentRepository.findById(id).get();
        if(!dept.getDeptName().equals(department.getDeptName())) {
            dept.setDeptName(department.getDeptName());
        }
        if (!dept.getDeptEmail().equals(department.getDeptEmail())) {
            dept.setDeptEmail(department.getDeptEmail());
        }
        return departmentRepository.save(dept);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
