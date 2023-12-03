package com.example.www_week6.controller;

import com.example.www_week6.models.User;
import com.example.www_week6.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserControll {
    @Qualifier("userImple")
    @Autowired
    private UserService service;

    @GetMapping("/login")
    public String signUp(Model model){
        User u = new User();
        model.addAttribute("user",u);
        return "login";
    }
    @PostMapping("/login/valid")
    public String login(@ModelAttribute("user") User user){
        Optional<User> u = service.findByEmail(user.getEmail());
        if(u.isPresent()){
           if(u.get().getPasswordHash().equals(user.getPasswordHash()))
               return  "redirect:/post/"+u.get().getId();
        }
        return  "index";
    }

}
