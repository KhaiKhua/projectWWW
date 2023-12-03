package com.example.www_week5.services;

import com.example.www_week5.entities.Candidate;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CandidateService {
    List<Candidate> getAll();
    Optional<Candidate> findbyId(Long id);


    Optional<Candidate> getbyUserId(String user);
    List<Candidate> getbySkillId(Long id);
}
