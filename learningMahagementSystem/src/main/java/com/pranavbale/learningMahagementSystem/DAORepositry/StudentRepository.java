package com.pranavbale.learningMahagementSystem.DAORepositry;

import com.pranavbale.learningMahagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
