package br.com.gabrielle.springlab.controllers;

import br.com.gabrielle.springlab.entities.User;
import br.com.gabrielle.springlab.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Daqui adiante eu posso por /users
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    //mapeando todos users
    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();

    }

    //mapeando apenas 1.

    @GetMapping("/user/{id}")
    public User listaunica (@PathVariable(value = "id")Integer id) {
        return userRepository.findById(id);

    }
}
