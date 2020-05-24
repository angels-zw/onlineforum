package com.binus.project.forumcoreapplication.domain.entities;


import com.binus.project.forumcoreapplication.domain.models.CreateArticleRequest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "article")
@TableGenerator(name = "article_id_generator",
        table = "id_generator",
        pkColumnName = "id_name",
        pkColumnValue = "article",
        valueColumnName = "id_value")
@Setter
@Getter
public class Article {
    @Id
    @GeneratedValue(generator = "article_id_generator")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    private Date dateCreated;
    @Column(name = "name", nullable = false, length = 50)
    private String title;
    @Column(name = "name", nullable = false, length = 50)
    private String author;
    @Column(name = "likes")
    private BigDecimal likes;
    @Column(name = "name", nullable = false, length = 500)
    private String articleBody;

    public Article() {
    }

    public Article(String title, String author, BigDecimal likes, String articleBody) {
        this.title = title;
        this.author = author;
        this.likes = likes;
        this.articleBody = articleBody;
    }

   public static Article  createArticle(CreateArticleRequest createArticleRequest) {
     return null;
    }
}
