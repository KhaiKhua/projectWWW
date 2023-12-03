package com.example.www_week6.implement;

import com.example.www_week6.models.Post;
import com.example.www_week6.models.PostComment;
import com.example.www_week6.repository.CommentRepo;
import com.example.www_week6.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CommenImple implements CommentService {
    @Autowired
    private CommentRepo repo;
    @Override
    public PostComment Save(PostComment post) {
        return repo.save(post);
    }

    @Override
    public List<PostComment> findByPost(Long Po) {
        Post p = new Post(Po);
        return repo.findByPost(p);
    }

    @Override
    public Optional<PostComment> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<PostComment> findAllPost(Long id) {
        return repo.findAllNotPost( id);
    }

    @Override
    public List<PostComment> findByCom(Long id) {
        return repo.findAllByCom(id);
    }
}
