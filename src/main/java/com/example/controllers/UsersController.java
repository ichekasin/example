package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.User;
import com.example.domain.repos.UsersRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(path="/registration")
    public @ResponseBody
    String addNewUser (@RequestParam String login, String password, String email) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);
        usersRepository.save(user);
        return "Successful registration new user: " + login;
    }

    @GetMapping(path="/allUsers")
    public @ResponseBody Iterable<User> getAllUsers() {
        return usersRepository.findAll();
    }

    /*@RequestMapping(path="/login")
    public String registration(@RequestParam String name, String password) {
        return "";
    }*/



}
