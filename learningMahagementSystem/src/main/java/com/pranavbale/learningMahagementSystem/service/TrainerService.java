package com.pranavbale.learningMahagementSystem.service;

import com.pranavbale.learningMahagementSystem.DAORepositry.TrainerRepository;
import com.pranavbale.learningMahagementSystem.entity.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    @Autowired
    TrainerRepository trainerRepository;

    public Trainer saveTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public List<Trainer> getAllTrainer() {
        return (List<Trainer>) trainerRepository.findAll();
    }

    public Trainer findById(Long id) {
        return trainerRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        trainerRepository.deleteById(id);
    }

    public Trainer updateTrainer(Trainer newTrainer, Long id) {
        Trainer oldTrainer = trainerRepository.findById(id).get();

        if(!oldTrainer.getName().equals(newTrainer.getName())) {
            oldTrainer.setName(newTrainer.getName());
        }

        if(!oldTrainer.getDepartment().equals(newTrainer.getDepartment())) {
            oldTrainer.setDepartment(newTrainer.getDepartment());
        }

        return trainerRepository.save(oldTrainer);
    }
}
