package org.example.domain.article;

public class Article {
  public int id;
  public String title;
  public String content;

  public String toString(){
    return "{id: %d, title: '%s',content: '%s'}".formatted(id, title, content);
  }
}
