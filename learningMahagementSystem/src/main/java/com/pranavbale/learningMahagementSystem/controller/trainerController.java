package com.pranavbale.learningMahagementSystem.controller;

import com.pranavbale.learningMahagementSystem.entity.Trainer;
import com.pranavbale.learningMahagementSystem.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trainer")
public class trainerController {

    @Autowired
    TrainerService trainerService;

    @PostMapping("/save")
    private Trainer saveTrainer(@RequestBody Trainer trainer) {
        return trainerService.saveTrainer(trainer);
    }

    @GetMapping("/getAll")
    private List<Trainer> getAllTrainer() {
        return trainerService.getAllTrainer();
    }

    @GetMapping("/findById/{id}")
    private Trainer findById(@PathVariable Long id) {
        return trainerService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    private String deleteById(@PathVariable Long id) {
        trainerService.deleteById(id);
        return "Trainer deleted successfully";
    }

    @PutMapping("/update/{id}")
    private Trainer updateTrainer (@RequestBody Trainer trainer, @PathVariable Long id) {
        return trainerService.updateTrainer(trainer, id);
    }

    
}
