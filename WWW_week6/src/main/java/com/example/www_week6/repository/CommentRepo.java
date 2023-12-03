package com.example.www_week6.repository;

import com.example.www_week6.controller.CommentControll;
import com.example.www_week6.models.Post;
import com.example.www_week6.models.PostComment;
import com.example.www_week6.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepo extends JpaRepository<PostComment,Long> {
    List<PostComment> findByPost(Post po);
    List<PostComment> findByParent(PostComment post);

    @Query("SELECT p FROM PostComment p WHERE p.parent IS NULL and p.post.id=:id")
    List<PostComment> findAllNotPost(Long id);
    @Query("SELECT p FROM PostComment p WHERE p.parent.id =:id")
    List<PostComment> findAllByCom(Long id);
}
