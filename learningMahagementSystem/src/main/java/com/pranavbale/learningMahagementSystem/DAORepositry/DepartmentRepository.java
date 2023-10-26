package com.pranavbale.learningMahagementSystem.DAORepositry;

import com.pranavbale.learningMahagementSystem.entity.Department;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
