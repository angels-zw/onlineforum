package com.binus.project.forumcoreapplication.domain.models;

import lombok.Data;

@Data
public class CreateCommentRequest {


     String author;
     String commentBody;
     Long articleId;
}
