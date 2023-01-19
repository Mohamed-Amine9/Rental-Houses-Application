package com.example.demo.Entity.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/registration/token={token}")
@RestController
public class UserController {
    @Autowired
    AppUserRepository repository;
    //get methods
    @GetMapping("/getUserById/{id}")
    public AppUser getUserById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }


}
