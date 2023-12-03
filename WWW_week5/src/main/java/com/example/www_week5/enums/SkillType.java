package com.example.www_week5.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SkillType {
    SOFT_SKILL(0),
    UNSPECIFIC(1),
    TECHNICAL_SKILL(2);
    private int skill;

}
