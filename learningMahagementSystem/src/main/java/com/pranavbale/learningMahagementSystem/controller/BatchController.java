package com.pranavbale.learningMahagementSystem.controller;

import com.pranavbale.learningMahagementSystem.entity.Batch;
import com.pranavbale.learningMahagementSystem.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    BatchService batchService;

    @PostMapping("/save")
    private Batch saveBatch(@RequestBody Batch batch) {
        return batchService.saveBatch(batch);
    }

    @GetMapping("findAll")
    private List<Batch> findAllBatch() {
        return batchService.findAllBatch();
    }

    @GetMapping("findById/{id}")
    private Batch findBatchById(@PathVariable Long id) {
        return batchService.findBatchById(id);
    }

    @PutMapping("update/{id}")
    private Batch updateBatch(@RequestBody Batch batch, @PathVariable Long id) {
        return batchService.updateBatch(batch, id);
    }

    @DeleteMapping("delete/{id}")
    private String deleteBatch(@PathVariable Long id) {
        batchService.deleteBatch(id);
        return "Batch deleted Successfully";
    }
}
