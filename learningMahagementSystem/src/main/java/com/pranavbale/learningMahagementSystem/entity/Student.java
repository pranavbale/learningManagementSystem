package com.pranavbale.learningMahagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private  String name;

    private String email;

    private Long phoneNumber;

    private  String course;
}
