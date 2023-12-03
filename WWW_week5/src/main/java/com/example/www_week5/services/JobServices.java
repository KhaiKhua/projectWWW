package com.example.www_week5.services;

import com.example.www_week5.entities.Job;

import com.example.www_week5.entities.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface JobServices {
    List<Job> getAll();
    Optional<Job> findbyId(Long id);
    List<Job> getJobbySkillId(Long id);
    List<Job> getJobbyComId(Long id);
  
}
