package com.pranavbale.learningMahagementSystem.DAORepositry;

import com.pranavbale.learningMahagementSystem.entity.Batch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends CrudRepository<Batch, Long> {
}
