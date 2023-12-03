package com.example.www_week5.dto;

import com.example.www_week5.entities.Company;
import com.example.www_week5.entities.Job;
import com.example.www_week5.entities.Skill;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class JobSkillDTO {
    private Job job;
    private List<Skill> skills;
}
