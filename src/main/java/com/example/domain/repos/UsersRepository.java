package com.example.domain.repos;

import com.example.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {}
