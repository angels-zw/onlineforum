package com.binus.project.forumcoreapplication.domain.models;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CreateArticleRequest {

     String title;

     String author;

     BigDecimal likes;

     String articleBody;
}
