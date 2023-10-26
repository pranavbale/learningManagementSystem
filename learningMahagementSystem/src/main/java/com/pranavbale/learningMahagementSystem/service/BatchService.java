package com.pranavbale.learningMahagementSystem.service;

import com.pranavbale.learningMahagementSystem.DAORepositry.BatchRepository;
import com.pranavbale.learningMahagementSystem.entity.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchService {

    @Autowired
    BatchRepository batchRepository;


    public Batch saveBatch(Batch batch) {
        return batchRepository.save(batch);
    }

    public List<Batch> findAllBatch() {
        List<Batch> allBatches = (List<Batch>) batchRepository.findAll();
        return allBatches;
    }

    public Batch findBatchById(Long id) {
        Batch batch = batchRepository.findById(id).get();
        return batch;
    }

    public Batch updateBatch(Batch newBatch, Long id) {
        Batch oldBatch = batchRepository.findById(id).get();

        if (!oldBatch.getBatchName().equals(newBatch.getBatchName())) {
            oldBatch.setBatchName(newBatch.getBatchName());
        }

        if (!oldBatch.getTrainerName().equals(newBatch.getTrainerName())) {
            oldBatch.setTrainerName(newBatch.getTrainerName());
        }

        if (!oldBatch.getNoOfStudent().equals(newBatch.getNoOfStudent())) {
            oldBatch.setNoOfStudent(newBatch.getNoOfStudent());
        }

        return batchRepository.save(oldBatch);

    }

    public void deleteBatch(Long id) {
        batchRepository.deleteById(id);
    }
}
