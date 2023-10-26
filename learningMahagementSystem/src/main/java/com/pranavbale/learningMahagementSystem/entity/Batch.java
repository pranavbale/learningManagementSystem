package com.pranavbale.learningMahagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Batch {
    @Id
    @GeneratedValue
    private Long id;
    private String batchName;
    private String trainerName;
    private Integer noOfStudent;
}
