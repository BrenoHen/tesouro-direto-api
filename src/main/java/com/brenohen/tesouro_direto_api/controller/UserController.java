package com.brenohen.tesouro_direto_api.controller;

import com.brenohen.tesouro_direto_api.model.User;
import com.brenohen.tesouro_direto_api.repository.UserRepository;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    @RequestMapping("save")
    public User salvar(@RequestBody User user) {
        System.out.println("Usuário salvo: " + user);

        var id = UUID.randomUUID().toString();
        user.setId(id);

        userRepository.save(user);
        return user;
    }

    @GetMapping
    @RequestMapping("busca/{id}")
    public User buscaUserPorId(@PathVariable("id") String id){
        return userRepository.findById(id).orElse(null);
    }
}
