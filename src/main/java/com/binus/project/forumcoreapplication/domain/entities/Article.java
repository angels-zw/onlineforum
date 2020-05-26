package com.binus.project.forumcoreapplication.domain.entities;


import com.binus.project.forumcoreapplication.domain.models.CreateArticleRequest;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "article")
@TableGenerator(name = "article_id_generator",
        table = "id_generator",
        pkColumnName = "id_name",
        pkColumnValue = "article",
        valueColumnName = "id_value")
public class Article {
    @Id
    @GeneratedValue(generator = "article_id_generator")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    private Date dateCreated;
    @Column(name = "name", nullable = false, length = 50)
    private String title;
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Column(name = "likes")
    private Long likes;
    @Column(name = "article_body", nullable = false, length = 500)
    private String articleBody;

    public Article() {
    }

    public Article(String title, String username, String articleBody) {
        this.title = title;
        this.username = username;
        this.articleBody = articleBody;
    }

   public static Article  createArticle(CreateArticleRequest createArticleRequest) {
     return new Article(createArticleRequest.getTitle(),createArticleRequest.getUsername() ,createArticleRequest.getArticleBody());
    }

    @PrePersist
    public void onCreate() {
        dateCreated = new Date();
        this.setLikes(0L);
    }

    @PreUpdate
    public void onUpdate() {

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }
}
