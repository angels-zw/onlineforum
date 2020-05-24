package com.binus.project.forumcoreapplication.service;

import com.binus.project.forumcoreapplication.domain.entities.Article;
import com.binus.project.forumcoreapplication.domain.entities.Comment;
import com.binus.project.forumcoreapplication.domain.models.CreateArticleRequest;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticle(Long articleId);
    Article createArticle(CreateArticleRequest createArticleRequest);
    void    deleteArticle (Long articleId ,Long authorId);
    void    likeArticle(Long articleId ,Long authorId);
}
