package com.binus.project.forumcoreapplication.domain.models;



public class CreateArticleRequest {

     String title;

     String username;

     String articleBody;

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





     public String getArticleBody() {
          return articleBody;
     }

     public void setArticleBody(String articleBody) {
          this.articleBody = articleBody;
     }
}
