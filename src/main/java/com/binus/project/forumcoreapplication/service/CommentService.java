package com.binus.project.forumcoreapplication.service;

import com.binus.project.forumcoreapplication.domain.entities.Article;
import com.binus.project.forumcoreapplication.domain.entities.Comment;
import com.binus.project.forumcoreapplication.domain.models.CreateArticleRequest;
import com.binus.project.forumcoreapplication.domain.models.CreateCommentRequest;

import java.util.List;

public interface CommentService {




    Comment createComment(CreateCommentRequest createCommentRequest);
    List<Comment> getAllComments(Long articleId);
    void    deleteComment(Long commentId ,Long authorId);
    void    likeComment(Long commentId ,Long authorId);
}
