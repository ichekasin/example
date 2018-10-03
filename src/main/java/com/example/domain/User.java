package com.example.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String login;
    private String password;
    private String role;
    private String email;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author")
    private Set<Post> posts;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }

    public Set<Post> getPost() {
        return posts;
    }

    public void setPost(Set<Post> posts) { this.posts = posts; }
}
