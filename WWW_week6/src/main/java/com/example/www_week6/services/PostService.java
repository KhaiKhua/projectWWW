package com.example.www_week6.services;

import com.example.www_week6.models.Post;
import com.example.www_week6.models.PostComment;
import com.example.www_week6.models.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PostService {
    Post save(Post u);
    List<Post> getAll();
    Page<Post> findPage(int pageNo,int pageSize,String sortBy, String sortDirection);
    Optional<Post> findById(Long id);
}
