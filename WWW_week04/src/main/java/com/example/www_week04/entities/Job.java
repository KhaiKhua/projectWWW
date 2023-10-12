package com.example.www_week04.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long id;
    @Column(name = "job_name")
    private String name;
    @Column(name = "job_desc",columnDefinition = "varchar(2000)")
    private String description;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
}
