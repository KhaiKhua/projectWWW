package com.example.www_week5.controller;

import com.example.www_week5.entities.Skill;

import com.example.www_week5.implement.SkillImple;
import com.example.www_week5.services.SkillService;
import com.neovisionaries.i18n.LanguageCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/skill")
public class SkilController {
    @Autowired
    private SkillImple imple;
    @GetMapping("/getSkill/{id}")
    public String getbyCan(Model model, @PathVariable("id") Long id){
        List<Skill> l = imple.getbyCanId(id);
        List<Skill> list = imple.getAll();
        for(Skill k: list){
           for(Skill k2:l){
               if(k2.equals(k)){
                   list.remove(k);
               }
           }
        }
        model.addAttribute("listSkill",list);
        return  "cau4";

    }
}
