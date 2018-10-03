package com.example.controllers;

import com.example.domain.Post;
import com.example.domain.User;
import com.example.domain.repos.PostsRepository;
import com.example.domain.repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsController {

    @Autowired
    private PostsRepository postsRepository;

    @GetMapping(path="/createPost")
    public @ResponseBody
    String createNewPost (@RequestParam String author, String content) {
        Post post = new Post();
        post.setAuthor(author);
        post.setContent(content);
        postsRepository.save(post);
        return "Successful create new post";
    }

    @GetMapping(path="/allPosts")
    public @ResponseBody Iterable<Post> getAllPosts() {
        return postsRepository.findAll();
    }

}
