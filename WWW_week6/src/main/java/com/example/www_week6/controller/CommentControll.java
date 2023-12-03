package com.example.www_week6.controller;

import com.example.www_week6.dto.CommentDto;
import com.example.www_week6.models.Post;
import com.example.www_week6.models.PostComment;
import com.example.www_week6.models.User;
import com.example.www_week6.services.CommentService;
import com.example.www_week6.services.PostService;
import com.example.www_week6.services.UserService;
import jakarta.servlet.RequestDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/comment")
public class CommentControll {
    @Qualifier("commenImple")
    @Autowired
    private CommentService service;

    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;
    @GetMapping("/{id}/{idUser}")
    public String View(@PathVariable("id") Long id, @PathVariable("idUser") Long idUser, Model model){
        Optional<Post> p= postService.findById(id);
//        System.out.println(p.get());
        model.addAttribute("post",p.get());
        List<PostComment> li = service.findAllPost(id);
        List<CommentDto> list = new ArrayList<>();
        for(PostComment po: li){
            CommentDto dto= new CommentDto();
            List<PostComment> ds = ViewCon(po.getId());
            dto.setComments(ds);
            dto.setPostComment(po);
            list.add(dto);
        }
        model.addAttribute("list",li);
        model.addAttribute("ds",list);


        return "View";
    }

    public List<PostComment> ViewCon( Long idCom){

        List<PostComment> li = service.findByCom(idCom);
//        model.addFlashAttribute("ds",li);
        return li;
    }
    @PostMapping("/input/{id}/{idUser}")
    public String Input(@PathVariable("id") Long id, @PathVariable("idUser") Long idUser, @ModelAttribute("title") String title){
//       String title = (String) model.getAttribute("title");
        Optional<Post> p= postService.findById(id);
        Optional<User> u =userService.findById(idUser);
       PostComment com = new PostComment(title,true,null,p.get(),u.get() );
      service.Save(com);
           return "redirect:/comment/"+id+"/"+idUser;
    }
    boolean n = false;
    @GetMapping ("/reInput/{idCom}/{id}/{idUser}")
    public String reInput(@PathVariable("id") Long id, @PathVariable("idUser") Long idUser, @PathVariable("idCom") Long idCom, @ModelAttribute("title") String title, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("idCom",idCom);
        if(n==false) n= true;
        else  n= false;
        redirectAttributes.addFlashAttribute("n",n);
        return "redirect:/comment/"+id+"/"+idUser;
    }
    @PostMapping("/input/{idCom}/{id}/{idUser}")
    public String InputComment(@PathVariable("idCom") Long idCom,@PathVariable("id") Long id, @PathVariable("idUser") Long idUser, @ModelAttribute("title") String title){
        //String title = (String) model.getAttribute("title");
        Optional<Post> p= postService.findById(id);
        Optional<User> u =userService.findById(idUser);
        Optional<PostComment> c = service.findById(idCom);
        PostComment com = new PostComment(title,true,c.get(),p.get(),u.get() );
        service.Save(com);
        return "redirect:/comment/"+id+"/"+idUser;
    }
}
