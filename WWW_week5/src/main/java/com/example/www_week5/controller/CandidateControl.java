package com.example.www_week5.controller;

import com.example.www_week5.entities.Candidate;
import com.example.www_week5.entities.Job;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.services.CandidateService;
import com.example.www_week5.services.JobServices;
import com.example.www_week5.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/candidate")
public class CandidateControl {
    @Qualifier("candidateImple")
    @Autowired
    private CandidateService canService;
    @Autowired
    private SkillService skillService;
    @Qualifier("jobImple")
    @Autowired
    private JobServices jobService;

    @GetMapping("/getjob/{id}")
    public String getJob(Model model, @PathVariable("id") String id) {
        Optional<Candidate> c = canService.getbyUserId(id);
        if (c.isPresent()) {
            List<Skill> l = skillService.getbyCanId(c.get().getId());
            Set<Job> list = new HashSet<>();
            for (Skill k : l) {
                List<Job> li = jobService.getJobbySkillId(k.getId());
                for(Job j:li) {
                    System.out.println("job"+j);
                    list.add(j);
                }
            }

            model.addAttribute("danhsach", list);
            model.addAttribute("id",c.get().getId());
            return "cau2";
        }
        return "error";
    }

}
