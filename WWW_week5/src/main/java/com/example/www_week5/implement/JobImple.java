package com.example.www_week5.implement;

import com.example.www_week5.entities.Job;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.repository.JobRepo;
import com.example.www_week5.repository.SkillRepo;
import com.example.www_week5.services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JobImple implements JobServices {
    @Autowired
    private JobRepo repo;
    @Autowired
    private SkillRepo skillRepo;

    @Override
    public List<Job> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Job> findbyId(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Job> getJobbySkillId(Long id) {
        return repo.getSkillBySkillId(id);
    }

    @Override
    public List<Job> getJobbyComId(Long id) {
        return repo.getJobByComId(id);
    }


}
