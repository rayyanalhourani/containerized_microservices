package com.AuthenticationService.controller;

import com.AuthenticationService.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/")
    public String Auth(@RequestBody User user){
        if (user.getUsername().equals("admin") && user.getPassword().equals("admin")){
            return "valid";
        }
        return "invalid";
    }


}
