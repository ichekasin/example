package com.example.domain;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String content;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private User author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() { return content; }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(String author) {this.author.setLogin(author);
    }

}
