package com.example.www_week04.entities;

import com.example.www_week04.enums.SkillLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Candidatekill {
    @Entity
    @Table(name = "candidateSkill")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class CandidateSkill {
        @Id
        @ManyToOne
        @JoinColumn(name = "skill_id")
        private Kill skill;
        @Id
        @ManyToOne
        @JoinColumn(name = "can_id")
        private Candidate candidate;
        @Column(name = "skill_level",columnDefinition = "tinyint(4)")
        @Enumerated(EnumType.ORDINAL)
        private SkillLevel skillLevel;
        @Column(name = "more_infos",columnDefinition = "varchar(1000)")
        private String moreInfo;


    }
}
