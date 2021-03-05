package br.com.gabrielle.springlab.controllers;

import br.com.gabrielle.springlab.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @GetMapping()
    public ResponseEntity<User> findAll() {
        User user = new User(1, "Gabrielle", "gabrielleemanoela@gmail.com", "587154446", "6958");
        return ResponseEntity.ok().body(user);

    }
}
