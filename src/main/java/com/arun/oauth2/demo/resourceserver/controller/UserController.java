package com.arun.oauth2.demo.resourceserver.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/status/check")
    public String getStatus(){
        return "Working...";
    }

    @Secured("ROLE_developer")
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        return "Deleted user with id "+id;
    }
}
