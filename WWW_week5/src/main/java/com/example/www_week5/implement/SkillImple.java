package com.example.www_week5.implement;

import com.example.www_week5.entities.Skill;
import com.example.www_week5.repository.SkillRepo;
import com.example.www_week5.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SkillImple implements SkillService {
    @Autowired
    private SkillRepo repo;

    @Override
    public List<Skill> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Skill> findbyId(Long id) {
        return repo.findById(id);
    }


    @Override
    public List<Skill> getbyJonId(Long id) {
        return repo.getSkillByJobId(id);
    }

    @Override
    public List<Skill> getbyCanId(Long id) {
        return repo.getSkillByCanId(id);
    }

    @Override
    public List<Skill> getbyComId(Long id) {
        return repo.getSkillByJobId(id);
    }

}
