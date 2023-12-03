package com.example.www_week6.services;

import com.example.www_week6.models.PostComment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CommentService {
    PostComment Save(PostComment post);
    List<PostComment> findByPost(Long Post);
    Optional<PostComment> findById(Long id);

    List<PostComment> findAllPost(Long id);
    List<PostComment> findByCom(Long id);
}
