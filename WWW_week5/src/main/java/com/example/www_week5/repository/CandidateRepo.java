package com.example.www_week5.repository;

import com.example.www_week5.entities.Candidate;
import com.example.www_week5.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate,Long> {
   @Query("select c from Candidate c where c.user.userName=:user")
    Optional<Candidate> getByUserId( @Param("user") String user);
    @Query("select c from Candidate c join CandidateSkill s ON c.id=s.candidate.id where s.skill.id=:id")
    List<Candidate> getBySkillId( @Param("id") Long id);
}
