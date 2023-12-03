package com.example.www_week5.controller;


import com.example.www_week5.entities.Candidate;
import com.example.www_week5.entities.Company;
import com.example.www_week5.entities.Job;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.implement.CandidateImple;
import com.example.www_week5.implement.CompanyImple;
import com.example.www_week5.implement.JobImple;
import com.example.www_week5.implement.SkillImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/company")
public class CompanyControll {
    @Autowired
    private CompanyImple comimple;
    @Autowired
    private SkillImple skillImple;
    @Autowired
    private JobImple jobImple;
    @Autowired
    private CandidateImple canImple;
    @GetMapping("/cau3")
    public String getC(){
        return "cau3";
    }

    @PostMapping("/getcandidate")
    public String getCandidate(@RequestParam("id") Long id, Model model) {

        Set<Candidate> setCan = new HashSet<>();
        Optional<Company> c = comimple.findbyId(id);
        if (c.isPresent()) {
            List<Job> l = jobImple.getJobbyComId(c.get().getId());

            for (Job j : l) {
                List<Skill> li = skillImple.getbyJonId(j.getId());
                for (Skill k : li) {
                    List<Candidate> list = canImple.getbySkillId(k.getId());
                    for (Candidate can : list) {
                        System.out.println(can);
                        setCan.add(can);
                    }
                }
            }
            model.addAttribute("setCan",setCan);
            return "cau3";
        }
        return "error";
    }
    @PostMapping("/getId")
    public String getId(@RequestParam("id") Long id){

        return "redirect:/company/getcandidate/"+ id;
    }
}
