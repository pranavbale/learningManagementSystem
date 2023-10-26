package com.pranavbale.learningMahagementSystem.controller;

import com.pranavbale.learningMahagementSystem.entity.Student;
import com.pranavbale.learningMahagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/find/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping("/save")
    public Student cteateStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return  "Student deleted successfully id : " + id;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);

    }

}
