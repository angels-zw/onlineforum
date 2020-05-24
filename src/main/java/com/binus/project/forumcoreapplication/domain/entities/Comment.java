package com.binus.project.forumcoreapplication.domain.entities;


import com.binus.project.forumcoreapplication.domain.models.CreateCommentRequest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@TableGenerator(name = "comment_id_generator",
        table = "id_generator",
        pkColumnName = "id_name",
        pkColumnValue = "comment",
        valueColumnName = "id_value")

@Getter
@Setter
public class Comment {


    @Id
    @GeneratedValue(generator = "comment_id_generator")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String author;
    @Column(name = "name", nullable = false, length = 300)
    private String commentBody;
    @ManyToOne
    private Article article;

    public Comment() {
    }

    public Comment(String author, String commentBody, Article article) {
        this.author = author;
        this.commentBody = commentBody;
        this.article = article;
    }

    public static Comment createComment(CreateCommentRequest createCommentRequest) {
       return  null;
    }
}
