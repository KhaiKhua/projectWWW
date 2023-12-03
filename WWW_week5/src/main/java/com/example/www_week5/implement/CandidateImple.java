package com.example.www_week5.implement;

import com.example.www_week5.entities.Candidate;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.repository.CandidateRepo;
import com.example.www_week5.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CandidateImple  implements  CandidateService{
    @Autowired
    private CandidateRepo repo;

    @Override
    public List<Candidate> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Candidate> findbyId(Long id) {
        return repo.findById(id);
    }



    @Override
    public Optional<Candidate> getbyUserId(String user) {
        return  repo.getByUserId(user);
    }

    @Override
    public List<Candidate> getbySkillId(Long id) {
        return repo.getBySkillId(id);
    }

}
