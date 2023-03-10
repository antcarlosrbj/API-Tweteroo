package com.tweteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.model.Users;
import com.tweteroo.api.repository.UsersRepository;

@RestController
@RequestMapping("/sign-up")
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @GetMapping
    public List<Users> getUsers() {
        return repository.findAll();
    }
    
    @PostMapping
    public void addUser(@RequestBody UserDTO req) {
        repository.save(new Users(req));
    }
}
