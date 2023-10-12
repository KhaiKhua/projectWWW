package com.example.www_week04.entities;

import com.example.www_week04.enums.SkillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Kill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(150)")
    private String nameKill;
    private String skillDescription;
    @Column(columnDefinition = "tinyint(4)")
    @Enumerated(EnumType.ORDINAL)
    private SkillType skillType;
}
