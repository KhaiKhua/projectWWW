package com.example.www_week5.repository;

import com.example.www_week5.entities.JobSkill;
import com.example.www_week5.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepo extends JpaRepository<Skill,Long> {
    @Query("select K from Skill  K join JobSkill J ON K.id=J.skill.id where J.job.id =:id")
    List<Skill> getSkillByJobId (@Param("id") Long id);
    @Query("select K from Skill  K join CandidateSkill C ON K.id=C.skill.id where C.candidate.id =:id")
    List<Skill> getSkillByCanId (@Param("id") Long id);
}
