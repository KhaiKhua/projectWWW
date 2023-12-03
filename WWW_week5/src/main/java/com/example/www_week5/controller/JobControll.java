package com.example.www_week5.controller;

import com.example.www_week5.dto.JobSkillDTO;
import com.example.www_week5.entities.Job;

import com.example.www_week5.entities.Skill;
import com.example.www_week5.services.JobServices;
import com.example.www_week5.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class JobControll {
    @Qualifier("jobImple")
    @Autowired
    private JobServices jobService;
    @Autowired
    private SkillService skillService;
    @GetMapping()
    public String getAll(Model model){
        List<Job> l = jobService.getAll();
        List<JobSkillDTO> list= new ArrayList<>();
        for(Job j:l){
                    List<Skill> li = skillService.getbyJonId(j.getId());
                    JobSkillDTO dto= new JobSkillDTO(j,li);
                    list.add(dto);
        }
        model.addAttribute("list",list);
        return  "cau1";
    }
}
