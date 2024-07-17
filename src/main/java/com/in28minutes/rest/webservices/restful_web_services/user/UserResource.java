package com.in28minutes.rest.webservices.restful_web_services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    //GET /users
    //retrieveAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    //GET /users/{id}
    //retrieveUser(int id)
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        User savedUser = service.save(user);
    }

}
