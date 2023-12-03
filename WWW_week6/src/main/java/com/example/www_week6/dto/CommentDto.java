package com.example.www_week6.dto;

import com.example.www_week6.models.Post;
import com.example.www_week6.models.PostComment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private PostComment postComment;
    private List<PostComment> comments;
}
