package com.Rovshan.SiyahiApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Rovshan.SiyahiApp.Model.Users;
import com.Rovshan.SiyahiApp.Service.UserService;

@RestController
@RequestMapping("/api")        // ← makes URL versioning easier later
public class UsersController {

    private final UserService service;

    @Autowired
    public UsersController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Users register(@Validated @RequestBody Users dto) {
        return service.register(dto);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return  service.verify(user);
        
    }
}
