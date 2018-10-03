package com.example.domain.repos;

import com.example.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends CrudRepository<Post, Integer> {}
