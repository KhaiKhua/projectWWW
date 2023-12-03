package com.example.www_week5.services;

import com.example.www_week5.entities.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SkillService {
    List<Skill> getAll();
    Optional<Skill> findbyId(Long id);

    List<Skill> getbyJonId(Long id);
    List<Skill> getbyCanId(Long id);
    List<Skill> getbyComId(Long id);

}
