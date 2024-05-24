package br.com.rocketseat.todolist.adapters.in.controller;

import br.com.rocketseat.todolist.application.core.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public void create(@RequestBody User user){
        System.out.println(user.getUsername());

    }
}
