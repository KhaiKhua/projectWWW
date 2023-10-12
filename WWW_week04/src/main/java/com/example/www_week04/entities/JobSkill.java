package com.example.www_week04.entities;

import com.example.www_week04.enums.SkillLevel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Kill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Column(name = "more_infos",columnDefinition = "varchar(1000)")
    private String moreInfo;
    @Column(name = "skill_level",columnDefinition = "tinyint(4)")
    @Enumerated(EnumType.ORDINAL)
    private SkillLevel skillLevel;

}
