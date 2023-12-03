package com.example.www_week5.repository;

import com.example.www_week5.entities.Job;
import com.example.www_week5.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<Job,Long> {
    @Query("select J from Job  J join JobSkill K ON  J.id=K.job.id where K.skill.id =:id")
    List<Job> getSkillBySkillId (@Param("id") Long id);
    @Query("select J from Job  J  where J.company.id =:id")
    List<Job> getJobByComId (@Param("id") Long id);
}
